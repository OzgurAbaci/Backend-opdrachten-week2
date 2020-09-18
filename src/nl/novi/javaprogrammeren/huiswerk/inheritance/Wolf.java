package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Wolf extends Animal{

    private String penName;
    private String lastFed;
    private String originCountry;
    private String packName;

    public Wolf(String name, String sex) {
        super(name, sex);
    }

    public Wolf(String name, String sex, String penName, String lastFed, String originCountry, String packName) {
        super(name, sex);
        this.penName = penName;
        this.lastFed = lastFed;
        this.originCountry = originCountry;
        this.packName = packName;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " huilt!");
    }

    public String getPenName() {
        return penName;
    }

    public void setPenName(String penName) {
        this.penName = penName;
    }

    public String getLastFed() {
        return lastFed;
    }

    public void setLastFed(String lastFed) {
        this.lastFed = lastFed;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }
}
