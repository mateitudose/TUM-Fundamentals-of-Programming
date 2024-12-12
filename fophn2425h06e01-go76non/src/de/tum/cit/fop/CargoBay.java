package de.tum.cit.fop;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CargoBay {
    private String cargoBayId;
    private Map<String, Set<Suitcase>> luggageSortingArea;

    public CargoBay(String cargoBayId) {
        this.cargoBayId = cargoBayId;
        this.luggageSortingArea = new HashMap<>();
    }

    public String getCargoBayId() {
        return cargoBayId;
    }


    public void acceptCheckedBag(Suitcase suitcase) {
        luggageSortingArea.computeIfAbsent(suitcase.getFlightId(), k -> new HashSet<>()).add(suitcase);
    }

    public Set<Suitcase> sendOutLuggageForFlight(String flightId) {
        Set<Suitcase> luggageToDepart = luggageSortingArea.get(flightId);
        luggageSortingArea.remove(flightId);
        return luggageToDepart;
    }

}
