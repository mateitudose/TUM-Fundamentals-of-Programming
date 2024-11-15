package de.tum.cit.fop;

public class Main {
    public static void main(String[] args) {
        // TODO 4: Uncomment the code below and do the tasks.
        Fan fan1 = new Fan(52, "Socrates",  new Ticket(true));
        Fan fan2 = new Fan(22, "Platon",  new Ticket(false));
        Fan fan3 = new Fan(45, "Archimedes",  new Ticket(false));

        Entrance entrance = new Entrance();
        entrance.enqueue(fan1);
        entrance.enqueue(fan2);
        entrance.enqueue(fan3);
        System.out.println(entrance);
        entrance.dequeue();
        entrance.dequeue();
        entrance.dequeue();
    }
}
