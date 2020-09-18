package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Lion extends Animal{
    private String penName;
    private String lastFed;
    private String originCountry;
    private int numChildren;

    public Lion(String name, String sex){
        super(name, sex);
    }

    public Lion(String name, String sex, String penName, String lastFed, String originCountry, int numChildren) {
        super(name, sex);
        this.penName = penName;
        this.lastFed = lastFed;
        this.originCountry = originCountry;
        this.numChildren = numChildren;
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

    public int getNumChildren() {
        return numChildren;
    }

    public void setNumChildren(int numChildren) {
        this.numChildren = numChildren;
    }
}
