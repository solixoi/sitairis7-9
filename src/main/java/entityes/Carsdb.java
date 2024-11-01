package entityes;

import java.util.ArrayList;
import java.util.List;

public class Carsdb {
    private List<Car> cars;

    public Carsdb(){
        cars = new ArrayList<>();
    }

    public void addCar(Car car){
        cars.add(car);
    }

    public String getCars() {
        StringBuilder sb = new StringBuilder();
        for(Car car: cars){
            sb.append(car.toString());
        }
        return sb.toString();
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Cars: " + getCars();
    }
}
