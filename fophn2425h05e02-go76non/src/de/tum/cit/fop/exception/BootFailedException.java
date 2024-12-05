package de.tum.cit.fop.exception;

public class BootFailedException extends RuntimeException {
    // Superclass for other exceptions.
    public BootFailedException() {
        super("Could not boot the PC, verify the components and try again later.");
    }

    public BootFailedException(String message) {
        super(message);
    }
}
