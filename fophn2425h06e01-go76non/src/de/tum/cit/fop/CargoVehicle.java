package de.tum.cit.fop;

import java.util.*;

public class CargoVehicle implements Iterable<Suitcase> {
    private String vehicleId;
    private Queue<Suitcase> cargo;

    public CargoVehicle(String vehicleId) {
        this.vehicleId = vehicleId;
        this.cargo = new PriorityQueue<>((Suitcase::compareTo));
    }

    public String getVehicleId() {
        return vehicleId;
    }

    // Custom iterator implementation
    @Override
    public Iterator<Suitcase> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return !cargo.isEmpty();
            }

            @Override
            public Suitcase next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Suitcase nextSuitcase = cargo.remove();
                System.out.println("Here comes a suitcase weighing " + nextSuitcase.getWeight() + " kg!");
                return nextSuitcase;
            }
        };
    }

    public void loadSuitcase(Suitcase suitcase) {
        cargo.add(suitcase);
    }

    public void collectLuggageForFlight(String flightId, CargoBay cargoBay) {
        System.out.println("This is cargo vehicle " + vehicleId + " requesting luggage for flight " + flightId + " from cargo bay " + cargoBay.getCargoBayId() + "!");
        cargoBay.sendOutLuggageForFlight(flightId).forEach(this::loadSuitcase);
    }
}
