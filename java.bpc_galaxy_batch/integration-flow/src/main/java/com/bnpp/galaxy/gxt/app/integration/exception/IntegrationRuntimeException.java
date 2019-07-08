package com.bnpp.galaxy.gxt.app.integration.exception;

public class IntegrationRuntimeException extends RuntimeException {
    public IntegrationRuntimeException(String message) {
        super(message);
    }

    public IntegrationRuntimeException(Throwable cause) {
        super(cause);
    }
}
