package com.bnpp.galaxy.gxt.app.transcoding;

import com.bnpp.galaxy.entities.TranscodingRule;
import com.bnpp.galaxy.repositories.TranscodingRuleRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Initialize the @{@link TranscodingRule} at application start.
 */
@Component
public class TranscodingRulesIntializer implements ApplicationRunner {

    private final Logger log = LogManager.getLogger(getClass());

    private final FusionInvestTranscodingRuleService fusionInvestTranscodingRuleService;
    private final GxtTranscodingRuleService gxtTranscodingRuleService;
    private final TranscodingRuleRepository transcodingRuleRepository;

    public TranscodingRulesIntializer(FusionInvestTranscodingRuleService fusionInvestTranscodingRuleService,
                                      GxtTranscodingRuleService gxtTranscodingRuleService, TranscodingRuleRepository transcodingRuleRepository) {
        this.fusionInvestTranscodingRuleService = fusionInvestTranscodingRuleService;
        this.gxtTranscodingRuleService = gxtTranscodingRuleService;
        this.transcodingRuleRepository = transcodingRuleRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws TranscodingRuleNotFoundException {
        List<TranscodingRule> rules;
        gxtTranscodingRuleService.getAllTranscodingRules();
        try {
            rules = fusionInvestTranscodingRuleService.getAllTranscodingRules();
        } catch (Exception e) { // TODO : ignore fusion invest error if data is already stored in our database?
            log.error("Error trying to reach FusionInvest API : {}", e.getMessage());
            rules = transcodingRuleRepository.findAll();
            if (rules.isEmpty()) {
                throw new TranscodingRuleNotFoundException("No transcoding rules found in database");
            }
            log.warn("Getting transcoding rules from GXT database");
        }
        gxtTranscodingRuleService.updateCache(rules);
    }

}
