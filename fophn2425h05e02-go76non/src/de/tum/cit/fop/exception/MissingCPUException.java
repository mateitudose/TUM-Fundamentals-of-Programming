package de.tum.cit.fop.exception;

public class MissingCPUException extends BootFailedException {
    public MissingCPUException(String message) {
        super(message);
    }

    public MissingCPUException() {
        super("Could not identify the CPU.");
    }
}
