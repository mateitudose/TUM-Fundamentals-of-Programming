package de.tum.cit.fop;

public final class Fairy extends MythicalCreature implements CastingSpell {
    public Fairy(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the Fairy eats!");
    }

    @Override
    public void castSpell() {
        System.out.println(getName() + " the Fairy casts a spell!");
    }
}
