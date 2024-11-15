package de.tum.cit.fop;

public class Cow extends Animal implements Milkable, Rideable{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String messageOnFeed() {
        return "Mooh! ";
    }

    @Override
    public String messageOnMilk() {
        return "Cow " + getName() + " is milked";
    }

    @Override
    public String messageOnRide() {
        return "Riding on Cow " + getName();
    }
}
