package com.bnpp.galaxy.gxt.app.transcoding;

import com.bnpp.galaxy.entities.TranscodingRule;
import com.bnpp.galaxy.repositories.TranscodingRuleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GxtTranscodingRuleService implements TranscodingRuleService {

    private Map<String, TranscodingRule> cache;

    private final TranscodingRuleRepository transcodingRuleRepository;

    public GxtTranscodingRuleService(TranscodingRuleRepository transcodingRuleRepository) {
        this.transcodingRuleRepository = transcodingRuleRepository;
    }

    public List<TranscodingRule> getAllTranscodingRules() {
        if (cache == null) {
            updateCache(transcodingRuleRepository.findAll());
        }
        return new ArrayList<>(cache.values());
    }

    public TranscodingRule getTranscodingRule(String source) throws TranscodingRuleNotFoundException {
        if (cache == null) {
            updateCache(transcodingRuleRepository.findAll());
        }

        if (!cache.containsKey(source)) {
            throw new TranscodingRuleNotFoundException("Transcoding rule not found: " + source);
        }

        return cache.get(source);
    }

    void updateCache(List<TranscodingRule> transcodingRules) {
        cache = new HashMap<>(transcodingRules.size());
        transcodingRules.forEach(rule -> cache.put(rule.getSource(), rule));
    }

}
