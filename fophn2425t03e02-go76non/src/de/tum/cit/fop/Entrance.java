package de.tum.cit.fop;

public class Entrance {
    private FanQueue queue;

    // TODO: Implement the constructor.

    public Entrance() {
        this.queue = new FanQueue();
    }

    // TODO 3.1: Implement the enqueue method.
    public void enqueue(Fan fan) {
        queue.enqueue(fan);
    }

    // TODO 3.2: Implement the dequeue method.
    public Fan dequeue() {
        Fan currentFan = queue.dequeue();
        if (currentFan.getTicket().isValid())
            System.out.println("Entry was allowed for: " + currentFan.getName());
        else
            System.out.println("Entry was not allowed for: " + currentFan.getName());
        return currentFan;
    }

    // TODO 3.3: Implement the toString method.
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Fan fan : queue.getFans()) {
            result.append(fan.getAge()).append(" ").append(fan.getName())
                    .append(" has ")
                    .append(fan.getTicket().toString())
                    .append("\n");
        }
        return result.toString();
    }
}
