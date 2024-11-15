package de.tum.cit.fop;

public final class Unicorn extends MythicalCreature {
    public Unicorn(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Unicorn eats!");
    }
}
