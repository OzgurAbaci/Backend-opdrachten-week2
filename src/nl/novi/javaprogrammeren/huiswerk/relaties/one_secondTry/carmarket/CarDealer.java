package nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket;

import java.util.ArrayList;
import java.util.List;

public class CarDealer {
    private String name;
    private String city;
    private List<Car> cars;

    //constructors
    public CarDealer(String name) {
        this.name = name;
        this.city = "onbekend";
        this.cars = new ArrayList<>();
    }

    public CarDealer(String name, String city) {
        this.name = name;
        this.city = city;
        this.cars = new ArrayList<>();
    }

    //other methods
    boolean addCar(Car newCar){ //DO NOT USE! ONLY FOR USAGE INSIDE Car CLASS
        if (!hasCarWithLicensePlate(newCar)){
            cars.add(newCar);
            System.out.println(name + " heeft de " + newCar.getBrand() + " " + newCar.getSubtype() + " aan de inventaris toegevoegd");
            return true;
        } else{
            System.out.println("Kan" + newCar.getBrand() + " " + newCar.getSubtype() + "niet toevoegen. " + name + " bezit reeds een auto met kenteken " + newCar.getLicensePlate() + ".");
            return false;
        }
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

    public boolean hasCar(Car newcar){
        return this.cars.contains(newcar);
    }

    public void sellCar(Car car, CarOwner owner){
        if(hasCar(car)) {
            car.registerTo(owner);
        } else{
            System.out.println(name + " kan de " + car.getBrand() + " " + car.getSubtype() + " niet verkopen. Auto niet in bezit.");
        }
    }

    //setters and getters
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
