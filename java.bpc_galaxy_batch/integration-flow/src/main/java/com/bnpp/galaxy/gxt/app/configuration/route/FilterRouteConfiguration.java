package com.bnpp.galaxy.gxt.app.configuration.route;

import com.bnpp.galaxy.gxt.app.configuration.Channels;
import com.bnpp.galaxy.gxt.app.integration.ContentTypeRouter;
import com.bnpp.galaxy.gxt.app.integration.InputFileCsvFormatFilter;
import com.bnpp.galaxy.gxt.app.integration.InputFileXmlFormatFilter;
import com.bnpp.galaxy.gxt.app.integration.PushMessageSelector;
import com.bnpp.galaxy.gxt.app.utils.SupportedContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;

/**
 * Definition of routes for filter operations
 */
@Configuration
public class FilterRouteConfiguration {
    @Autowired
    private PushMessageSelector messageSelector;

    @Bean
    public InputFileXmlFormatFilter validateXmlInputFile() {
        return new InputFileXmlFormatFilter();
    }

    @Bean
    public InputFileCsvFormatFilter validateInputFileCsv() {
        return new InputFileCsvFormatFilter();
    }

    @Bean
    public IntegrationFlow filterEntryFlow() {
        return IntegrationFlows.from(Channels.FILTER_ENTRY_CHANNEL)
                               .route(filterByFilePayloadTypeRouter())
                               .get();
    }

    @Bean
    public ContentTypeRouter filterByFilePayloadTypeRouter() {
        return new ContentTypeRouter()
                .channelMapping(SupportedContentType.MS_EXCEL, Channels.FILTER_XLS_CHANNEL)
                .channelMapping(SupportedContentType.MS_EXCEL_OOXML, Channels.FILTER_XLS_CHANNEL)
                .channelMapping(SupportedContentType.XML, Channels.FILTER_XML_CHANNEL)
                .channelMapping(SupportedContentType.CSV, Channels.FILTER_CSV_CHANNEL);
    }

    @Bean
    public IntegrationFlow filterXml() {
        return IntegrationFlows.from(Channels.FILTER_XML_CHANNEL)
                               .filter(validateXmlInputFile())
                               .channel(Channels.FILTER_END_CHANNEL)
                               .get();
    }

    @Bean
    public IntegrationFlow filterCsv() {
        return IntegrationFlows.from(Channels.FILTER_CSV_CHANNEL)
                               .channel(Channels.FILTER_END_CHANNEL)
                               .get();
    }

    @Bean
    public IntegrationFlow filterXls() {
        return IntegrationFlows.from(Channels.FILTER_XLS_CHANNEL)
                               .channel(Channels.FILTER_END_CHANNEL)
                               .get();
    }

    @Bean
    public IntegrationFlow filterEndFlow() {
        return IntegrationFlows.from(Channels.FILTER_END_CHANNEL)
                               .filter(messageSelector)
                               .channel(Channels.JOB_CHANNEL)
                               .get();
    }

}
