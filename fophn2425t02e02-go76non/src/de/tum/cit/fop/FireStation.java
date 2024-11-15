package de.tum.cit.fop;

public class FireStation {
    private Firefighter[] firefighters;

    public FireStation(Firefighter[] firefighters) {
        this.firefighters = firefighters;
    }

    public Firefighter[] getFirefighters() {
        return firefighters;
    }

    public void setFirefighters(Firefighter[] firefighters) {
        this.firefighters = firefighters;
    }

    public void houseOnFire(House house) {
        int peopleInHouse = house.getPeopleInHouse();
        if (firefighters.length < peopleInHouse) {
            System.out.println("Not enough firefighters to resque all people. Need help from another fire station!");
            return;
        }

        int waterCount = 0;
        int axeCount = 0;
        for (Firefighter firefighter : this.firefighters) {
            if ("Water".equals(firefighter.getCarriedEquipment())) {
                waterCount++;
            } else if ("Axe".equals(firefighter.getCarriedEquipment())) {
                axeCount++;
            }
        }

        int fireCount = 0;
        int debrisCount = 0;
        for (String obstacle : house.getObstacles()) {
            if ("Fire".equals(obstacle)) {
                fireCount++;
            } else if ("Debris".equals(obstacle)) {
                debrisCount++;
            }
        }

        if (waterCount >= fireCount && axeCount >= debrisCount) {
            System.out.println("Firefighters will resque everyone!");
        } else {
            System.out.println("Firefighters don't have proper equipment!");
        }
    }
}
