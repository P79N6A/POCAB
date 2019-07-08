package com.bnpp.galaxy.gxt.app.sources;

import lombok.Data;

@Data
public class JobProperties {
	
	private String[] inAattributes;

	private String[] outAttributes;

	private String[] delimiter;

	private String[] dateFormat;

	private String inPath;

	private String outPath;
	
	private int lineToskip;

	private String[] readerPackageToScan;

	private String[] writerPackageToScan;

	private String[] inRootTagName;

	private String[] outRootTagName;

	private boolean[] outOverwrite;

	private String jobName;

	private String[] stepName;

	private String[] readerName;

	private String[] writerName;

	private String type;
}
