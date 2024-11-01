package handler;

import entityes.Car;
import entityes.Carsdb;
import entityes.Company;
import entityes.WorkHours;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class CompanyHandler extends DefaultHandler {
    private Company company = null;
    private Carsdb carsdb = null;
    private boolean companyName = false;
    private WorkHours workHours = null;
    private Car car = null;

    private boolean open = false;
    private boolean close = false;

    private boolean car_name = false;
    private boolean car_type =false;
    private boolean price = false;
    private boolean discount = false;

    private String currentQname;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes){
        if(qName.equalsIgnoreCase("company")){
            company = new Company();
        } else if(qName.equalsIgnoreCase("company_name")){
            companyName = true;
        } else if (qName.equalsIgnoreCase("work_hours")){
            workHours = new WorkHours();
        } else if(qName.equalsIgnoreCase("open")){
            open = true;
        } else if(qName.equalsIgnoreCase("close")){
            close = true;
        } else if (qName.equalsIgnoreCase("products")) {
            carsdb = new Carsdb();
        } else if(qName.equalsIgnoreCase("product")){
            car = new Car();
            car.setId(Integer.parseInt(attributes.getValue("id")));
        } else if(qName.equalsIgnoreCase("car_name")){
            car_name = true;
        } else if(qName.equalsIgnoreCase("car_body")){
            car_type = true;
        } else if(qName.equalsIgnoreCase("price")){
            price = true;
        } else if(qName.equalsIgnoreCase("discount")){
            discount = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName){
        if(qName.equalsIgnoreCase("company")){
            System.out.println("Company. Catalog with company");
            System.out.println(company.toString());
        } else if(qName.equalsIgnoreCase("company_name") && companyName){
            company.setCompany_name(currentQname);
            companyName = false;
        } else if(qName.equalsIgnoreCase("work_hours")){
            company.setWorkHours(workHours);
        } else if(qName.equalsIgnoreCase("open") && open){
            workHours.setOpen(currentQname);
            open = false;
        } else if(qName.equalsIgnoreCase("close") && close){
            workHours.setClose(currentQname);
            close = false;
        } else if (qName.equalsIgnoreCase("products")) {
            company.setCarsdb(carsdb);
        } else if(qName.equalsIgnoreCase("product")){
            carsdb.addCar(car);
        } else if(qName.equalsIgnoreCase("car_name") && car_name){
            car.setCar_name(currentQname);
            car_name = false;
        } else if (qName.equalsIgnoreCase("car_body") && car_type) {
            car.setCar_body(currentQname);
            car_type = false;
        } else if(qName.equalsIgnoreCase("price") && price){
            car.setPrice(Double.parseDouble(currentQname));
            price = false;
        } else if(qName.equalsIgnoreCase("discount") && discount){
            car.setDiscount(Double.parseDouble(currentQname));
            discount = false;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length){
        currentQname = new String(ch, start, length);
    }
}
