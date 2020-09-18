package nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {

    private String name;
    private String city;
    private List<Car> cars;
    private int age;

    //constructors
    public CarOwner(String name, int age) {
        this.name = name;
        this.age = age;
        this.cars = new ArrayList<>();
    }

    public CarOwner(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.cars = new ArrayList<>();
    }



    //other methods
    boolean addCar(Car newCar){ //DO NOT USE! ONLY FOR USAGE INSIDE Car CLASS
        if(age < 18){
            System.out.println("Overschrijven van " + newCar.getBrand() + " " + newCar.getSubtype() + " niet gelukt. " + name + " is niet oud genoeg.");
            return false;
        }
        if(hasCarWithLicensePlate(newCar)){
            System.out.println("Overschrijven van " + newCar.getBrand() + " " + newCar.getSubtype() + " niet gelukt. " + name + " bezit reeds een auto met dit kenteken.");
            return true;
        }
        cars.add(newCar);
        return true;
    }

    void removeCar(Car soldCar){
        if (hasCar(soldCar))
            cars.remove(soldCar);
    }

    public boolean hasCarWithLicensePlate(Car newCar){
        boolean hasCar = false;
        for(Car car: cars){
            if (car.getLicensePlate().equals(newCar.getLicensePlate())){
                hasCar = true;
                break;
            }
        }
        return hasCar;
    }

    public boolean hasCar(Car car){
        return this.cars.contains(car);
    }



    //getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

}
