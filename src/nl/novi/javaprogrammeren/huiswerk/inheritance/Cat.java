package nl.novi.javaprogrammeren.huiswerk.inheritance;

import jdk.swing.interop.SwingInterOpUtils;

public class Cat extends Animal{

    private String ownerName;
    private String favoriteFood;
    private String type;
    private boolean insidecat;

    public Cat(String name, String sex) {
        super(name, sex);
        this.isPet = true;
    }

    public Cat(String name, String sex, String ownerName, String favoriteFood, String type, boolean insidecat) {
        super(name, sex);
        this.ownerName = ownerName;
        this.favoriteFood = favoriteFood;
        this.type = type;
        this.insidecat = insidecat;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " zegt miauw.");
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

    public boolean isInsidecat() {
        return insidecat;
    }

    public void setInsidecat(boolean insidecat) {
        this.insidecat = insidecat;
    }
}
