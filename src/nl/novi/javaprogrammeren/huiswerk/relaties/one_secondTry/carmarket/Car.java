package nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket;

public class Car {
    private String licensePlate;
    private String brand;
    private String subtype;
    private int drivenKms;

    private CarDealer dealer;
    private CarOwner owner;

    //constructors
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.brand = "onbekend";
        this.subtype = "onbekend";
        this.drivenKms = 0;
    }

    public Car(String licensePlate, String brand, String subtype, int drivenKms) {
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.subtype = subtype;
        this.drivenKms = drivenKms;
    }

    //other methods
    public void orphan(){
        if (dealer != null){
            dealer.removeCar(this);
        }
        if(owner != null){
            owner.removeCar(this);
        }
        dealer = null;
        owner = null;
    }

    public void drive(int distance){
        if (dealer != null){
            System.out.println(dealer.getName() + " houdt de auto liever veilig in de garage.");
        } else if(owner != null){
            System.out.println(owner.getName() + " stapt in de auto rijdt lekker een stuk van " + distance + " km. Het was een fijn ritje.");
            drivenKms += distance;
        } else{
            System.out.println("Deze auto heeft geen eigenaar en is niet verzekerd. Laten we hem maar niet rijden.");
        }
    }

    public void drive(){
        drive(1);
    }

    public void registerTo(CarDealer newDealer){
        if(newDealer.addCar(this)){
            this.orphan();
            this.dealer = newDealer;
            System.out.println("De " + brand + " " + subtype + " staat nu op naam van " + newDealer.getName());
        }
    }

    public void registerTo(CarOwner newOwner){

        if(newOwner.addCar(this)){
            this.orphan();
            this.owner = newOwner;
            System.out.println("De " + brand + " " + subtype + " staat nu op naam van " + newOwner.getName());
        }
    }

    //getters and setters
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getDrivenKms() {
        return drivenKms;
    }

    public void setDrivenKms(int drivenKms) {
        this.drivenKms = drivenKms;
    }
}
