package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {
    private String name;
    private int age;
    private Club club;

    public Player(String name, int age, Club club){
        this.name = name;
        this.age = age;
        this.club = club;
    }

    public Competition  getCompetition(){
        return this.club.getCompetition();
    }

    public void printCompetition(){
        System.out.println("Speler " + name + " speel bij club " + club + " in de competitie " + club.getCompetition().getName() + "." );
    }
}
