package de.tum.cit.fop;

public final class Oni extends MythicalCreature implements Chasing{
    public Oni(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Oni eats!");
    }

    @Override
    public void chase() {
        System.out.println(getName() + " the Oni chases!");
    }
}
