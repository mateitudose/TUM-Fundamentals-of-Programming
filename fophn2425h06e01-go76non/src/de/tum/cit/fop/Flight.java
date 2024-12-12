package de.tum.cit.fop;

import java.util.Stack;

public class Flight {
    private boolean departed;
    private String flightId;
    private Stack<Suitcase> cargoHold;

    public Flight(String flightId) {
        this.flightId = flightId;
        this.cargoHold = new Stack<>();
        this.departed = false;
    }

    public String getFlightId() {
        return flightId;
    }

    public boolean isDeparted() {
        return departed;
    }

    public void loadSuitcase(Suitcase suitcase) {
        cargoHold.push(suitcase);
    }

    public void acceptLuggage(CargoVehicle cargoVehicle) {
        System.out.println("This is flight " + flightId + " accepting luggage from cargo vehicle " + cargoVehicle.getVehicleId() + "!");
        cargoVehicle.forEach(this::loadSuitcase);
    }

    public void depart() {
        departed = true;
        System.out.println("Flight " + flightId + " is departing with " + cargoHold.size() + " suitcases in the cargo hold. Bye bye!");
    }

}
