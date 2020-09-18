package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class Car {

    private String licencePlate;
    private String brand;
    private String subtype;
    private int numberOfKms;
    private CarOwner owner;
    private CarDealer dealer;


    public Car(String licencePlate, String brand, String subtype, int numberOfKms){
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.subtype = subtype;
        this.numberOfKms = numberOfKms;
    }

    public void setOwner(CarOwner owner){
        this.owner = owner;
        owner.addCar(this);
    }


    public void sellTo(CarDealer dealer){
        if(!dealer.hasCar(this)) {
            this.orphan();
            this.dealer = dealer;
            this.dealer.addCar(this);
        }
    }

    public void sellTo(CarOwner buyer){
        if(!buyer.hasCar(this)){
            if(buyer.getAge() >= 18){
                this.orphan();
                this.setOwner(buyer);
            } else{
                System.out.println(buyer.getName() + " kan geen auto kopen. Hij/zij is nog geen 18.");
            }
        }


    }

    public String getLicensePlate() {
        return this.licencePlate;
    }

    public String getBrand(){
        return this.brand;
    }

    public String getSubtype(){
        return this.subtype;
    }

    private void orphan(){
        if (this.owner != null) {
            this.owner.removeCar(this);
            this.owner = null;
        }
        if (this.dealer != null) {
            this.dealer.removeCar(this);
            this.dealer = null;
        }
    }
}
