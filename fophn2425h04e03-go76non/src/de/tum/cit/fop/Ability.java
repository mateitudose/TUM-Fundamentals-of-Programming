package de.tum.cit.fop;

public class Ability {

    private String name;
    private String specification;
    private int damage;
    private int heal;
    private int armor;

    public Ability(String name, String specification, int amount) {
        this.name = name;
        this.specification = specification;
        if (specification == "Mage") {
            this.damage = amount;
            this.heal = -1;
            this.armor = -1;
        }
        else if (specification == "Tank") {
            this.damage = -1;
            this.heal = -1;
            this.armor = amount;
        }
        else if (specification == "Healer") {
            this.damage = -1;
            this.heal = amount;
            this.armor = -1;
        }
        else if (specification == "Warrior") {
            this.damage = amount;
            this.heal = -1;
            this.armor = -1;
        }
        else {
            this.damage = -1;
            this.heal = -1;
            this.armor = -1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
