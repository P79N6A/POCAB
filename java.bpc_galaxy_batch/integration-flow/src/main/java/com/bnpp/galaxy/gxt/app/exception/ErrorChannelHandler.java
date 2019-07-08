package com.bnpp.galaxy.gxt.app.exception;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

public class ErrorChannelHandler {
	
	private static final Logger LOGGER = Logger.getLogger(ErrorChannelHandler.class);
	
	@ServiceActivator
	public void handle(Message<?> message) {
		try {
			/**
			 * Le payload de la classe MessagingException retourne le message 
			 * d'origine dna sle partie delimitée par { et }
			 */
			Map<String, String> extractPayloadMessagingException = Arrays.stream(StringUtils.substringBetween(message.getPayload().toString(), "{", "}").split(","))
		            .map(s -> s.trim().split("="))
		            .collect(Collectors.toMap(s -> s[0], s -> s[1]));
			
			LOGGER.info("Impossible de traiter le fichier " + extractPayloadMessagingException.get("file_name"));
			throw new ErrorChannelException("Impossible de traiter le fichier '" + extractPayloadMessagingException.get("file_name") + "'");
		} catch (ErrorChannelException e) {
			
			e.printStackTrace();
		}
	}
}
