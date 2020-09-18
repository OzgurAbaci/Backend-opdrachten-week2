package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Dog extends Animal{
    private String ownerName;
    private String favoriteFood;
    private String type;

    public Dog(String name, String sex) {
        super(name, sex);
    }

    public Dog(String name, String sex, String ownerName, String favoriteFood, String type) {
        super(name, sex);
        this.ownerName = ownerName;
        this.favoriteFood = favoriteFood;
        this.type = type;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " blaft!");
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
