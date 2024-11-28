package de.tum.cit.fop;

import java.util.*;

public class Warrior extends Player {
    private List<Ability> abilities;

    public Warrior(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Warrior", 15, armor, weapon, weaponType);
        this.abilities = abilities;
        setStrength(20);
        setIntelligence(2);
        setAgility(8);
        setSpirit(2);
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
        double dealtDamage = Math.max(strength * 1.0 + weapon.getDamage() + agility * 0.8 - target.getAmountOfArmor(), 0);
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
        modifiableAbilities.removeIf(current -> !Objects.equals(current.getSpecification(), "Warrior"));
        if (modifiableAbilities.isEmpty()) {
            System.out.println(name + " has no skills to use!");
            return;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(modifiableAbilities.size());
        Ability randomAbility = modifiableAbilities.get(randomIndex);
        double damageDealt = Math.max(strength * 2 + randomAbility.getDamage() - target.getAmountOfArmor(), 0);
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
