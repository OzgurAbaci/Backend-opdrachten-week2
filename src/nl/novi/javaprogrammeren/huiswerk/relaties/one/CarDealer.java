package nl.novi.javaprogrammeren.huiswerk.relaties.one;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private String name;
    private String city;
    private List<Car> cars;

    public CarDealer(String name, String city) {
        this.name = name;
        this.city = city;
        this.cars = new ArrayList<>();
    }

    public void addCar(Car newcar) {
        this.cars.add(newcar);

    }

    public void removeCar(Car soldCar) {
        this.cars.remove(soldCar);
    }

    public void sellCar(Car soldCar, CarOwner newOwner) {
        soldCar.sellTo(newOwner);
        //this.cars.remove(soldCar);
    }

    public boolean hasCar(Car newcar){
        boolean result = false;
        for(Car car: this.cars) {
            if (car.getLicensePlate().equals(newcar.getLicensePlate()))
                result = true;
        }
        return result;
    }

    public String getCars(){
        String result = this.name + " has the following cars: \r\n";
        for (Car car: cars){
            result = result + car.getBrand() + " " + car.getSubtype() +"\r\n";
        }
        return result;
    }
}
