package de.tum.cit.fop;

import java.util.UUID;

public class Parcel implements Comparable<Parcel> {
    private double weight;
    private String id;

    public Parcel(double weight) {
        this.weight = weight;
        this.id = UUID.randomUUID().toString();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Parcel other) {
        return Double.compare(weight, other.weight);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "This package [" + this.getId() +"] has a weight of " + this.getWeight() + " kilos.";
    }
}
