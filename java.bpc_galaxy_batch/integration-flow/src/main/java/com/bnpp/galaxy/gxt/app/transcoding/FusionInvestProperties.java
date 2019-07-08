package com.bnpp.galaxy.gxt.app.transcoding;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fusioninvest")
@Data
public class FusionInvestProperties {

    private Transcoding transcoding = new Transcoding();

    @Data
    public static class Transcoding {

        private String endpoint;

    }

}
