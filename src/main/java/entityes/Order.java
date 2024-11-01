package entityes;

import java.util.Date;

public class Order {
    private int id;
    private String car_name;
    private double car_price;
    private Date buy_date;

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public void setCar_price(double car_price) {
        this.car_price = car_price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public double getCar_price() {
        return car_price;
    }

    public String getCar_name() {
        return car_name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nInformation of orders: " + "\nID: " + getId() + "\ncar_name: " + getCar_name() +
                "\ncar_price: " + getCar_price() + "\nbuy date: " + getBuy_date() + "\n";
    }
}
