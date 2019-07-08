package com.bnpp.galaxy.gxt.app.integration.exception;

import com.bnpp.galaxy.services.partnership.PartnershipSettings;

public class NonUniqueMatchingPartnershipException extends IntegrationRuntimeException {
    public NonUniqueMatchingPartnershipException(PartnershipSettings first, PartnershipSettings second) {
        super(String.format("Multiple partnership found for message, where only 1 was expected: %s %s", first, second));
    }
}
