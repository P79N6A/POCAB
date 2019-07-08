package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.batch.container.ProcessedFileInfo;
import org.apache.log4j.Logger;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ProcessedFileInfoHandler {
    private static final String MSG = "%s received.";
    private static final Logger LOGGER = Logger.getLogger(ProcessedFileInfoHandler.class);

    @Autowired
    JobLauncher jobLauncher;

    @ServiceActivator
    public void handle(ProcessedFileInfo processedFileInfo) {
        LOGGER.info(String.format(MSG, processedFileInfo.getFileName()));

        Path source = Paths.get(processedFileInfo.getAbsoluteFilePath());
        Path target = Paths.get(processedFileInfo.getNewFilePath());

        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }

}
