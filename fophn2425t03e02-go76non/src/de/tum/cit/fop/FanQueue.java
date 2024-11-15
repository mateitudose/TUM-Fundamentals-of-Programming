package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class FanQueue {
    private List<Fan> fans;

    public FanQueue() {
        fans = new ArrayList<>();
    }

    public List<Fan> getFans() {
        return fans;
    }

    // TODO 2.1 & 2.2: Implement enqueue and dequeue methods.
    public void enqueue(Fan fan) {
        fans.add(fan);
    }

    public Fan dequeue() {
        if (fans.isEmpty()) {
            return null;
        }
        return fans.remove(0);
    }

    public int size() {
        // TODO 2.3: Implement size method.
        if (fans != null) {
            return fans.size();
        }
        return 0;
    }

    public boolean isEmpty() {
        // TODO 2.4: Implement isEmpty method.
        if (fans.isEmpty()) {
            return true;
        }
        return false;
    }
}
