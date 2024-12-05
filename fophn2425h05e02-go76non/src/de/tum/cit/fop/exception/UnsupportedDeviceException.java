package de.tum.cit.fop.exception;

public class UnsupportedDeviceException extends BootFailedException {
    public UnsupportedDeviceException(String message) {
        super(message);
    }

    public UnsupportedDeviceException() {
        super("Unsupported device detected.");
    }
}
