package com.bnpp.galaxy.gxt.app.integration.exception;

public class UnsupportedPayloadException extends IntegrationRuntimeException {
    public UnsupportedPayloadException() {
        this("Only File or Path payload are supported");
    }

    public UnsupportedPayloadException(String message) {
        super(message);
    }
}
