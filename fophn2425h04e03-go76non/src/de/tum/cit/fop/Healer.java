package de.tum.cit.fop;

import java.util.*;

public class Healer extends Player {
    private List<Ability> abilities;

    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Healer", 9, armor, weapon, weaponType);
        this.abilities = abilities;
        setStrength(3);
        setIntelligence(5);
        setAgility(3);
        setSpirit(10);
        equipItems();
    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    @Override
    public void attack(Player target) {
        if (weapon == null) {
            System.out.println("You don't have a weapon to attack!");
            return;
        }
        double dealtDamage = Math.max(strength * 0.2 + weapon.getDamage() + agility * 0.1 - target.getAmountOfArmor(), 0);
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
        modifiableAbilities.removeIf(current -> !Objects.equals(current.getSpecification(), "Healer"));
        if (modifiableAbilities.isEmpty()) {
            System.out.println(name + " has no spells to cast!");
            return;
        }
        if (target.isDead()) {
            System.out.println("Can not heal " + target.name + ", " + target.name + " is dead!");
            return;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(modifiableAbilities.size());
        Ability randomAbility = modifiableAbilities.get(randomIndex);
        double healGiven = Math.max(spirit + randomAbility.getHeal() + intelligence * 0.5, 0);
        target.health += healGiven;
        level++;
    }
}
