package de.tum.cit.fop;

public abstract class Animal {
    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String messageOnFeed();
}
