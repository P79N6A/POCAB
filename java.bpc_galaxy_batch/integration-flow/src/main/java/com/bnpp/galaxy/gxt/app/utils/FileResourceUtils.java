package com.bnpp.galaxy.gxt.app.utils;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

/**
 * This utility class is used as a bridge between the transformation of a {@link org.springframework.messaging.Message}
 * into a {@link org.springframework.batch.integration.launch.JobLaunchRequest} and the launching of the {@link org.springframework.batch.core.Job}.
 * It maps a {@link Collection collection of filepath} into a String so we can use it in {@link org.springframework.batch.core.JobParameters}.
 * It also maps this String into an array of {@link UrlResource} so it can be consumed by a {@link org.springframework.batch.item.file.MultiResourceItemReader}
 */
public final class FileResourceUtils {

    private static final String SEPARATOR = File.pathSeparator;

    /**
     * Map a Collection into a String with separated values
     * @param collection Collection of {@link String}
     * @return a String separated version of the Collection
     */
    public static String collectionToString(Collection<String> collection) {
        return String.join(SEPARATOR, collection);
    }

    /**
     * Retrieve the file paths contained in this CSV String and map it to {@link Resource} array
     * @param filepath the CSV String
     * @return an array of {@link UrlResource} representing the files
     * @see FileResourceUtils#collectionToString(Collection)
     */
    public static Resource[] getResourcesFromFilepath(String filepath) {
        return Arrays.stream(filepath.split(SEPARATOR))
                .map(FileResourceUtils::getResourceFromFilepath)
                .toArray(Resource[]::new);
    }

    /**
     * Convert a single filepath into a {@link UrlResource}
     * @param filepath the filepath
     * @return the {@link UrlResource} associated to this file
     */
    private static Resource getResourceFromFilepath(String filepath) {
        try {
            URL url = ResourceUtils.getURL(filepath);
            return new UrlResource(url);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
