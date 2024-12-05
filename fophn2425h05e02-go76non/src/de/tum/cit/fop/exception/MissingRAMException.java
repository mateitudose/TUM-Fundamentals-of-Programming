package de.tum.cit.fop.exception;

public class MissingRAMException extends BootFailedException {
    public MissingRAMException(String message) {
        super(message);
    }

    public MissingRAMException() {
        super("Could not identify the RAM.");
    }
}
