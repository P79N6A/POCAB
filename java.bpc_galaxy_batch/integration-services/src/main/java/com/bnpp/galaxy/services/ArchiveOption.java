package com.bnpp.galaxy.services;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/**
 * Options designed to be used with {@link ArchiveService}
 *
 * @see ArchiveService
 */
public enum ArchiveOption {
    /**
     * Indicates whether to automatically create directories tree when archiving files
     */
    CREATE_DIRECTORIES,
    /**
     * Indicates whether to replace existing target file if it already exists
     */
    REPLACE_EXISTING,
    /**
     * Indicates whether to move source file instead of copying it (move operation may be faster)
     */
    MOVE;

    /**
     * Return the given (possibly empty or <code>null</code>) array as a {@link Set}.
     *
     * @param archiveOptions The enum array (possibly empty or <code>null</code>)
     * @return The enum set (possibly empty)
     * @implNote An instance of {@link EnumSet} is returned
     */
    @NonNull
    public static Set<ArchiveOption> asSet(@Nullable ArchiveOption[] archiveOptions) {
        if (archiveOptions == null || archiveOptions.length == 0) {
            return EnumSet.noneOf(ArchiveOption.class);
        } else {
            return EnumSet.copyOf(Arrays.asList(archiveOptions));
        }
    }
}
