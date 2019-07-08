package com.bnpp.galaxy.gxt.app.configuration.route;

import com.bnpp.galaxy.gxt.app.configuration.Channels;
import com.bnpp.galaxy.gxt.app.integration.ContentTypeRouter;
import com.bnpp.galaxy.gxt.app.integration.InboundHeadersEnricher;
import com.bnpp.galaxy.gxt.app.integration.InboundPayloadTransformer;
import com.bnpp.galaxy.gxt.app.utils.SupportedContentType;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

import static com.bnpp.galaxy.gxt.app.configuration.Channels.INBOUND_CHANNEL;

/**
 * Definition of routes for enricher operations
 */
@Configuration
public class EnricherRouteConfiguration {

    @Autowired
    private InboundPayloadTransformer inboundPayloadTransformer;

    @Autowired
    private InboundHeadersEnricher inboundHeadersEnricher;

    @Bean
    public IntegrationFlow entryFlow() {
        return IntegrationFlows
                .from(INBOUND_CHANNEL)
                .transform(inboundPayloadTransformer)
                .enrichHeaders(inboundHeadersEnricher)
                .route(enrichByFilePayloadTypeRouter())
                .get();
    }

    @Bean
    public ContentTypeRouter enrichByFilePayloadTypeRouter() {
        return new ContentTypeRouter()
                .channelMapping(SupportedContentType.MS_EXCEL, Channels.ENRICHER_END_CHANNEL)
                .channelMapping(SupportedContentType.MS_EXCEL_OOXML, Channels.ENRICHER_END_CHANNEL)
                .channelMapping(SupportedContentType.XML, Channels.ENRICHER_END_CHANNEL)
                .channelMapping(SupportedContentType.CSV, Channels.ENRICHER_END_CHANNEL);
    }

    @Bean
    public IntegrationFlow enricherEndFlow() {
        return IntegrationFlows.from(Channels.ENRICHER_END_CHANNEL)
                .channel(Channels.TRANSFORMATION_ENTRY_CHANNEL)
                .get();
    }

    @Configuration
    public static class EnrichersConfiguration {

        @Autowired
        private PartnershipService partnershipService;

        @Bean
        public InboundPayloadTransformer inboundPayloadTransformer() {
            return new InboundPayloadTransformer();
        }

        @Bean("inboundHeadersEnricher")
        @Profile("dev")
        public InboundHeadersEnricher strictInboundHeadersEnricher() {
            return new InboundHeadersEnricher.Strict(partnershipService);
        }

        @Bean("inboundHeadersEnricher")
        @Profile("!dev")
        public InboundHeadersEnricher lenientInboundHeadersEnricher() {
            return new InboundHeadersEnricher.Lenient(partnershipService);
        }

    }

}
