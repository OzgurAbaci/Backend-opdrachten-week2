package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private String name;
    private List<Club> clubs = new ArrayList<>();

    public Competition(String name){
        this.name = name;
    }

    private void addClub(Club club){
        clubs.add(club);
        club.setCompetition(this);
    }

    private void removeClub(Club club){
        clubs.remove(club);
        club.removeCompetition();
    }

    public void swapClubs(Club clubIn, Club  clubOut){
        if(clubs.contains(clubOut) && !clubs.contains(clubIn)){
            removeClub(clubOut);
            addClub(clubIn);

        }
    }

    public void addClubInitial(Club club){
        if(clubs.size() < 18){
            addClub(club);
        }
    }

    public String getName() {
        return name;
    }
}
