package nl.novi.javaprogrammeren.huiswerk.relaties.two;

import nl.novi.javaprogrammeren.huiswerk.relaties.two.football.Club;
import nl.novi.javaprogrammeren.huiswerk.relaties.two.football.Competition;
import nl.novi.javaprogrammeren.huiswerk.relaties.two.football.Player;

import java.util.ArrayList;
import java.util.List;

public class MainFootball {

    /*
     * Programmeer de volgende relaties:
     * Een competitie kan minimaal 18 en maximaal 18 clubs hebben.
     * Een club kan bij 1 competitie horen en minimaal 18 spelers en maximaal 25 spelers hebben.
     * Een speler kan bij 1 club horen.
     *
     * Extra: Je moet via het speler object kunnen zeggen in welke competitie de speler speelt.
     */

    public static void main(String[] args) {
        Competition eredivisie = new Competition("Eredivisie");
        Competition jupilerLeague = new Competition("Jupiler Legue");

        List<Club> clubs = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            Club club = new Club("clubnaam"+i, "stadofdorp");
            eredivisie.addClub(club);
            clubs.add(club);
        }

        for (int i = 20; i < 40; i++) {
            Club club = new Club("clubnaam"+i, "stadofdorp");
            jupilerLeague.addClub(club);
            clubs.add(club);
        }

        jupilerLeague.swapClubs(clubs.get(1), clubs.get(30));
        jupilerLeague.swapClubs(clubs.get(20),clubs.get(21));

        Player player1 = new Player("Koeman", 50);
        Player player2 = new Player("Blind", 25);

        clubs.get(0).addPlayer(player1);
        //clubs.get(clubs.size()-1).addPlayer(player2);

        player1.printCompetition();
        player2.printCompetition();
    }
}
