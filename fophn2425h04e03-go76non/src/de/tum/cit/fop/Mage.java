package de.tum.cit.fop;

import java.util.*;

public class Mage extends Player {
    private List<Ability> abilities;

    public Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Mage", 5, armor, weapon, weaponType);
        this.abilities = abilities;
        setStrength(2);
        setIntelligence(10);
        setAgility(4);
        setSpirit(6);
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
        double dealtDamage = Math.max(strength * 0.4 + weapon.getDamage() + agility * 0.4 - target.getAmountOfArmor(), 0);
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
        modifiableAbilities.removeIf(current -> !Objects.equals(current.getSpecification(), "Mage"));
        if (modifiableAbilities.isEmpty()) {
            System.out.println(name + " has no spells to cast!");
            return;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(modifiableAbilities.size());
        Ability randomAbility = modifiableAbilities.get(randomIndex);
        double damageDealt = Math.max(intelligence + randomAbility.getDamage() + spirit * 0.5 - target.getAmountOfArmor(), 0);
        if (damageDealt == 0) {
            System.out.println("Target " + target.name + " didn't receive any damage!");
            return;
        }
        target.health -= damageDealt;
        level++;
        if (target.isDead()) {
            System.out.println(name + " killed " + target.name);
            target.level--;
        }
    }
}
