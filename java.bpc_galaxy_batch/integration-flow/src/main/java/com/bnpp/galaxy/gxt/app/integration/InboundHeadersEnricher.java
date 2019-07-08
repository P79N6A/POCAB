package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.gxt.app.integration.exception.IntegrationRuntimeException;
import com.bnpp.galaxy.gxt.app.integration.exception.JobLockedException;
import com.bnpp.galaxy.gxt.app.integration.exception.NonUniqueContentTypeException;
import com.bnpp.galaxy.gxt.app.integration.exception.NonUniqueMatchingPartnershipException;
import com.bnpp.galaxy.gxt.app.utils.SupportedContentType;
import com.bnpp.galaxy.services.partnership.PartnershipNotFoundException;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.integration.dsl.HeaderEnricherSpec;
import org.springframework.messaging.Message;
import org.springframework.util.StringUtils;

import java.nio.file.Path;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;

import static com.bnpp.galaxy.gxt.app.common.utils.Constants.*;

/**
 * Base class for headers enricher that will inject all required headers into
 * inbound message. All headers keys are defined in
 * {@link com.bnpp.galaxy.gxt.app.common.utils.Constants Constants} and may be
 * conveniently read using {@link HeadersReader HeadersReader}.
 *
 * @see Lenient
 * @see Strict
 */
public abstract class InboundHeadersEnricher implements Consumer<HeaderEnricherSpec> {
    private final PartnershipService partnershipService;

    @Value("${spring.application.partnership.executionLock}")
    private String executionLock;

    public InboundHeadersEnricher(PartnershipService partnershipService) {
        this.partnershipService = partnershipService;
    }

    @Override
    public void accept(HeaderEnricherSpec e) {
        e.defaultOverwrite(true).headerFunction(INPUT_ID_HEADER, this::extractUUID)
                .headerFunction(INPUT_TS_HEADER, this::extractTimestamp)
                .headerFunction(INPUT_FILENAMES_HEADER, this::extractInputPaths)
                .headerFunction(PARTNERSHIP_HEADER, this::loadPartnership, false)
                .headerFunction(CONTENT_TYPE_HEADER, this::extractContentType);
    }

    private String extractUUID(Message<?> message) {
        return UUID.randomUUID().toString();
    }

    private long extractTimestamp(Message<?> message) {
        return Optional.ofNullable(message.getHeaders().getTimestamp()).orElseGet(System::currentTimeMillis);
    }

    Collection<Path> extractInputPaths(Message<Collection<Path>> message) {
        Collection<Path> paths = message.getPayload();

        if (paths.isEmpty()) {
            throw new IllegalStateException("Invalid message with empty payload");
        }

        return paths;
    }

    abstract protected String extractContentType(Message<Collection<Path>> message);

    abstract protected PartnershipSettings loadPartnership(Message<Collection<Path>> message);

    PartnershipSettings retrievePartnership(String filename) {
        try {
            return partnershipService.findPartnershipSettingsMatching(filename);
        } catch (PartnershipNotFoundException e) {
            throw new IntegrationRuntimeException(e);
        }
    }

    void lockJobInstance(String partnershipName) {
        try {
            Partnership partnership = partnershipService.findPartnershipByName(partnershipName);
            partnership.setExecutionLock(executionLock);
            partnershipService.save(partnership);
        } catch (PartnershipNotFoundException e) {
            throw new IntegrationRuntimeException(e);
        }
    }

    /**
     * Headers enricher that will inject all required headers into inbound message.
     * All headers keys are defined in
     * {@link com.bnpp.galaxy.gxt.app.common.utils.Constants Constants} and may be
     * conveniently read using {@link HeadersReader HeadersReader}.
     * <p>
     * That enricher will set the
     * {@link com.bnpp.galaxy.gxt.app.common.utils.Constants#PARTNERSHIP_HEADER
     * PARTNERSHIP_HEADER} based on the first matching file contained in payload,
     * and ignore other files. For a stricter enricher that ensures all inbound
     * files match the same partnership, see {@link Strict}.
     */
    public static final class Lenient extends InboundHeadersEnricher {

        public Lenient(PartnershipService partnershipService) {
            super(partnershipService);
        }

        @Override
        protected PartnershipSettings loadPartnership(Message<Collection<Path>> message) {
            Collection<Path> paths = extractInputPaths(message);
            String filename = paths.iterator().next().getFileName().toString();

            return retrievePartnership(filename);
        }

        @Override
        protected String extractContentType(Message<Collection<Path>> message) {
            Collection<Path> paths = extractInputPaths(message);
            String filename = paths.iterator().next().getFileName().toString();
            String extension = StringUtils.getFilenameExtension(filename);

            return SupportedContentType.ofExtension(extension).getContentType();
        }

    }

    /**
     * Headers enricher that will inject all required headers into inbound message.
     * All headers keys are defined in
     * {@link com.bnpp.galaxy.gxt.app.common.utils.Constants Constants} and may be
     * conveniently read using {@link HeadersReader HeadersReader}.
     * <p>
     * That enricher will set the
     * {@link com.bnpp.galaxy.gxt.app.common.utils.Constants#PARTNERSHIP_HEADER
     * PARTNERSHIP_HEADER} based on the first matching file contained in payload,
     * and check that all other files (if any) match the same partnership. For a
     * less strict enricher, see {@link Lenient}.
     */
    public static final class Strict extends InboundHeadersEnricher {

        public Strict(PartnershipService partnershipService) {
            super(partnershipService);
        }

        @Override
        protected PartnershipSettings loadPartnership(Message<Collection<Path>> message) {
            Collection<Path> paths = extractInputPaths(message);
            PartnershipSettings partnershipSettings = null;

            for (Path path : paths) {
                String filename = path.getFileName().toString();

                if (partnershipSettings == null) {
                    partnershipSettings = retrievePartnership(filename);
                } else {
                    PartnershipSettings second = retrievePartnership(filename);

                    if (partnershipSettings != second) {
                        throw new NonUniqueMatchingPartnershipException(partnershipSettings, second);
                    }

                }

                if (partnershipSettings.isLockedJob()) {
                    throw new JobLockedException(partnershipSettings.getJobName());
                }
                lockJobInstance(partnershipSettings.getName());

            }

            return partnershipSettings;
        }

        @Override
        protected String extractContentType(Message<Collection<Path>> message) {
            Collection<Path> paths = extractInputPaths(message);
            String contentType = null;

            for (Path path : paths) {
                String filename = path.getFileName().toString();
                String extension = StringUtils.getFilenameExtension(filename);

                if (contentType == null) {
                    contentType = SupportedContentType.ofExtension(extension).getContentType();
                } else {
                    String second = SupportedContentType.ofExtension(extension).getContentType();

                    if (!Objects.equals(contentType, second)) {
                        throw new NonUniqueContentTypeException(contentType, second);
                    }
                }
            }

            return contentType;
        }

    }

}
