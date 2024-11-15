package de.tum.cit.fop;

public class Fan {
    // TODO 1.1: Add the attributes.
    private int age;
    private String name;
    private Ticket ticket;

    // TODO 1.2: Implement the constructor.

    public Fan(int age, String name, Ticket ticket) {
        this.age = age;
        this.name = name;
        this.ticket = ticket;
    }

    // TODO 1.3: Create getters and setters.

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
