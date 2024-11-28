package de.tum.cit.fop;

public class Weapon extends Item {
    private int damage;

    public Weapon(String weaponType, String specification, int damage, int strength, int intelligence, int agility, int spirit) {
        super(weaponType);
        this.specification = specification;
        this.damage = damage;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
        this.spirit = spirit;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
