package com.bnpp.galaxy.services;

import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Application ID provider. Currently deduce application ID from either (in priority order):
 * <ol>
 * <li>Environment property (default looking for {@link #DEFAULT_ENV_PROPERTY_NAME} property, configurable)</li>
 * <li>Spring's context ID, which reads it from <code>spring.application.name</code> application property.</li>
 * <li>Defaults to {@link #UNKNOWN_APP_ID} value</li>
 * </ol>
 */
@Service
@Setter
public class ApplicationIdentity {

    private final static String UNKNOWN_APP_ID            = "$UNKNOWN$";
    private final static String DEFAULT_ENV_PROPERTY_NAME = "instanceID";

    private final ApplicationContext applicationContext;

    private String envPropertyName = DEFAULT_ENV_PROPERTY_NAME;

    public ApplicationIdentity(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    private String getDefaultValue() {
        // TODO verify applicationID is stable
        String id = applicationContext.getId();

        return StringUtils.hasLength(id) ? id : UNKNOWN_APP_ID;
    }

    /**
     * Get application context ID
     *
     * @return the Spring's context ID
     */
    @NonNull
    public String getId() {
        return applicationContext.getEnvironment().getProperty(envPropertyName, getDefaultValue());
    }

}
