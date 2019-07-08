package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.nio.file.Path;
import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Helper class to extract headers from a {@link Message}.
 */
public final class HeadersReader {

    private final MessageHeaders headers;

    private HeadersReader(MessageHeaders headers) {
        this.headers = headers;
    }

    public MessageHeaders getRawHeaders() {
        return headers;
    }

    @SuppressWarnings("unchecked")
    private <T> Collection<T> getCollection(String key) {
        Object value = headers.get(key);

        if (value instanceof Collection) {
            return (Collection<T>) value;
        } else if (value instanceof Iterable) {
            return StreamSupport.stream(((Iterable<T>) value).spliterator(), false).collect(Collectors.toList());
        } else if (value == null) {
            return Collections.emptyList();
        } else {
            return Collections.singleton((T) value);
        }
    }

    public String getInputId() {
        return headers.get(Constants.INPUT_ID_HEADER, String.class);
    }

    public Instant getTimestamp() {
        return Instant.ofEpochMilli(Objects.requireNonNull(headers.get(Constants.INPUT_TS_HEADER, Long.class), "Message timestamp"));
    }

    public String getContentType() {
        return headers.get(Constants.CONTENT_TYPE_HEADER, String.class);
    }

    public PartnershipSettings getPartnership() {
        return headers.get(Constants.PARTNERSHIP_HEADER, PartnershipSettings.class);
    }

    public Collection<Path> getInputFiles() {
        return getCollection(Constants.INPUT_FILENAMES_HEADER);
    }

    public Path getOutputFile() {
        return headers.get(Constants.OUTPUT_FILENAME_HEADER, Path.class);
    }

    public boolean isVacation() {
        if (!headers.containsKey(Constants.VACATION_HEADER)) {
            return false;
        }

        Boolean value = headers.get(Constants.VACATION_HEADER, Boolean.class);

        return value != null && value;
    }

    /**
     * Build a reader that will retrieve headers from given message
     *
     * @param message The full {@link Message}
     * @return a new reader
     */
    public static HeadersReader of(Message<?> message) {
        return of(message.getHeaders());
    }

    /**
     * Build a reader that will directly read given headers
     *
     * @param headers The headers to read from
     * @return a new reader
     */
    public static HeadersReader of(MessageHeaders headers) {
        return new HeadersReader(headers);
    }

}
