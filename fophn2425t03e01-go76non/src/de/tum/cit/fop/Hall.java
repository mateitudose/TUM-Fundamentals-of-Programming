package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private int maxCapacity;
    private List<Customer> people;

    public Hall(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.people = new ArrayList<>();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public List<Customer> getPeople() {
        return people;
    }

    public void setPeople(List<Customer> people) {
        this.people = people;
    }

    public boolean enteredHall(Customer customer) {
        if (people.size() < maxCapacity) {
            people.add(customer);
            System.out.println(customer.getName() + " entered");
            return true;
        } else {
            System.out.println(customer.getName() + " could not enter");
            return false;
        }
    }

    public void customerLeft(Customer customer) {
        people.remove(customer);
        System.out.println(customer.getName() + " left");
    }
}
