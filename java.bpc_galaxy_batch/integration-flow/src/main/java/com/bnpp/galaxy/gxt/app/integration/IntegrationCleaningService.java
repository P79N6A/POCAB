package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.Objects;

/**
 * Service responsible for purging input/transient files.
 */
@Service
public class IntegrationCleaningService implements InitializingBean {

    private final Logger logger = LogManager.getLogger(getClass());

    private final IntegrationProperties properties;
    private final Collection<InboundChannelFileListFilter> inboundFilters;

    public IntegrationCleaningService(IntegrationProperties properties, Collection<InboundChannelFileListFilter> inboundFilters) {
        this.properties = properties;
        this.inboundFilters = inboundFilters;
    }

    private IntegrationProperties.Purge config() {
        return properties.getPurge();
    }

    @Override
    public void afterPropertiesSet() {
        Objects.requireNonNull(config().getMode(), "IntegrationCleaningService.purgeMode should not be null");

        switch (config().getMode()) {
            case AUTO:
                logger.info("IntegrationCleaningService is enabled in 'automatic' mode. Input files will be purged automatically at end of integration flow.");
                break;
            case NONE:
                logger.info("IntegrationCleaningService is disabled. No purge of input files will occur.");
                break;
            case MANUAL:
                logger.info("IntegrationCleaningService is enabled in 'manual' mode. Input files may be puge manually.");
                break;
        }

        if (config().isResetInboundFilter()) {
            logger.info("IntegrationCleaningService will also reset inbound filters on purge");
        }
    }

    /**
     * @param message The message used to retrieve files to purge
     * @throws IOException If an error occur
     */
    public void purge(Message<?> message) throws IOException {
        if (config().getMode() == IntegrationProperties.Purge.PurgeMode.NONE) {
            logger.warn("Calling IntegrationCleaningService has no effect: PurgeMode is NONE");
            return;
        }

        doPurge(message);
    }

    /**
     * Should only be called directly from integration flow. Do not call outside of an integration flow handler. Use
     * {@link #purge(Message)} instead.
     *
     * @param message The message used to retrieve files to purge
     * @throws IOException If an error occur
     */
    public void purgeAfter(Message<?> message) throws IOException {
        if (config().getMode() != IntegrationProperties.Purge.PurgeMode.AUTO) {
            logger.trace("Skipping IntegrationCleaningService after batch processing");
            return;
        }

        doPurge(message);
    }

    private void doPurge(Message<?> message) throws IOException {
        HeadersReader r = HeadersReader.of(message);
        Instant timestamp = r.getTimestamp();
        String id = r.getInputId();
        Collection<Path> paths = r.getInputFiles();
        boolean resetInboundFilters = config().isResetInboundFilter() && inboundFilters != null;

        logger.info("Calling IntegrationCleaningService for message id[{}], timestamp[{}], paths[{}]", id, timestamp, paths);

        for (Path path : paths) {
            Files.deleteIfExists(path);

            if (resetInboundFilters) {
                inboundFilters.forEach(filter -> filter.remove(path.toFile()));
            }
        }
    }

}
