package com.bnpp.galaxy.event;

public class NotCancellableEventException extends RuntimeException {

    public NotCancellableEventException(String message) {
        super(message);
    }
}
