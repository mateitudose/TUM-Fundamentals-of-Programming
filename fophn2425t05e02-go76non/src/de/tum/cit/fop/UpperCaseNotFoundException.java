package de.tum.cit.fop;

public class UpperCaseNotFoundException extends Exception {
    public UpperCaseNotFoundException() {
    }

    public UpperCaseNotFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UpperCaseNotFoundException: Your password needs at least one uppercase character.";
    }
}
