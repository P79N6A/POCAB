package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.gxt.app.utils.SupportedContentType;
import org.springframework.integration.router.HeaderValueRouter;

import java.util.Map;

public class ContentTypeRouter extends HeaderValueRouter {
    public ContentTypeRouter() {
        super(Constants.CONTENT_TYPE_HEADER);
    }

    public ContentTypeRouter(Map<SupportedContentType, String> mappings) {
        super(Constants.CONTENT_TYPE_HEADER);

        mappings.forEach(this::setChannelMapping);
    }

    public void setChannelMapping(SupportedContentType key, String channelName) {
        super.setChannelMapping(key.getContentType(), channelName);
    }

    public ContentTypeRouter channelMapping(SupportedContentType key, String channelName) {
        setChannelMapping(key, channelName);
        return this;
    }

}
