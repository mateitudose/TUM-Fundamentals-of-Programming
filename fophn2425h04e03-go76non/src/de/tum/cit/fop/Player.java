package de.tum.cit.fop;

import java.util.List;

public abstract class Player implements Interactions{
    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health;
    protected int level;
    protected List<Armor> armor;
    protected Weapon weapon;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;

    protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        this.name = name;
        this.specification = specification;
        this.amountOfArmor = amountOfArmor;
        this.armor = armor;
        if (weapon.specification == specification && weaponType == weapon.type) {
            this.weapon = weapon;
            this.weaponType = weaponType;
        }
        this.level = 1;
        this.health = 200;
    }

    protected boolean isDead() {
        return health <= 0;
    }

    protected void equipItems() {
        for (Armor armorItem : armor) {
            switch (armorItem.getType()) {
                case "Helmet":
                    if (helmet == null) {
                        helmet = armorItem;
                        applyArmorAttributes(armorItem);
                    }
                    break;
                case "Chest":
                    if (chest == null) {
                        chest = armorItem;
                        applyArmorAttributes(armorItem);
                    }
                    break;
                case "Hands":
                    if (hands == null) {
                        hands = armorItem;
                        applyArmorAttributes(armorItem);
                    }
                    break;
                case "Legs":
                    if (legs == null) {
                        legs = armorItem;
                        applyArmorAttributes(armorItem);
                    }
                    break;
                case "Boots":
                    if (boots == null) {
                        boots = armorItem;
                        applyArmorAttributes(armorItem);
                    }
                    break;
            }
        }
        if (weapon != null) {
            applyWeaponAttributes(weapon);
        }
    }

    private void applyArmorAttributes(Armor armor) {
        this.amountOfArmor += armor.getAmountOfArmor();
        this.strength += armor.getStrength();
        this.intelligence += armor.getIntelligence();
        this.agility += armor.getAgility();
        this.spirit += armor.getSpirit();
    }

    private void applyWeaponAttributes(Weapon weapon) {
        this.strength += weapon.getStrength();
        this.intelligence += weapon.getIntelligence();
        this.agility += weapon.getAgility();
        this.spirit += weapon.getSpirit();
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

    public int getAmountOfArmor() {
        return amountOfArmor;
    }

    public void setAmountOfArmor(int amountOfArmor) {
        this.amountOfArmor = amountOfArmor;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<Armor> getArmor() {
        return armor;
    }

    public void setArmor(List<Armor> armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getHelmet() {
        return helmet;
    }

    public void setHelmet(Armor helmet) {
        this.helmet = helmet;
    }

    public Armor getChest() {
        return chest;
    }

    public void setChest(Armor chest) {
        this.chest = chest;
    }

    public Armor getHands() {
        return hands;
    }

    public void setHands(Armor hands) {
        this.hands = hands;
    }

    public Armor getLegs() {
        return legs;
    }

    public void setLegs(Armor legs) {
        this.legs = legs;
    }

    public Armor getBoots() {
        return boots;
    }

    public void setBoots(Armor boots) {
        this.boots = boots;
    }
}
