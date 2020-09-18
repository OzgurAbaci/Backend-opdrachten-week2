package nl.novi.javaprogrammeren.huiswerk.relaties.one;

public class MainCar {
    /*
    Maak de volgende drie klassen:
    CarOwner, Car, CarDealer.

    Verzin zelf wat simpele instance variables bij CarOwner en CarDealer.
    Car heeft: kenteken, merk, subtype, aantalKmGereden

    Een CarOwner kan 0 of meerdere auto's hebben.
    Een CarDealer kan 0 of meerdere auto's hebben.
    Een Car kan 0 of 1 owner hebben (alleen CarOwner-klasse). Wanneer de auto bij de dealer staat is de carowner
    leeg (null).

    Voeg aan de CarDealer een methode toe die een auto vanuit zijn garage kan overschrijven naar de CarOwner. Zowel
    de list van CarOwner moet dan uitgebreid worden als de eigenaar van de Car moet aangepast worden. We hebben het hier
    dus over een bidirectionele relatie!

    Zorg ervoor dat alleen unieke auto's op basis van een kenteken aan de List van CarDealer en CarOwner toegevoegd
    kunnen worden.

    Extra: Voeg een variabele leeftijd toe aan CarOwner. Check daarna altijd of de CarOwner wel 18 of ouder is.

     */
    public static void main(String[] args) {
        Car car1 = new Car("king", "Audi", "A3", 100000);
        CarOwner me = new CarOwner("Ozgur", 34);
        CarDealer audiDealer = new CarDealer("Audi Dealer", "Oss");

        car1.setOwner(me);
        car1.sellTo(audiDealer);
        car1.sellTo(me);

        CarOwner deniz = new CarOwner("Deniz", 3);
        audiDealer.sellCar(car1, deniz);

        audiDealer.sellCar(car1, me);

        Car car2 = new Car("king", "Volkswagen", "golf", 100);
        car2.setOwner(me);

        CarDealer vwDealer = new CarDealer("Volkswagen Dealer", "Den Bosch");
        car2.sellTo(vwDealer);
        car2.sellTo(me);

        System.out.println(me.getCars());
        System.out.println(audiDealer.getCars());
        System.out.println(vwDealer.getCars());
        System.out.println(deniz.getCars());
        //System.out.println("");

    }
}
