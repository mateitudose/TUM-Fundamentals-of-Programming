package de.tum.cit.fop;

public class ComputerScienceStudent extends Student {
    public ComputerScienceStudent(String name, String studentId) {
        super(name, studentId);
    }

    public void takeShower() {
        System.out.println("Method takeShower() called (and ignored)!");
    }
}
