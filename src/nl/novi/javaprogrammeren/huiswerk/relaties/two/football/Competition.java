package nl.novi.javaprogrammeren.huiswerk.relaties.two.football;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private String name;
    private List<Club> clubs = new ArrayList<>();

    public Competition(String name){
        this.name = name;
    }

    void addClubForSwap(Club club){
        clubs.add(club);
        club.setCompetition(this);
    }

    void removeClub(Club club){
        clubs.remove(club);
        club.setCompetition(null);
    }

    public void swapClubs(Club clubIn, Club  clubOut){
        if(clubs.contains(clubOut) && !clubs.contains(clubIn)){
            removeClub(clubOut);
            addClubForSwap(clubIn);

        }
    }

    public void addClub(Club club){
        if(clubs.size() < 18){
            addClubForSwap(club);
        }
    }

    public String getName() {
        return name;
    }
}
