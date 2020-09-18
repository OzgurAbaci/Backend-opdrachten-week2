package nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry;


import nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket.Car;
import nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket.CarDealer;
import nl.novi.javaprogrammeren.huiswerk.relaties.one_secondTry.carmarket.CarOwner;

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


    public static void main(String[] args){
        Car audi = new Car("ABC", "Audi", "A3", 26000);
        Car vw = new Car("XYZ", "VolksWagen", "Golf", 250000);
        Car ford = new Car("ABC", "Ford", "focus", 20000);
        CarDealer beterAuto = new CarDealer("Beter Auto");
        CarDealer autoConcurrent = new CarDealer("De Autoconcurrent");
        CarOwner jantje = new CarOwner("Jan", 6);
        CarOwner hans = new CarOwner("Hans", 34);
        CarOwner oma = new CarOwner("Jeanet", 80);

        audi.registerTo(beterAuto);
        vw.registerTo(beterAuto);
        ford.registerTo(beterAuto);
        beterAuto.sellCar(vw, jantje);
        beterAuto.sellCar(vw, hans);
        beterAuto.sellCar(vw, oma);
        beterAuto.sellCar(ford, oma);
        vw.registerTo(autoConcurrent);
    }

}
