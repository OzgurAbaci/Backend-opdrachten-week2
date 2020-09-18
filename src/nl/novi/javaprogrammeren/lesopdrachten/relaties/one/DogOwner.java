package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {
    private String name;
    private String sex;
    private Dog myDog;

    public DogOwner(String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public void addDog(Dog myDog){
        this.myDog = myDog;
    }

    public void changeDogName(String newname){
        myDog.setName(newname);
    }

    public void ageDog(){
        myDog.age();
    }

    @Override
    public String toString() {
        if (myDog==null)
            return this.name + " heeft geen hond.";
        String dogSex;
        if (myDog.getSex().equals("m")){
            dogSex = "reu";
        } else{
            dogSex = "teef";
        }
        return this.name + " heeft een " + dogSex + ", deze is " + myDog.getAge()+ " jaar oud en van het soort " + myDog.getSpecies() + ". De hond heet: " + myDog.getName();
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


}
