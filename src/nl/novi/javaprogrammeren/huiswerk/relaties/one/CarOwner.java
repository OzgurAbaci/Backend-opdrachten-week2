package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {
    private String name;
    private String city;
    private List<Car> cars;
    private int age;

    public CarOwner(String name, int age){
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car newcar){
        this.cars.add(newcar);
    }

    public void removeCar(Car soldCar){
        cars.remove(soldCar);
    }

    public boolean hasCar(Car newcar) {
        boolean result = false;
        for (Car car : cars) {
            if (car.getLicensePlate().equals(newcar.getLicensePlate()))
                result = true;
        }
        return result;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return this.name;
    }

    public String getCars(){
        String result = this.name + " has the following cars: \r\n";
        for (Car car: cars){
            result = result + car.getBrand() + " " + car.getSubtype() +"\r\n";
        }
        return result;
    }


}
