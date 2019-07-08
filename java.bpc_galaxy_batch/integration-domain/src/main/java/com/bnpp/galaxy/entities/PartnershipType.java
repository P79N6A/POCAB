package com.bnpp.galaxy.entities;

import com.bnpp.galaxy.utils.SupportedContentType;

public enum PartnershipType {
    EXCEL(SupportedContentType.MS_EXCEL, SupportedContentType.MS_EXCEL_OOXML),
    CSV(SupportedContentType.CSV),
    XML(SupportedContentType.XML);

    private final SupportedContentType[] supportedContentTypes;

    PartnershipType(SupportedContentType... supportedContentTypes) {
        this.supportedContentTypes = supportedContentTypes;
    }

    public SupportedContentType[] getSupportedContentTypes() {
        return supportedContentTypes;
    }
}
