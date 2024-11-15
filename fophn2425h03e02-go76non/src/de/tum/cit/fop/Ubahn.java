package de.tum.cit.fop;

public class Ubahn {
    private int id;
    private int amountOfWagons;
    private String driverName;

    public Ubahn(int id, int amountOfWagons, String driverName) {
        this.id = 6000 + id;
        this.amountOfWagons = amountOfWagons;
        this.driverName = driverName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountOfWagons() {
        return amountOfWagons;
    }

    public void setAmountOfWagons(int amountOfWagons) {
        this.amountOfWagons = amountOfWagons;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
}
