package com.bnpp.galaxy.gxt.app.integration;

import org.apache.log4j.Logger;
import org.springframework.integration.core.GenericSelector;
import org.springframework.messaging.Message;

public class InputFileCsvFormatFilter implements GenericSelector<Message<?>> {

    private static final Logger LOGGER = Logger.getLogger(InputFileCsvFormatFilter.class);

    @Override
    public boolean accept(Message<?> message) {
        return true;
    }
}
