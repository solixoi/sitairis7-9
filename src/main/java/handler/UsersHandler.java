package handler;

import entityes.Order;
import entityes.User;
import entityes.Userdb;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class UsersHandler extends DefaultHandler {

    private Userdb userdb = null;
    private User user = null;

    private Order order = null;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private String currentQName;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {

        if(qName.equalsIgnoreCase("users")){
            userdb = new Userdb();
        } else if(qName.equalsIgnoreCase("user")){
            user = new User();
            user.setId(Integer.parseInt(attributes.getValue("id")));
        } else if(qName.equalsIgnoreCase("order")) {
            order = new Order();
            order.setId(Integer.parseInt(attributes.getValue("id")));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName){

        if (qName.equalsIgnoreCase("name")) {
            user.setName(currentQName);
        } else if (qName.equalsIgnoreCase("car_name")) {
            order.setCar_name(currentQName);
        } else if (qName.equalsIgnoreCase("car_price")) {
            order.setCar_price(Double.parseDouble(currentQName));
        } else if (qName.equalsIgnoreCase("buy_date")) {
            try {
                order.setBuy_date(dateFormat.parse(currentQName));
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        } else if (qName.equalsIgnoreCase("order")) {
            user.addOrder(order);
        } else if (qName.equalsIgnoreCase("user")) {
            userdb.addUser(user);
        } else if (qName.equalsIgnoreCase("users")) {
            System.out.println("Users catalog:");
            System.out.println(userdb.toString());
        }
    }

    @Override
    public void characters(char[] ch, int start, int length){
        currentQName = new String(ch, start, length);
    }
}
