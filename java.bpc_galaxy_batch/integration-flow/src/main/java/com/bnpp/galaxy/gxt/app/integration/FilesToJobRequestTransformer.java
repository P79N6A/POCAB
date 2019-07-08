package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.configuration.JobFinder;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.integration.launch.JobLaunchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FilesToJobRequestTransformer {

    @Autowired
    private JobFinder jobFinder;

    @ServiceActivator
    public JobLaunchRequest transform(Message<?> message) {
        HeadersReader headers = HeadersReader.of(message);
        PartnershipSettings partnershipSettings = headers.getPartnership();
        Job job = jobFinder.findJob(partnershipSettings);
        JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
        String filenames = headers.getInputFiles()
                .stream()
                .map(Path::toString)
                .collect(Collectors.joining(File.pathSeparator));

        jobParametersBuilder.addString("partnershipName", partnershipSettings.getName());
        jobParametersBuilder.addString("integrationId", headers.getInputId(), true);
        jobParametersBuilder.addString("files", filenames);
        // TODO: output filename
        jobParametersBuilder.addString("outputFile", "C:\\Batch\\output\\" + Paths.get(filenames.split(File.pathSeparator)[0]).getFileName().toString().split("\\.")[0] + ".xml");

        partnershipSettings.configureJobParameters(jobParametersBuilder);

        return new JobLaunchRequest(job, jobParametersBuilder.toJobParameters());
    }

}
