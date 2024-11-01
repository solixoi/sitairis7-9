package entityes;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int id;
    private String name;
    private List<Order> orders;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public User(){
        orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public String getOrders() {
        StringBuilder sb = new StringBuilder();
        for(Order order : orders){
            sb.append(order.toString());
        }
        return sb.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\nName: " + getName() + getOrders();
    }
}
