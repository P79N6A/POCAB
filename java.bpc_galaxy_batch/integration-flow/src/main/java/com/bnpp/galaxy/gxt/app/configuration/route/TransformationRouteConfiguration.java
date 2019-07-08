package com.bnpp.galaxy.gxt.app.configuration.route;

import com.bnpp.galaxy.gxt.app.configuration.Channels;
import com.bnpp.galaxy.gxt.app.integration.ContentTypeRouter;
import com.bnpp.galaxy.gxt.app.integration.XlsToCsvTransformer;
import com.bnpp.galaxy.gxt.app.integration.IntegrationArchiveService;
import com.bnpp.galaxy.gxt.app.utils.SupportedContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.router.HeaderValueRouter;

/**
 * Definition of routes for transformation operations
 */
@Configuration
public class TransformationRouteConfiguration {

    @Autowired
    private IntegrationArchiveService archiver;

    @Bean
    public IntegrationFlow transformationEntryFlow() {
        return IntegrationFlows.from(Channels.TRANSFORMATION_ENTRY_CHANNEL)
                               .route(transformByFilePayloadTypeRouter())
                               .get();
    }

    @Bean
    public HeaderValueRouter transformByFilePayloadTypeRouter() {
        return new ContentTypeRouter()
                .channelMapping(SupportedContentType.MS_EXCEL, Channels.TRANSFORMATION_XLS_CHANNEL)
                .channelMapping(SupportedContentType.MS_EXCEL_OOXML, Channels.TRANSFORMATION_XLS_CHANNEL)
                .channelMapping(SupportedContentType.XML, Channels.TRANSFORMATION_END_CHANNEL)
                .channelMapping(SupportedContentType.CSV, Channels.TRANSFORMATION_END_CHANNEL);
    }

    @Bean
    public IntegrationFlow transformXls() {
        return IntegrationFlows.from(Channels.TRANSFORMATION_XLS_CHANNEL)
                               .channel(Channels.TRANSFORMATION_END_CHANNEL)
                               .get();
    }

    @Bean
    public IntegrationFlow transformationEndFlow() {
        return IntegrationFlows.from(Channels.TRANSFORMATION_END_CHANNEL)
                               .channel(Channels.FILTER_ENTRY_CHANNEL)
                               .get();
    }

    @Bean
    public XlsToCsvTransformer xlsToCsvTransformer() {
        return new XlsToCsvTransformer(archiver);
    }

}
