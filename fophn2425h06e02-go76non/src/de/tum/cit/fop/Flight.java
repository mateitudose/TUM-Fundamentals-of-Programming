package de.tum.cit.fop;

import java.time.LocalDateTime;

public class Flight {

    private final AircraftData aircraftData;
    private final String flightNumber;
    private final String destination;
    private final String departureGate;
    private final boolean isSchengen;
    private final int duration; // in minutes
    private final LocalDateTime date;

    public Flight(AircraftData aircraftData, String flightNumber, String destination, String departureGate, boolean isSchengen, int duration, LocalDateTime date) {
        this.aircraftData = aircraftData;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureGate = departureGate;
        this.isSchengen = isSchengen;
        this.duration = duration;
        this.date = date;
    }

    public AircraftData getAircraftData() {
        return aircraftData;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureGate() {
        return departureGate;
    }

    public boolean isSchengen() {
        return isSchengen;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDateTime getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Flight{"
                + "AircraftData='" + aircraftData
                + ", Destination=" + destination
                + ", Departure Gate=" + departureGate
                + ", Schengen='" + isSchengen
                + ", Duration='" + duration
                + ", Date=" + date
                + "\n}";
    }
}
