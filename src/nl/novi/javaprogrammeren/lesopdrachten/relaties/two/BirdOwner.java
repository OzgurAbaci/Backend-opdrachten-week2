package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BirdOwner {
    private String name;
    private String sex;
    private List<Bird> birds;

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        birds = new ArrayList<>();
    }

    public void addBird(Bird newbird){
        if (!birds.contains(newbird)){
            birds.add(newbird);
            newbird.setOwner(this);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.name + "\n\r");
        for (Bird bird: birds){
            result.append(bird.getNickname() + " " + bird.getRingNumber() + " " + bird.getSex() + "\n\r");
        }
        return result.toString();
    }

    public void pruneBirds(int numMales, int numFemales){
        if (this.birds.size() == 0){
            System.out.println("Er zijn geen vogels om weg te doen.");
            return;
        }
        List<Bird> maleBirds = new ArrayList<>();
        List<Bird> femaleBirds = new ArrayList<>();
        List<Bird> remainingBirds = new ArrayList<>();

        for (Bird bird: birds) {
            if (bird.getSex().equals("m"))
                maleBirds.add(bird);
            if (bird.getSex().equals("f"))
                femaleBirds.add(bird);
        }

        maleBirds = pickRandBirds(maleBirds, numMales);
        femaleBirds = pickRandBirds(femaleBirds, numFemales);

        remainingBirds.addAll(maleBirds);
        remainingBirds.addAll(femaleBirds);
        this.birds = remainingBirds;

    }


    //n moet groter zijn dan de lijst in het argument
    private List<Bird> pickRandBirds(List<Bird> birds, int n){
        if (n > birds.size())
            return birds;
        List<Bird> result = new ArrayList<>();
        List<Bird> birdsCopy = new ArrayList<>(birds);
        Random random = new Random();
        while (result.size() < n){
            int nextpick = random.nextInt(birdsCopy.size());
            result.add(birdsCopy.get(nextpick));
            birdsCopy.remove(nextpick);
        }
        return result;
    }
}
