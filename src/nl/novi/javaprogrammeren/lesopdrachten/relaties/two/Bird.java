package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class Bird {
    // nickname, species, ringNumber
    private String nickname;
    private String species;
    private String ringNumber;
    private BirdOwner owner;
    private String sex;

    public Bird(String nickname, String species, String ringNumber, String sex){
        this.nickname = nickname;
        this.species = species;
        this.ringNumber = ringNumber;
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public String getSpecies() {
        return species;
    }

    public String getRingNumber() {
        return ringNumber;
    }

    public BirdOwner getOwner() {
        return owner;
    }

    public void setOwner(BirdOwner owner) {
        this.owner = owner;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
