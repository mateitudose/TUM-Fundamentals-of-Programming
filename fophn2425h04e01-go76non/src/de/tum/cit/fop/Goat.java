package de.tum.cit.fop;

public class Goat extends Animal implements Milkable {
    public Goat(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Maah! ";
    }

    @Override
    public String messageOnMilk() {
        return "Goat " + getName() + " is milked";
    }
}
