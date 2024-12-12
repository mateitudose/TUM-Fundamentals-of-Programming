package de.tum.cit.fop;

import java.util.UUID;

public class Flight {
    private final UUID id = UUID.randomUUID();

    private Country from;
    private Country to;

    public Flight(Country from, Country to) {
        this.from = from;
        this.to = to;
    }

    public Country getFrom() {
        return from;
    }

    public void setFrom(Country from) {
        this.from = from;
    }

    public Country getTo() {
        return to;
    }

    public void setTo(Country to) {
        this.to = to;
    }

    public UUID getId() {
        return id;
    }
}
