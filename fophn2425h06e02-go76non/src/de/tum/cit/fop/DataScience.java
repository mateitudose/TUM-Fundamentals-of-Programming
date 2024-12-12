package de.tum.cit.fop;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class DataScience {

    private DataScience() {
    }

    public static String outputFlightInformation(Stream<Flight> flightStream, String flightNumber) {
        return flightStream.filter(flight -> flight.getFlightNumber().equals(flightNumber)).findFirst().map(Flight::toString).orElse("The flight with FlightNumber " + flightNumber + " does not exist");
    }

    public static int getFuelDemandOfAirline(Stream<Flight> flightStream, Airline airline) {
        return flightStream.map(Flight::getAircraftData).filter(aircraftData -> aircraftData.getAirline().equals(airline)).mapToInt(AircraftData::getFuel).sum();
    }

    public static double getAverageDurationOfAllFlights(Stream<Flight> flightStream) {
        return flightStream.mapToDouble(Flight::getDuration).average().orElse(0.0);
    }

    public static Map<Airline, Long> getFlightCountPerAirline(List<Flight> flightList) {
        return flightList.stream().collect(Collectors.groupingBy(flight -> flight.getAircraftData().getAirline(), Collectors.counting()));
    }

    public static long getCountOfSchengenFlights(Stream<Flight> flightStream) {
        return flightStream.filter(Flight::isSchengen).count();
    }

    public static double getAverageNumberOfPassengersPerNonSchengenFlight(Stream<Flight> flightStream) {
        return flightStream.filter(flight -> !flight.isSchengen()).mapToInt(flight -> flight.getAircraftData().getNumberOfPassenger()).average().orElse(0.0);
    }

    public static List<String> getAllDestinationsNotInSchengenAreaAsList(Stream<Flight> flightStream) {
        return flightStream.filter(flight -> !flight.isSchengen()).map(Flight::getDestination).distinct().sorted().toList();
    }

    public static Map<String, LocalDateTime> getCalculatedArrivalTime(Stream<Flight> flightStream) {
        return flightStream.collect(Collectors.toMap(Flight::getFlightNumber, flight -> flight.getDate().plusMinutes(flight.getDuration())));
    }

    public static Map<AircraftType, Long> getFlightCountPerAircraftType(List<Flight> flightList) {
        return flightList.stream().collect(Collectors.groupingBy(flight -> flight.getAircraftData().getAircraft(), Collectors.counting()));
    }

    public static List<String> getDestinationsWithinGateRange(Stream<Flight> flightStream, String gateFrom, String gateTo) {
        return flightStream.filter(flight -> flight.getDepartureGate().compareTo(gateFrom) >= 0 && flight.getDepartureGate().compareTo(gateTo) <= 0).map(Flight::getDestination).distinct().sorted().toList();
    }

    // Hard one!
    public static Map<String, Integer> getAvgNumberOfPassengersPerDestination(List<Flight> flightList) {
        return flightList.stream().collect(Collectors.groupingBy(Flight::getDestination, Collectors.averagingInt(flight -> flight.getAircraftData().getNumberOfPassenger()))).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, entry -> (int) Math.floor(entry.getValue())));
    }

    public static Map<String, Set<Flight>> getAllFlightsFromGate(List<Flight> flightList) {
        return flightList.stream().collect(Collectors.groupingBy(Flight::getDepartureGate)).entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, stringListEntry -> new HashSet<>(stringListEntry.getValue())));
    }

}
