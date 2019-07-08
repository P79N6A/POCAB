package com.bnpp.galaxy.gxt.app.transcoding;

import com.bnpp.galaxy.entities.TranscodingRule;

import java.util.List;

/**
 * Base interface for finding any TranscodingRule
 */
public interface TranscodingRuleService {

    /**
     * @return the complete list of TranscodingRule
     */
    List<TranscodingRule> getAllTranscodingRules();

    /**
     * @param source the partner field name
     * @return the TranscodingRule corresponding to this source
     */
    TranscodingRule getTranscodingRule(String source) throws TranscodingRuleNotFoundException;

}
