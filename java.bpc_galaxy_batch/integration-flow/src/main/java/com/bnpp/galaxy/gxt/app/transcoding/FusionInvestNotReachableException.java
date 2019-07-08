package com.bnpp.galaxy.gxt.app.transcoding;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestRuntimeException;



public class FusionInvestNotReachableException extends FusionInvestRuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8933721338110772144L;
	private static final String MESSAGE = "Fusion invest server is not reachable. Request: %s. Method: %s. Response: %d %s";

    public FusionInvestNotReachableException(String message) {
        super(message);
    }

    public static FusionInvestNotReachableException forRequest(String request, ResponseEntity<?> response) {
        HttpMethod method = response.getHeaders().getAccessControlRequestMethod();
        return new FusionInvestNotReachableException(String.format(MESSAGE, request, method, response.getStatusCodeValue(), response.getStatusCode().getReasonPhrase()));
    }

}
