package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.batch.container.ProcessedFileInfo;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;

import java.io.File;

public class FileMessageToProcessedFileInfoTransformer {

	@ServiceActivator
	public ProcessedFileInfo transform(Message<?> message) {
		MessageHeaders headers = message.getHeaders();

		ProcessedFileInfo processedFileInfo = new ProcessedFileInfo();
		processedFileInfo.setFileName((String) headers.get("file_name"));
		File file = (File) headers.get("file_originalFile");
		processedFileInfo.setAbsoluteFilePath(file.getPath());
		StringBuilder builderNewFilePath = new StringBuilder("C:\\Batch\\moved\\")
				.append(processedFileInfo.getFileName());
		int i = builderNewFilePath.lastIndexOf(".");
		String prefix = builderNewFilePath.substring(0, i);
		String suffix = builderNewFilePath.substring(i);

		String newFilePath = new StringBuilder(prefix).append(suffix).toString();

		processedFileInfo.setNewFilePath(newFilePath);
		return processedFileInfo;

	}

}
