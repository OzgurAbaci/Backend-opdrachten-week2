package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

public class MainBird {

    /*
    Geef de klasse Bird de volgende instance variables: nickname, species, ringNumber
    De species en ringNumber variables mogen na instantiatie niet meer aangepast worden.

    Geef de klasse BirdOwner de volgende instance variables: name, sex.
    Er zijn geen restricties op getters en setters.

    Programmeer de volgende relatie.
    Een BirdOwner kan een oneindig aantal vogels hebben. Elke vogel mag echter maar 1 keer in de lijst voorkomen.
    Er mag geen List via de constructor gevuld worden. Dit moet via een methode.

    Maak een toString()-methode die het volgende afdrukt: Naam van eigenaar en van elke vogel de nickname en
    serienummer.

    Uitdagend:
    1. Zorg ervoor dat de BirdOwner minimaal 20 Bird-objecten heeft.
    2. De BirdOwner mag van de gemeente nog maar 10 Vogels houden. Hij wil random 5 vrouwtjes en vijf mannetjes kiezen.
    Schrijf een methode die dit doet en de vijf random gekozen mannetjes en de vijf random gekozen vrouwtjes uitprint.

     */

    public static void main(String[] args) {
        BirdOwner birdman = new BirdOwner("Sjaak", "m");
        for (int i = 0; i < 25; i++) {
            int j = i+1;
            Bird newbird = new Bird("Vogel"+j, "parkiet", ""+(100+j), "m");
            birdman.addBird(newbird);
        }

        for (int i = 25; i < 50; i++) {
            int j = i+1;
            Bird newbird = new Bird("Vogel"+j, "parkiet", ""+(100+j), "f");
            birdman.addBird(newbird);
        }

        System.out.println(birdman.toString());

        birdman.pruneBirds(5,5);

        System.out.println(birdman.toString());

    }


}
