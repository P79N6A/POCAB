package com.bnpp.galaxy.gxt.app.integration.exception;

public class NonUniqueContentTypeException extends IntegrationRuntimeException {
    public NonUniqueContentTypeException(String first, String second) {
        super(String.format("Non unique content type found in message payload: %s %s", first, second));
    }
}
