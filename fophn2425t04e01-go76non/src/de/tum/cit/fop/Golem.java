package de.tum.cit.fop;

public final class Golem extends MythicalCreature implements Chasing, CastingSpell{
    public Golem(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Golem eats!");
    }

    @Override
    public void chase() {
        System.out.println(getName() + " the Golem chases!");
    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " the Golem casts a spell!");
    }
}
