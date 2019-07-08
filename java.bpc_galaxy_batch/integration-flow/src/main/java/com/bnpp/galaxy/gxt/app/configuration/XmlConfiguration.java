package com.bnpp.galaxy.gxt.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class XmlConfiguration {

    @Bean(name = "readerMarshaller")
    public Jaxb2Marshaller inJaxb2Marshaller() {
        Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
        unmarshaller.setPackagesToScan("com.bnpp.galaxy.gxt.app.generatedxml");
        return unmarshaller;
    }

    @Bean(name = "writerMarshaller")
    public Jaxb2Marshaller outJaxb2Marshaller() {
        Jaxb2Marshaller unmarshaller = new Jaxb2Marshaller();
        unmarshaller.setPackagesToScan("net.sophis");
        return unmarshaller;
    }

}
