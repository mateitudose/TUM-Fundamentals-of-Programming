package de.tum.cit.fop;

public class SpecialCharNotFoundException extends Exception {
  public SpecialCharNotFoundException() {
  }

  public SpecialCharNotFoundException(String message) {
        super(message);
    }

  @Override
  public String toString() {
    return "SpecialCharNotFoundException: Your password needs at least one special character.";
  }
}
