package de.tum.cit.fop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AirPostalService implements Iterable<Parcel> {
    private Parcel[] parcels;
    private Map<String, Worker> workerMap;

    public AirPostalService(Parcel[] parcels) {
        this.parcels = parcels;
        this.workerMap = new HashMap<>();
    }

    public void setParcels(Parcel[] parcels) {
        this.parcels = parcels;
    }

    public Map<String, Worker> getWorkerMap() {
        return workerMap;
    }

    public void setWorkerMap(Map<String, Worker> workerMap) {
        this.workerMap = workerMap;
    }

    public Worker getWorkerById(String id) {
        return workerMap.get(id);
    }

    public void addNewWorker(Worker worker) {
        workerMap.put(worker.getId(), worker);
    }

    public Parcel[] getParcels() {
        return parcels;
    }

    public void setPackages(Parcel[] parcels) {
        this.parcels = parcels;
    }

    // Iterator already implements hasNext() and next()!
    @Override
    public Iterator<Parcel> iterator() {
        return Arrays.stream(parcels).iterator();
    }
}
