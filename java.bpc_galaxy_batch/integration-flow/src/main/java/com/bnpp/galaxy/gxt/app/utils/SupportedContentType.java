package com.bnpp.galaxy.gxt.app.utils;

public enum SupportedContentType {

    XML("xml", "application/xml"),
    CSV("csv", "text/csv"),
    MS_EXCEL("xls", "application/vnd.ms-excel"),
    MS_EXCEL_OOXML("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    private final String extension;
    private final String contentType;

    SupportedContentType(String extension, String contentType) {
        this.extension = extension;
        this.contentType = contentType;
    }

    public String getExtension() {
        return extension;
    }

    public String getContentType() {
        return contentType;
    }

    public static SupportedContentType ofExtension(String extension) {
        for (SupportedContentType value : values()) {
            if (value.getExtension().equalsIgnoreCase(extension)) {
                return value;
            }
        }

        throw new IllegalArgumentException();
    }
}
