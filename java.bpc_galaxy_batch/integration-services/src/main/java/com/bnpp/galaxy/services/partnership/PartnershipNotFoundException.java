package com.bnpp.galaxy.services.partnership;

public class PartnershipNotFoundException extends RuntimeException {

    public PartnershipNotFoundException(String message) {
        super(message);
    }

    public static PartnershipNotFoundException forInputFile(String filename) {
        return new PartnershipNotFoundException(String.format("No partnership found matching filename: %s", filename));
    }

}
