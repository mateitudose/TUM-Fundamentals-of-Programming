package de.tum.cit.fop.exception;

public class MissingConnectorException extends BootFailedException {
    public MissingConnectorException(String message) {
        super(message);
    }

    public MissingConnectorException() {
        super("Connector type provided is not supported.");
    }
}
