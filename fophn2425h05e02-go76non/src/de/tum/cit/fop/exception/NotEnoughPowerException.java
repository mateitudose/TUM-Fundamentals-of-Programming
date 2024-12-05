package de.tum.cit.fop.exception;

public class NotEnoughPowerException extends BootFailedException {
    public NotEnoughPowerException(String message) {
        super(message);
    }

    public NotEnoughPowerException() {
        // No dot here!
        super("Insufficient power to start the system.");
    }
}
