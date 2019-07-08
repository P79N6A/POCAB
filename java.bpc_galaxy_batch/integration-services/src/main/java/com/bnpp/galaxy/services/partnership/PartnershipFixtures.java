package com.bnpp.galaxy.services.partnership;

import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.entities.PartnershipType;
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
import java.util.Collection;

/**
 * Mock service that will automatically insert db fixtures if profile "dev" is active.
 */
@Component
@Profile({"dev", "devPrime"})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class PartnershipFixtures implements ApplicationRunner {

    private final Logger logger = LogManager.getLogger(getClass());
    private final PartnershipService partnershipService;

    public PartnershipFixtures(PartnershipService partnershipService) {
        this.partnershipService = partnershipService;
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) {
        Collection<Partnership> toAdd = new ArrayList<>();

        if (!partnershipService.partnershipExistsByName("BNPPAM")) {
            Partnership bnppam = new Partnership();

            bnppam.setName("BNPPAM");
            bnppam.setJobName("bnppamJob");
            bnppam.setInputFilenamePattern(".+\\.(xls|xlsx)$");
            bnppam.setInputFileType(PartnershipType.EXCEL);
            bnppam.setConfigFile("/configurationTemplate_1_RT.json");
            bnppam.setJoltConfigFile("/jolt/cours.jolt.json");
            bnppam.setCronVacationRule("*/20 * * * * ?");

            toAdd.add(bnppam);
        }

        if (!partnershipService.partnershipExistsByName("COURS")) {
            Partnership refcours = new Partnership();

            refcours.setName("COURS");
            refcours.setJobName("coursJob");
            refcours.setInputFilenamePattern("^QuotationEventModified_BATCH.+\\.xml$");
            refcours.setInputFileType(PartnershipType.XML);
            refcours.setConfigFile("/configurationTemplate_1_RT.json");
            refcours.setJoltConfigFile("/jolt/cours.jolt.json");
            refcours.setCronVacationRule("5/20 * * * * ?");

            toAdd.add(refcours);
        }

        if (!partnershipService.partnershipExistsByName("ISSUEMAN")) {
            Partnership refcours = new Partnership();

            refcours.setName("ISSUEMAN");
            refcours.setJobName("issueManJob");
            refcours.setInputFilenamePattern("^ISSUER?_MAN_RATINGS_\\d+\\.csv$");
            refcours.setInputFileType(PartnershipType.CSV);
            refcours.setConfigFile("/configurationTemplate_1_RT.json");
            refcours.setJoltConfigFile("/jolt/issueman.jolt.json");
            refcours.setCronVacationRule("10/20 * * * * ?");

            toAdd.add(refcours);
        }

        if (!partnershipService.partnershipExistsByName("MANUEL")) {
            Partnership refcours = new Partnership();

            refcours.setName("MANUEL");
            refcours.setJobName("manuelJob");
            refcours.setInputFilenamePattern("^TxC_V_\\d+\\.csv$");
            refcours.setInputFileType(PartnershipType.CSV);
            refcours.setConfigFile("/configurationTemplate_1_RT.json");
            refcours.setJoltConfigFile("/jolt/manuel.jolt.json");
            refcours.setCronVacationRule("1/20 * * * * ?");

            toAdd.add(refcours);
        }

        if (!partnershipService.partnershipExistsByName("TXC")) {
            Partnership refcours = new Partnership();

            refcours.setName("TXC");
            refcours.setJobName("txcJob");
            refcours.setInputFilenamePattern("^REFCOURS_FixingEventValidated_BATCH_.+\\.xml$");
            refcours.setInputFileType(PartnershipType.XML);
            refcours.setConfigFile("/configurationTemplate_1_RT.json");
            refcours.setJoltConfigFile("/jolt/txc.jolt.json");
            refcours.setCronVacationRule("0/20 * * * * ?");

            toAdd.add(refcours);
        }

        logger.info("Inserting {} fixtures: {}", toAdd.size(), toAdd);

        if (!toAdd.isEmpty()) {
            partnershipService.save(toAdd);
        }
    }

}
