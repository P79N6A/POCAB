package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.utils.XlsToCsv;
import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.messaging.Message;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;

public class XlsToCsvTransformer extends AbstractTransformer {

    private final IntegrationArchiveService archiver;

    public XlsToCsvTransformer(IntegrationArchiveService archiver) {
        this.archiver = archiver;
    }

    // TODO
    @Override
    protected Message<Collection<Path>> doTransform(Message<?> message) {
        try {
            Collection<Path> before = (Collection<Path>) message.getPayload();
            Collection<Path> after = new ArrayList<>();

//            before.forEach(path -> after.add(transformFile(path)));

            Message<Collection<Path>> newMessage = getMessageBuilderFactory()
                    .withPayload(after)
                    .copyHeaders(message.getHeaders())
//                    .setHeader("file_name", result.getFileName().toString())
//                    .setHeader("file_relativePath", result.toFile().toString())
//                    .setHeader("file_originalFile", result.toFile())
                    .build();

            archiver.archiveBefore(newMessage);

            return newMessage;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Path transformFile(Path path) throws IOException {
        // TODO: get the CSV config
        XlsToCsv.CsvConfig config = new XlsToCsv.CsvConfig(',', 4, 1);
        Path outputDir = Paths.get("Batch", "target", "generated", "csv");
        return XlsToCsv.generateCsv(path, outputDir, config);
    }

}
