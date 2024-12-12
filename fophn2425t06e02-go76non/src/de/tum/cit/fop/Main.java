package de.tum.cit.fop;

import java.util.*;

public class Main {
    // TODO : Uncomment the code below to test your implementation
    /*
    private static final double MAX_WEIGHT = 80;
    private static void printOverweightBaggages(List<Baggage> dataSet){
        for (Baggage baggage : dataSet) {
            if (baggage.isOverweight()) {
                System.out.println("    -The baggage with the id: " + baggage.getId() + ", with the weight: " + baggage.getWeight() + " is to heavy.");
            }
        }
    }

    private static void printBaggageCountPerFlight(Map<UUID, Long> result){
        for (Map.Entry<UUID,Long> entry: result.entrySet()) {
            System.out.println("    -The flight with the id: " + entry.getKey() + "has " + entry.getValue() + " baggages.");
        }
    }

    private static void printBaggagePerDestination(Map<Country, List<Baggage>> result){
        for (Map.Entry<Country,List<Baggage>> entry: result.entrySet()) {
            System.out.println("    -For the flight to " + entry.getKey() + ", these baggages are registered: ");
            for (Baggage baggage : entry.getValue()) {
                    System.out.println("        -The baggage with the id: " + baggage.getId() + ", with the weight: " + baggage.getWeight() +".");
                }
        }
    }

    public static void main(String[] args) {
        Flight flight0 = new Flight(Country.GERMANY, Country.ARGENTINA);
        Flight flight1 = new Flight(Country.ARGENTINA, Country.GERMANY);
        Flight flight2 = new Flight(Country.FRANCE, Country.GERMANY);
        Baggage baggage0 = new Baggage(50, flight0);
        Baggage baggage1 = new Baggage(120, flight1);
        Baggage baggage2 = new Baggage(80, flight2);
        Baggage baggage3 = new Baggage(90, flight2);
        ArrayList<Baggage> dataSet = new ArrayList<>(Arrays.asList(baggage2, baggage1, baggage0, baggage3));
        System.out.println("Amount of baggages in the airport: " + BaggageControlUnit.countBaggages(dataSet.stream()) + ".");
        System.out.println();
        System.out.println("Amount of baggages on the flight from france to germany: " + BaggageControlUnit.countBaggagesForFlight(dataSet.stream(), flight2.getId()) + ".");
        System.out.println();
        System.out.println("Total weight of all the baggages: " + BaggageControlUnit.sumWeight(dataSet.stream()) + ".");
        System.out.println();
        System.out.println("The average weight of a baggage: " + BaggageControlUnit.averageWeight(dataSet.stream()) + ".");
        System.out.println();
        BaggageControlUnit.overweightBaggages(dataSet.stream(), MAX_WEIGHT);
        System.out.println("Overweight baggages:");
        printOverweightBaggages(dataSet);
        System.out.println();
        Map<UUID, Long> result = BaggageControlUnit.baggageCountPerFlight(dataSet.stream());
        System.out.println("Baggages per flight: ");
        printBaggageCountPerFlight(result);
        System.out.println();
        Map<Country, List<Baggage>> groupByResult = BaggageControlUnit.groupByDestination(dataSet.stream());
        System.out.println("Baggages per destination: ");
        printBaggagePerDestination(groupByResult);
    }
     */
}
