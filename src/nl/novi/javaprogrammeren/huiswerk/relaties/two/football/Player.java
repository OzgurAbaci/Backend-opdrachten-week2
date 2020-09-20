package nl.novi.javaprogrammeren.huiswerk.relaties.two;

public class Player {
    private String name;
    private int age;
    private Club club;

    //constructors
    public Player(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void printCompetition(){
        if (club == null){
            System.out.println(name + " speelt niet in een club of competitie");
            return;
        }
        if (club.getCompetition() == null){
            System.out.println(name + " speelt niet in een competitie");
            return;
        }
        System.out.println("Speler " + name + " speel bij club " + club.getName() + " in de competitie " + club.getCompetition().getName() + "." );
    }

    public void joinClub (Club club){
        if(club.addPlayer(this)){
            this.club = club;
        }
    }

    public void leaveClub(){
        if (club == null){
            System.out.println(name + " speelt niet in een club en kan de club dus ook niet verlaten.");
            return;
        }
        if (club.removePlayer(this)){
            System.out.println(name + " heeft de club " + club.getName() + " verlaten.");
            club == null;
        }
    }

    //getters en setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Competition  getCompetition(){
        if(club != null) {
            return this.club.getCompetition();
        } else{
            return null;
        }
    }

}
