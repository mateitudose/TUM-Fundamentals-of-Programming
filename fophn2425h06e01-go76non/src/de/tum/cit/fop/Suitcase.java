package de.tum.cit.fop;

import java.util.Objects;

public class Suitcase implements Comparable<Suitcase> {

    private final String nameTag;
    private final String flightId;
    private final double weight;

    public Suitcase(String nameTag, String flightId, double weight) {
        this.nameTag = nameTag;
        this.flightId = flightId;
        this.weight = weight;
    }

    public String getNameTag() {
        return nameTag;
    }

    public String getFlightId() {
        return flightId;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Suitcase otherSuitcase = (Suitcase) other;
        return Objects.equals(nameTag, otherSuitcase.nameTag) &&
                Objects.equals(flightId, otherSuitcase.flightId) &&
                Objects.equals(weight, otherSuitcase.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameTag, flightId, weight);
    }

    @Override
    public int compareTo(Suitcase o) {
        // Decreasing order
        return Double.compare(o.weight, weight);
    }

    @Override
    public String toString() {
        return "Suitcase of " + nameTag + " for flight " + flightId + " with weight " + weight + " kg.";
    }
}
