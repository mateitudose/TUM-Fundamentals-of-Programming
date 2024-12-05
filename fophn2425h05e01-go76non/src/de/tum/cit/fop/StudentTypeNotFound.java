package de.tum.cit.fop;

public class StudentTypeNotFound extends Exception {
    public StudentTypeNotFound(){
        super("Student type was not found, please try again.");
    }
    
    public StudentTypeNotFound(String s) {
        super(s);
    }
}
