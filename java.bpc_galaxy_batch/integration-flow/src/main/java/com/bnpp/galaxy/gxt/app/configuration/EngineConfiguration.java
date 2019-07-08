package com.bnpp.galaxy.gxt.app.configuration;

import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bnpp.galaxy.gxt.app.cache.CacheableFilterServiceDecorator;
import com.bnpp.galaxy.gxt.app.configuration.GatewayConfiguration.GxtMassagingGateway;
import com.bnpp.galaxy.gxt.app.engine.configuration.support.resource.JacksonResourceReader;
import com.bnpp.galaxy.gxt.app.engine.configuration.support.resource.JoltResourceReader;
import com.bnpp.galaxy.gxt.app.engine.configuration.support.resource.PreloadableResourcesGXTEngineConfigurationRegistry;
import com.bnpp.galaxy.gxt.app.engine.core.GXTEngine;
import com.bnpp.galaxy.gxt.app.engine.core.json.JsonGXTEngine;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FilterService;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestServicesRegistry;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.impl.services.ExampleFilterService;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.impl.services.PassThroughTranscodingService;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.impl.services.StaticTranscodingService;

/**
 * GXT configuration (Fusion Invest services proxies, etc.)
 */
@Configuration
public class EngineConfiguration {

    @Autowired
    private ListableBeanFactory beanFactory;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    GxtMassagingGateway gxtMassagingGateway;

    @Bean
    public FusionInvestServicesRegistry fusionInvestServicesRegistry() {
        AutoDiscoveringServicesRegistry registry = new AutoDiscoveringServicesRegistry(beanFactory);

        registry.register(new StaticTranscodingService<>("static_value"));

        return registry;
    }

    @Bean
    public FilterService<List<Object>> exampleFilterService() {
        return new CacheableFilterServiceDecorator<>(new ExampleFilterService());
    }

    @Bean
    public PassThroughTranscodingService passthroughTranscodingService() {
        return new PassThroughTranscodingService();
    }

    @Bean
    public GXTEngine gxtEngine() {
        return new JsonGXTEngine(fusionInvestServicesRegistry(), objectMapper, Optional.ofNullable(gxtMassagingGateway), configurationRegistry());
    }

    @Bean
    public PreloadableResourcesGXTEngineConfigurationRegistry configurationRegistry() {
        JoltResourceReader joltResourceReader = new JoltResourceReader();
        JacksonResourceReader jacksonResourceReader = new JacksonResourceReader(objectMapper);

        return new PreloadableResourcesGXTEngineConfigurationRegistry(jacksonResourceReader, joltResourceReader);
    }

//    // TODO Remplacer par le bean ci-dessus
//    @Bean
//    public GXTEngineConfigurationRegistry configurationRegistry() {
//        JoltResourceReader joltResourceReader = new JoltResourceReader();
//        JacksonResourceReader jacksonResourceReader = new JacksonResourceReader(objectMapper);
//
//        return name -> {
//            try {
//                return new SimpleGXTEngineConfiguration(
//                        jacksonResourceReader.read(getClass().getResourceAsStream("/gxt_spec_I_refCours_cours.json"))
//                                             .orElse(null),
//                        joltResourceReader.read(getClass().getResourceAsStream("/jolt_spec_I_refcours_cours.json"))
//                                          .orElse(null)
//                );
//            } catch (Exception e) {
//                throw new RuntimeGXTEngineConfigurationException(e);
//            }
//        };
//    }

}
