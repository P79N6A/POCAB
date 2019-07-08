package com.bnpp.galaxy.services;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Collections;
import java.util.Set;
import java.util.function.Function;

/**
 * Service responsible of archiving arbitrary files. Actual filesystem operations are delegated to internal {@link
 * ArchiveOperationImpl implementations} (typically {@link Files#copy(Path, Path, CopyOption...) Files.copy()} or {@link
 * Files#move(Path, Path, CopyOption...) Files.move()}.
 */
@Service
public class ArchiveService {

    /**
     * Delegate filesystem operation implementation. Typically used as lambda or method reference, such as {@link
     * Files#copy(Path, Path, CopyOption...) Files::copy} or {@link Files#move(Path, Path, CopyOption...) Files::move},
     * that's why this {@link FunctionalInterface} respects those method contracts.
     */
    @FunctionalInterface
    public interface ArchiveOperationImpl {
        /**
         * Execute the filesystem operation
         *
         * @param source  Source prefixPath
         * @param target  Target prefixPath
         * @param options Optional options
         * @throws IOException If an error occur
         */
        void call(Path source, Path target, CopyOption... options) throws IOException;
    }

    private final Logger logger = LogManager.getLogger(getClass());

    private final IntegrationProperties integrationProperties;

    public ArchiveService(IntegrationProperties integrationProperties) {
        this.integrationProperties = integrationProperties;
    }

    private IntegrationProperties.Archive config() {
        return integrationProperties.getArchive();
    }

    /**
     * Get a zone ID that may be used to format dates (for directory/file names, etc.).
     *
     * @return A Zone ID, defaulting to the {@link ZoneId#systemDefault system default} if not set.
     */
    private ZoneId getZoneId() {
        String timestampTreeZone = config().getTimestampTreeZone();

        if (timestampTreeZone != null) {
            return ZoneId.of(timestampTreeZone);
        } else {
            return ZoneId.systemDefault();
        }
    }

    /**
     * Return the directory that should be used for the given archive (identified by ID and timestamp)
     *
     * @param archiveId        The archive ID
     * @param archiveTimestamp The archive timestamp
     * @return The archive directory, in which files should be written
     */
    private Path buildArchiveDirectory(String archiveId, Instant archiveTimestamp) {
        if (config().isTimestampTree()) {
            LocalDateTime now = LocalDateTime.ofInstant(archiveTimestamp, getZoneId());
            String year = String.valueOf(now.get(ChronoField.YEAR));
            String month = String.format("%02d", now.get(ChronoField.MONTH_OF_YEAR));
            String day = String.format("%02d", now.get(ChronoField.DAY_OF_MONTH));

            return config().getDirectory().resolve(year).resolve(month).resolve(day).resolve(archiveId);
        } else {
            return config().getDirectory().resolve(archiveId);
        }
    }

    /**
     * Archive a single file
     *
     * @param archiveId        An identifier for the archive (that consequently MUST be stable over time).
     * @param archiveTimestamp The timestamp of the archive (may or may not be the actual file timestamp)
     * @param pathToArchive    The file prefixPath
     * @param archiveOptions   Optional options
     * @throws IOException If an error occur
     */
    public void archive(String archiveId, Instant archiveTimestamp, Path pathToArchive, ArchiveOption... archiveOptions) throws IOException {
        archive(archiveId, archiveTimestamp, Collections.singleton(pathToArchive), archiveOptions);
    }

    /**
     * Archive a single file
     *
     * @param archiveId        An identifier for the archive (that consequently MUST be stable over time).
     * @param archiveTimestamp The timestamp of the archive (may or may not be the actual file timestamp)
     * @param prefix           A prefix to add to the target file (may be null or empty)
     * @param pathToArchive    The file prefixPath
     * @param archiveOptions   Optional options
     * @throws IOException If an error occur
     */
    public void archive(String archiveId, Instant archiveTimestamp, String prefix, Path pathToArchive, ArchiveOption... archiveOptions) throws IOException {
        archive(archiveId, archiveTimestamp, prefix, Collections.singleton(pathToArchive), archiveOptions);
    }

    /**
     * Archive files
     *
     * @param archiveId        An identifier for the archive (that consequently MUST be stable over time).
     * @param archiveTimestamp The The timestamp of the archive (may or may not be the actual files timestamp)
     * @param pathsToArchive   The files paths
     * @param archiveOptions   Optional options
     * @throws IOException If an error occur
     */
    public void archive(String archiveId, Instant archiveTimestamp, Iterable<Path> pathsToArchive, ArchiveOption... archiveOptions) throws IOException {
        archive(archiveId, archiveTimestamp, null, pathsToArchive, archiveOptions);
    }

    /**
     * Archive files
     *
     * @param archiveId        An identifier for the archive (that consequently MUST be stable over time).
     * @param archiveTimestamp The The timestamp of the archive (may or may not be the actual files timestamp)
     * @param prefix           A prefix to prepend to target filenames (may be null or empty)
     * @param pathsToArchive   The files paths
     * @param archiveOptions   Optional options
     * @throws IOException If an error occur
     */
    public void archive(String archiveId, Instant archiveTimestamp, String prefix, Iterable<Path> pathsToArchive, ArchiveOption... archiveOptions) throws IOException {
        Path directory = buildArchiveDirectory(archiveId, archiveTimestamp);
        Set<ArchiveOption> options = ArchiveOption.asSet(archiveOptions);
        ArchiveOperationImpl impl = options.contains(ArchiveOption.MOVE)
                ? Files::move
                : Files::copy;
        CopyOption[] copyOptions = options.contains(ArchiveOption.REPLACE_EXISTING)
                ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING}
                : new CopyOption[0];
        Function<String, String> newNameFn = StringUtils.isEmpty(prefix)
                ? String::toString
                : prefix::concat;

        logger.trace("Creating archive directories tree [{}]", directory);

        if (options.contains(ArchiveOption.CREATE_DIRECTORIES)) {
            Files.createDirectories(directory);
        }

        logger.info("Calling ArchiveService with id[{}], timestamp[{}], prefixPath[{}], options[{}], target[{}]", archiveId, archiveTimestamp, pathsToArchive, copyOptions, directory);

        for (Path source : pathsToArchive) {
            String newFilename = newNameFn.apply(source.getFileName().toString());
            Path target = directory.resolve(newFilename);

            impl.call(source, target, copyOptions);
        }
    }
}
