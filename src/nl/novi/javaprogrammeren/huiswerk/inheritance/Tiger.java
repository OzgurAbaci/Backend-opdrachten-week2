package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Tiger  extends Animal{
    private String penName;
    private String lastFed;
    private String originCountry;
    private int stripes;

    public Tiger(String name, String sex) {
        super(name, sex);
    }

    public Tiger(String name, String sex, String penName, String lastFed, String originCountry, int stripes) {
        super(name, sex);
        this.penName = penName;
        this.lastFed = lastFed;
        this.originCountry = originCountry;
        this.stripes = stripes;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " brult!");
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

    public int getStripes() {
        return stripes;
    }

    public void setStripes(int stripes) {
        this.stripes = stripes;
    }
}
