package entityes;

public class Car {
    private int id;
    private String car_name;
    private String car_body;
    private double price;
    private double discount;

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCar_body(String car_body) {
        this.car_body = car_body;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getCar_body() {
        return car_body;
    }

    public String getCar_name() {
        return car_name;
    }

    @Override
    public String toString() {
        return "\nID: " + getId() + "\ncar_name: " + getCar_name() + "\ncar_body: " +
                getCar_body() + "\nprice: " + getPrice() + "$\ndiscount: " + getDiscount() + "%\n";
    }
}
