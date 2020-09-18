package nl.novi.javaprogrammeren.huiswerk.inheritance;

public abstract class Animal {
    protected String name;
    private String sex;
    protected boolean isPet = false;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void move(){
        if(isPet){
            System.out.println(name + " heeft zich 0.25 verplaatst");
        } else{
            System.out.println(name + " heeft zich 0.5 verplaatst.");
        }
    }

    public abstract void makeSound();

    public void sleep(){
        System.out.println(name + " heeft zojuist 8 uur geslapen.");
    }

    public void eat(String food){
        System.out.println(name + " eet " + food);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public boolean isPet() {
        return isPet;
    }

    public void setPet(boolean pet) {
        isPet = pet;
    }
}
