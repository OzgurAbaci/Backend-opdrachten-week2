package nl.novi.javaprogrammeren.huiswerk.relaties.two.football;

import java.util.ArrayList;
import java.util.List;

public class Competition {
    private String name;
    private List<Club> clubs = new ArrayList<>();

    public Competition(String name){
        this.name = name;
    }

    void removeClub(Club club){
        clubs.remove(club);
        club.setCompetition(null);
    }

    public void swapClubs(Club clubIn, Club  clubOut){
        if(clubs.contains(clubOut) && !clubs.contains(clubIn)){
            Competition competitionOfEnteringClub = clubIn.getCompetition();
            removeClub(clubOut);
            addClub(clubIn);
            clubOut.setCompetition(competitionOfEnteringClub);
            System.out.println("De clubs zijn van competitie gewisseld");
            return;
        }
        System.out.println("Kies één club in deze competitie en één andere");
    }

    public void addClub(Club club){
        if(clubs.size() < 18){
            clubs.add(club);
            club.setCompetition(this);
        } else{
            System.out.println("Competitie is vol. Wissel de club met een andere club");
        }
    }

    public String getName() {
        return name;
    }
}
