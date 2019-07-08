package com.bnpp.galaxy.gxt.app.transcoding;

import com.bnpp.galaxy.entities.TranscodingRule;
import com.bnpp.galaxy.repositories.TranscodingRuleRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Mock service that will automatically insert db fixtures if profile "dev" is active.
 */
@Component
@Profile({"dev", "devPrime"})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class TranscodingFixtures implements ApplicationRunner {

    private final Logger logger = LogManager.getLogger(getClass());
    private final TranscodingRuleRepository transcodingRuleRepository;

    public TranscodingFixtures(TranscodingRuleRepository transcodingRuleRepository) {
        this.transcodingRuleRepository = transcodingRuleRepository;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        List<TranscodingRule> toAdd = new ArrayList<>();

        if (transcodingRuleRepository.findBySource("isin") == null) {
            toAdd.add(new TranscodingRule("isin", "reference"));
        }

        logger.info("Inserting {} fixtures: {}", toAdd.size(), toAdd);

        if (!toAdd.isEmpty()) {
            transcodingRuleRepository.saveAll(toAdd);
        }
    }

}
