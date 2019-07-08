package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.services.ArchiveOption;
import com.bnpp.galaxy.services.ArchiveService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import com.bnpp.galaxy.services.partnership.impl.AbstractPartnerSettings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.file.FileLocker;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.regex.Pattern;

/**
 * Service responsible for archiving input/output/transient files. Actual
 * archiving operations are delegated to an {@link ArchiveService}.
 */
@Service
public class IntegrationArchiveService {

    private final Logger logger = LogManager.getLogger(getClass());
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss.SSS");
    private final ArchiveService delegate;
    @Autowired
    private FileLocker fileLocker;

    public IntegrationArchiveService(ArchiveService delegate) {
        this.delegate = delegate;
    }

    private PartnershipSettings createUnknownPartnership() {
        return new AbstractPartnerSettings("UNKNOWN", Pattern.compile("^$"), "__unknownJob__", null, null) {
        };
    }

    /**
     * Build an archive ID from a message, that is stable over time.
     *
     * @param r The input headers reader
     * @return A stable archive ID for the given message
     */
    private String buildId(HeadersReader r) {
        LocalDateTime date = LocalDateTime.ofInstant(r.getTimestamp(), ZoneId.systemDefault());
        PartnershipSettings partnership = r.getPartnership();

        if (partnership == null) {
            logger.warn("Given message as no partnership, using default [UNKNOWN]");
            partnership = createUnknownPartnership();
        }

        return String.format("%s_%s_%s", partnership.getName(), fmt.format(date), r.getInputId());
    }

    /**
     * Used to archive files BEFORE its payload has been processed. Will typically archive the input file(s).
     *
     * @param message The message
     * @throws IOException If an I/O error occur
     */
    public void archiveBefore(Message<?> message) throws IOException {
        HeadersReader r = HeadersReader.of(message);
        Instant timestamp = r.getTimestamp();
        String id = buildId(r);
        Collection<Path> paths = r.getInputFiles();
        logger.info("Calling FileLocker before file's archiving");
        paths.forEach(path -> fileLocker.unlock(path.toFile()));
        logger.info(
                "Calling IntegrationArchiveService before batch processing for message id[{}], timestamp[{}], path[{}]",
                id, timestamp, paths);
        delegate.archive(id, timestamp, "IN_", paths, ArchiveOption.REPLACE_EXISTING, ArchiveOption.CREATE_DIRECTORIES);
    }

    /**
     * Used to archive files AFTER its payload has been processed. Will typically archive the output file(s).
     *
     * @param message The message
     * @throws IOException If an I/O error occur
     */
    public void archiveAfter(Message<?> message) throws IOException {
        HeadersReader r = HeadersReader.of(message);
        Instant timestamp = r.getTimestamp();
        String id = buildId(r);
        Path path = r.getOutputFile();

        if (path == null) {
            logger.info(
                    "Calling IntegrationArchiveService after batch processing for message id[{}], timestamp[{}], prefixPath[null], no archiving",
                    id, timestamp);
            return;
        }

        logger.info(
                "Calling IntegrationArchiveService after batch processing for message id[{}], timestamp[{}], prefixPath[{}]",
                id, timestamp, path);

        delegate.archive(id, timestamp, "OUT_", path, ArchiveOption.REPLACE_EXISTING, ArchiveOption.CREATE_DIRECTORIES,
                ArchiveOption.MOVE);
    }

}
