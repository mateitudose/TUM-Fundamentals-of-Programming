package de.tum.cit.fop;

import java.util.UUID;

public class Baggage {
    private final UUID id = UUID.randomUUID();

    private Flight flight;
    private double weight;
    private boolean overweight = false;

    public Baggage(double weight, Flight flight) {
        this.weight = weight;
        this.flight = flight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public UUID getId() {
        return id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isOverweight() {
        return overweight;
    }

    public void setOverweight(boolean overweight) {
        this.overweight = overweight;
    }
}
