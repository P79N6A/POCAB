package com.bnpp.galaxy.gxt.app.configuration;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

import com.bnpp.galaxy.gxt.app.engine.report.AbstractGxtMessagingProcess;
import com.bnpp.galaxy.gxt.app.report.GxtManagerMessagingHandler;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {
	
	@MessagingGateway(defaultRequestChannel = "gxtMessagingChanel")
    public interface GxtMassagingGateway {
        void send(AbstractGxtMessagingProcess data);
    }
    
    @Bean
    public PublishSubscribeChannel gxtMessagingChanel() {
        return new PublishSubscribeChannel();
    }
    
    @Bean
    public GxtManagerMessagingHandler gxtManagerMessagingHandler() {
        return new GxtManagerMessagingHandler();
    }
 
    /**
     * Channel gateway de redirection des messages d'erreur fonctionnel (reader, processor)
     * @return
     */
    @Bean
    public IntegrationFlow gatewayFlow() {
        return IntegrationFlows.from("gxtMessagingChanel")
        		.handle(gxtManagerMessagingHandler())
				.get();
    }

}
