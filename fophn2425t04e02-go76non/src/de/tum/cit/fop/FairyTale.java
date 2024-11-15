package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class FairyTale {
    private List<Animal> list;

    public FairyTale() {
        list = new ArrayList<>();
    }

    public void setUpFairyTale() {
        list.add(new Donkey("Edgar"));
        list.add(new Dog("Max"));
        list.add(new Cat("Annie"));
        list.add(new Rooster("Alex"));
    }

    public boolean validateAnimalFormation() {
        if (!(list.get(0) instanceof Donkey))
            return false;
        if (!(list.get(1) instanceof Dog))
            return false;
        if (!(list.get(2) instanceof Cat))
            return false;
        if (!(list.get(3) instanceof Rooster))
            return false;
        return true;
    }

    public void performMusic() {
        for (Animal animal : list)
            System.out.println(animal.makeSound());
    }

    public void performSkill() {
        for (Animal animal : list) {
            if (animal instanceof Donkey)
                System.out.println(((Donkey) animal).kicks());
            else if (animal instanceof Dog)
                System.out.println(((Dog) animal).fetch());
            else if (animal instanceof Cat)
                System.out.println(((Cat) animal).climb());
            else if (animal instanceof Rooster)
                System.out.println(((Rooster) animal).crow());
        }
    }
}
