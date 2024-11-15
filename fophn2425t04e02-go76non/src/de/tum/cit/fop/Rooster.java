package de.tum.cit.fop;

public class Rooster extends Animal {

    public Rooster(String name) {
        super(name);
    }

    public String makeSound() {
        return "Coodle-doo";
    }

    public String crow() {
        return "The rooster can crow loudly!";
    }
}
