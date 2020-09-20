package nl.novi.javaprogrammeren.huiswerk.relaties.two.football;

import java.util.ArrayList;
import java.util.List;

public class Club {
    private static final int minPlayers = 18;
    private static final int maxPlayers = 25;
    private List<Player> players = new ArrayList<>();
    private String name;
    private String city;
    private Competition competition;

    public Club(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void addPlayer(Player player) {
        if (players.contains(player)){
            System.out.println("Fout: speler zit al bij deze club");
            return;
        }
        players.add(player);
        player.setClub(this);
    }

    public void removePlayer(Player player) {
        if(!players.contains(player)){
            System.out.println("Fout: kan speler niet verwijderen uit deze club. Speler niet aanwezig");
            return;
        }
        if(players.size() <= 18){
            System.out.println("Fout: niet genoeg spelers in de club om speler te verwijderen.");
            return;
        }
        players.remove(player);
        player.setClub(null);
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public void removeCompetition() {
        this.competition = null;
    }


    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
