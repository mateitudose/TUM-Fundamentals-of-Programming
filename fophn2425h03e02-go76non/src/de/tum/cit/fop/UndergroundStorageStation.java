package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class UndergroundStorageStation {
    private int amountOfStubs;
    private List<StubTrack> stubs;

    public UndergroundStorageStation(int amountOfStubs, int capacity) {
        this.amountOfStubs = amountOfStubs;
        // This line creates an ArrayList with an initial capacity of amountOfStubs. This means that the list is pre-allocated to hold amountOfStubs elements, which can improve performance by reducing the need for resizing as elements are added. However, it does not actually populate the list with StubTrack instances; it only sets the initial capacity.
        this.stubs = new ArrayList<>(amountOfStubs);
        for (int i = 0; i < amountOfStubs; i++) {
            this.stubs.add(new StubTrack(capacity));
        }
    }

    public int getAmountOfStubs() {
        return amountOfStubs;
    }

    public void setAmountOfStubs(int amountOfStubs) {
        this.amountOfStubs = amountOfStubs;
    }

    public List<StubTrack> getStubs() {
        return stubs;
    }

    public void setStubs(List<StubTrack> stubs) {
        this.stubs = stubs;
    }

    public void addStub(StubTrack stub) {
        this.stubs.add(stub);
        amountOfStubs++;
    }

    public int find(int id) {
        for (int i = 0; i < stubs.size(); i++) {
            StubTrack currentStub = stubs.get(i);
            if (currentStub == null) {
                continue;
            }
            for (int j = 0; j < currentStub.getStack().size(); j++) {
                Ubahn currentUbahn = currentStub.getStack().get(j);
                if (currentUbahn == null) {
                    continue;
                }
                if (currentUbahn.getId() == id) {
                    return i;
                }
            }
        }
        return -1;
    }

    public StubTrack arriveStation(Ubahn ubahn) {
        for (int i = 0; i < stubs.size(); i++) {
            StubTrack currentStub = stubs.get(i);
            if (currentStub.push(ubahn)) {
                return currentStub;
            }
        }
        return null;
    }

    public Ubahn departStation() {
        int stubTrackIndex = -1, leastFreeSpots = Integer.MAX_VALUE;
        for (int i = 0; i < stubs.size(); i++) {
            StubTrack currentStub = stubs.get(i);
            if (currentStub == null) {
                continue;
            }
            if (currentStub.amountOfFreeSpots() < leastFreeSpots) {
                leastFreeSpots = currentStub.amountOfFreeSpots();
                stubTrackIndex = i;
            }
        }
        if (stubTrackIndex == -1) {
            return null;
        }
        return stubs.get(stubTrackIndex).pop();
    }
}
