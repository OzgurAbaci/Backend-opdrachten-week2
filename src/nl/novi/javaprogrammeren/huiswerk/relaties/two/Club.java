package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.List;

public class Club {
    private List<Player> players;
    private String name;
    private String city;
    private Competition competition;

    public Club(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void addPlayer(Player player) {
        if (!players.contains(player))
            players.add(player);
    }

    public void removePlayer(Player player) {
        if (players.contains(player)) {
            players.remove(player);
        }
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
