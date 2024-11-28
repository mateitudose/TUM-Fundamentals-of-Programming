package de.tum.cit.fop;

import java.util.*;

public class Tank extends Player {
    private List<Ability> abilities;
    private Armor shield;

    public Tank(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, "Tank", 30, armor, weapon, weaponType);
        this.shield = shield;
        this.abilities = abilities;
        setStrength(15);
        setIntelligence(4);
        setAgility(6);
        setSpirit(2);
        equipItems();
        equipShield();
    }

    public Armor getShield() {
        return shield;
    }

    public void setShield(Armor shield) {
        this.shield = shield;
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    private void equipShield() {
        this.amountOfArmor += shield.getAmountOfArmor();
        this.strength += shield.strength;
        this.intelligence += shield.intelligence;
        this.agility += shield.agility;
        this.spirit += shield.spirit;
    }

    @Override
    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double dealtDamage = Math.max(strength * 0.7 + weapon.getDamage() + agility * 0.6 - target.getAmountOfArmor(), 0);
        if (dealtDamage == 0) {
            System.out.println("Target " + target.name + " didn't receive any damage!");
            return;
        }
        target.health -= dealtDamage;
        level++;
        if (target.isDead())
            System.out.println(name + " killed " + target.name);
    }

    @Override
    public void useAbility(Player target) {
        List<Ability> modifiableAbilities = new ArrayList<>(abilities);
        modifiableAbilities.removeIf(current -> !Objects.equals(current.getSpecification(), "Tank"));
        if (modifiableAbilities.isEmpty()) {
            System.out.println(name + " has no skills to use!");
            return;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(modifiableAbilities.size());
        Ability randomAbility = modifiableAbilities.get(randomIndex);
        amountOfArmor += randomAbility.getArmor();
        level++;
        System.out.println("Hey you! I am here, attack me!");
        target.attack(this);
    }
}
