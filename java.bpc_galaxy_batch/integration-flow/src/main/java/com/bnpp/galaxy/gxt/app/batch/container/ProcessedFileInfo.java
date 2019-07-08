package com.bnpp.galaxy.gxt.app.batch.container;

public class ProcessedFileInfo {

	private String fileName;
	private String absoluteFilePath;
	private String newFilePath;

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the absoluteFilePath
	 */
	public String getAbsoluteFilePath() {
		return absoluteFilePath;
	}

	/**
	 * @param absoluteFilePath
	 *            the absoluteFilePath to set
	 */
	public void setAbsoluteFilePath(String absoluteFilePath) {
		this.absoluteFilePath = absoluteFilePath;
	}

	/**
	 * @return the newFilePath
	 */
	public String getNewFilePath() {
		return newFilePath;
	}

	/**
	 * @param newFilePath
	 *            the newFilePath to set
	 */
	public void setNewFilePath(String newFilePath) {
		this.newFilePath = newFilePath;
	}

}
