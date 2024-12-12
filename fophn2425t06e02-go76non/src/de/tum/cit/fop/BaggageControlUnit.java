package de.tum.cit.fop;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BaggageControlUnit {
    public static long countBaggages(Stream<Baggage> baggageStream) {
        return baggageStream.count();
    }

    public static long countBaggagesForFlight(Stream<Baggage> baggageStream, UUID flightId) {
        return baggageStream.filter(baggage -> baggage.getFlight().getId() == flightId).count();
    }

    public static double sumWeight(Stream<Baggage> baggageStream) {
        return baggageStream.mapToDouble(Baggage::getWeight).sum();
    }

    public static double averageWeight(Stream<Baggage> baggageStream) {
        return baggageStream.mapToDouble(Baggage::getWeight).average().orElse(-1);
    }

    public static void overweightBaggages(Stream<Baggage> baggageStream, double maxWeight) {
        baggageStream.filter(baggage -> baggage.getWeight() > maxWeight).forEach(baggage -> baggage.setOverweight(true));
    }

    public static Map<UUID, Long> baggageCountPerFlight(Stream<Baggage> baggageStream) {
        return baggageStream.collect(Collectors.groupingBy(baggage -> baggage.getFlight().getId(), Collectors.counting()));
    }

    public static Map<Country, List<Baggage>> groupByDestination(Stream<Baggage> baggageStream) {
        return baggageStream.collect(Collectors.groupingBy(baggage -> baggage.getFlight().getTo()));
    }
}
