package de.tum.cit.fop;

public class Burger {
    private final String name;
    private final String[] ingredients;

    public Burger(String name, String[] ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return this.name;
    }

    public String[] getIngredients() {
        return this.ingredients;
    }
}
