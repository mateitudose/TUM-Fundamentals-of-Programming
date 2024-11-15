package de.tum.cit.fop;

public class Donkey extends Animal {
    public Donkey(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Hee-haw";
    }

    public String kicks() {
        return "The donkey kicks with power!";
    }
}
