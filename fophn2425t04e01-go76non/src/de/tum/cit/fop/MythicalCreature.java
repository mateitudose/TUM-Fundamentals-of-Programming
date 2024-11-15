package de.tum.cit.fop;

public abstract class MythicalCreature {
    private String name;

    public MythicalCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();
}
