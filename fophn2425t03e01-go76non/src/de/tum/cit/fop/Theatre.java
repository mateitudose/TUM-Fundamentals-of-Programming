package de.tum.cit.fop;

import java.util.List;

public class Theatre {
    private Hall hall;
    private Wardrobe wardrobe;
    private List<Customer> queue;

    public Theatre(Hall hall, Wardrobe wardrobe) {
        this.hall = hall;
        this.wardrobe = wardrobe;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public void setWardrobe(Wardrobe wardrobe) {
        this.wardrobe = wardrobe;
    }

    public List<Customer> getQueue() {
        return queue;
    }

    public void setQueue(List<Customer> queue) {
        this.queue = queue;
    }

    public void processQueue() {
        if(!queue.isEmpty()) {
            Customer customer = queue.get(0);
            if(hall.enteredHall(customer)) {
                customer.successfullyEnteredHall(wardrobe);
                queue.remove(0);
            } else {
                customer.failedToEnterHall();
                queue.add(customer);
                queue.remove(0);
            }
        }
    }
}
