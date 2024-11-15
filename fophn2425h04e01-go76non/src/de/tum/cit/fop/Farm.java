package de.tum.cit.fop;


import java.util.ArrayList;
import java.util.List;

public class Farm {
    // TODO: Implement Farm as described in task
    private List<Animal> animals;

    public Farm() {
        this.animals = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    /**
     * Sings farm song for all animals in the farm
     */
    public void singFarmSong() {
        // TODO: Let the Animals sing!
        for (Animal animal : animals)
            singFarmSongVerse(animal);
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    private void singFarmSongVerse(Animal animal) {
        System.out.println("Old MacDonald had a farm Ee i ee i o");
        System.out.println("And on his farm he had some " +
                animal.getClass().getSimpleName() +
                "s Ee i ee i oh");
        System.out.print("With a ");
        System.out.printf(animal.messageOnFeed());
        System.out.printf(animal.messageOnFeed());
        System.out.print("here, and a ");
        System.out.printf(animal.messageOnFeed());
        System.out.printf(animal.messageOnFeed());
        System.out.println("there.");
        System.out.print("Here a ");
        System.out.printf(animal.messageOnFeed());
        System.out.print("There a ");
        System.out.println(animal.messageOnFeed());
        System.out.print("Everywhere a ");
        System.out.printf(animal.messageOnFeed());
        System.out.println(animal.messageOnFeed());
        System.out.println("Old MacDonald had a farm Ee i ee i o");
    }

    private void feedAllAnimals() {
        for (Animal animal : animals)
            System.out.println(animal.messageOnFeed());
    }
}
