package com.bnpp.galaxy.exception;

/**
 * All error codes that can be thrown through the application lifecycle.
 */
public enum ErrorCode {

    TE001("TE001", "One result expected and many returned"),
    TE002("TE002", "One result expected and zero returned");

    private final String code;

    private final String message; // error message


    /**
     * Set up the values for the error code.
     *
     * @param errorCode    the error code.
     * @param errorMessage the message error.
     */
    ErrorCode(String errorCode, String errorMessage) {
        this.code = errorCode;
        this.message = errorMessage;
    }


    /**
     * Return a unique code depending on the selected enum value.
     *
     * @return the code
     */
    public String getCode() {
        return code;
    }


    /**
     * Return a description message matching the error code.
     *
     * @return the message
     */
    public String getMessage() {
        return message;
    }
}
