package com.bnpp.galaxy.gxt.app.exception;

public interface GxtExceptionThrower<T, E extends Exception> {

    void throwException(T source) throws E;

}
