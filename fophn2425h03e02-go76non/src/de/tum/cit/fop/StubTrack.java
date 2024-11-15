package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class StubTrack {
    private int capacity;
    private int amountOfUbahns;
    private List<Ubahn> stack;

    public StubTrack(int capacity) {
        this.capacity = capacity;
        this.amountOfUbahns = 0;
        this.stack = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAmountOfUbahns() {
        return amountOfUbahns;
    }

    public void setAmountOfUbahns(int amountOfUbahns) {
        this.amountOfUbahns = amountOfUbahns;
    }

    public List<Ubahn> getStack() {
        return stack;
    }

    public void setStack(List<Ubahn> stack) {
        this.stack = stack;
    }

    public int amountOfFreeSpots() {
        return capacity - amountOfUbahns;
    }

    public int find(int id) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            Ubahn ubahn = stack.get(i);
            if (ubahn.getId() == id)
                return i;
        }
        return -1;
    }

    public Ubahn remove(int id) {
        for (Ubahn ubahn : stack) {
            if (ubahn.getId() == id) {
                stack.remove(ubahn);
                amountOfUbahns--;
                return ubahn;
            }
        }
        return null;
    }

    public boolean push(Ubahn ubahn){
        if (capacity == amountOfUbahns) return false;
        stack.add(ubahn);
        amountOfUbahns++;
        return true;
    }

    public Ubahn pop(){
        // Why doesn't amountOfUbahns == 0 not work here?
        if (stack.size() == 0) return null;
        return stack.remove(--amountOfUbahns);
    }
}
