package nl.novi.javaprogrammeren.lesopdrachten.inheritance.one;

public class Animal {
    private String name;
    private String sex;

    public Animal(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public void move(){
        System.out.println(name + " heeft zich 0.5 verplaatst.");
    }

    public void makeSound(){
        System.out.println("Het dier maakt geluid");
    }

    public void sleep(){
        System.out.println(name + " heeft zojuist 8 uur geslapen.");
    }

    public void eat(String food){
        System.out.println(name + " eet " + food);
    }

}
