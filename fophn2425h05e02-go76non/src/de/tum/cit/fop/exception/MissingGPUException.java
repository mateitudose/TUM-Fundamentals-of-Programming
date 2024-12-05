package de.tum.cit.fop.exception;

public class MissingGPUException extends BootFailedException {
    public MissingGPUException(String message) {
        super(message);
    }

    public MissingGPUException() {
        super("Could not identify the GPU.");
    }
}
