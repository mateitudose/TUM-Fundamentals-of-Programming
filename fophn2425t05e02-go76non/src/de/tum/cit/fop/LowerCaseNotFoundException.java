package de.tum.cit.fop;

public class LowerCaseNotFoundException extends Exception {
    public LowerCaseNotFoundException() {
    }

    public LowerCaseNotFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "LowerCaseNotFoundException: Your password needs at least one lowercase character.";
    }
}
