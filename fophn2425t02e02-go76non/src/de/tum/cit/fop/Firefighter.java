package de.tum.cit.fop;

public class Firefighter {
    private String firefighterId;
    private String carriedEquipment;

    public Firefighter(String firefighterId, String carriedEquipment) {
        this.firefighterId = firefighterId;
        this.carriedEquipment = carriedEquipment;
    }

    public String getFirefighterId() {
        return firefighterId;
    }

    public void setFirefighterId(String firefighterId) {
        this.firefighterId = firefighterId;
    }

    public String getCarriedEquipment() {
        return carriedEquipment;
    }

    public void setCarriedEquipment(String carriedEquipment) {
        this.carriedEquipment = carriedEquipment;
    }

    @Override
    public String toString() {
        return "Firefighter{" +
                "firefighterId='" + firefighterId + '\'' +
                ", carriedEquipment='" + carriedEquipment + '\'' +
                '}';
    }
}
