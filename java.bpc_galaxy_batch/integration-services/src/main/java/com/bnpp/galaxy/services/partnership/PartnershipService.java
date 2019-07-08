package com.bnpp.galaxy.services.partnership;

import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.entities.PartnershipLockedException;
import com.bnpp.galaxy.event.CancellableEvent;
import com.bnpp.galaxy.repositories.PartnershipRepository;
import com.bnpp.galaxy.services.ApplicationIdentity;
import com.bnpp.galaxy.services.partnership.impl.CsvPartnerSettings;
import com.bnpp.galaxy.services.partnership.impl.XlsPartnerSettings;
import com.bnpp.galaxy.services.partnership.impl.XmlPartnerSettings;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toMap;

/**
 * Main entry point for managing Partnerships
 */
@Service
public class PartnershipService {

    private final ObjectMapper objectMapper;
    private final PartnershipRepository partnershipRepository;
    private final ApplicationEventPublisher eventPublisher;
    private final PartnershipEvents.Factory eventFactory = PartnershipEvents.forSource(this);
    private final PartnershipsStore store = new PartnershipsStore();
    private final ApplicationIdentity appId;

    public PartnershipService(PartnershipRepository partnershipRepository, ObjectMapper objectMapper, ApplicationEventPublisher eventPublisher, ApplicationIdentity applicationIdentity) {
        this.partnershipRepository = partnershipRepository;
        this.objectMapper = objectMapper;
        this.eventPublisher = eventPublisher;
        this.appId = applicationIdentity;
    }

    /**
     * Indicates whether given partnership has a currently running job. Note that if it is locked, it may be by any
     * application instance (current one or another one). To discriminate between application instances, use #isL
     * instead
     *
     * @param name Partnership name
     * @return <code>true</code> if that partnership is locked, <code>false</code> otherwise
     */
    public boolean isLocked(String name) {
        return partnershipRepository.existsByNameAndExecutionLockNotNull(name);
    }

    /**
     * Indicates whether given partnership is lockable (eg. no running instance).
     *
     * @param name Partnership name
     * @return <code>true</code> if that partnership is lockable, <code>false</code> otherwise
     */
    public boolean isLockable(String name) {
        return partnershipRepository.existsByNameAndExecutionLockNull(name);
    }

    /**
     * Indicates whether given partnership is unlockable. A partnership is unlockable if is has a running instance
     * locked by current application context.
     *
     * @param name Partnership name
     * @return <code>true</code> if that partnership is unlockable, <code>false</code> otherwise
     */
    public boolean isUnlockable(String name) {
        return partnershipRepository.existsByNameAndExecutionLock(name, appId.getId());
    }

    /**
     * Lock the given partnership
     *
     * @param name The partnership name
     * @throws PartnershipLockedException If the partnership is already locked by another context
     */
    @Transactional
    public void lock(String name, boolean lock) throws PartnershipLockedException {
        Partnership p = partnershipRepository.findByName(name);

        if (p != null) {
            if (p.getExecutionLock() != null && !appId.getId().equals(p.getExecutionLock())) {
                throw PartnershipLockedException.forPartnership(p);
            }

            p.setExecutionLock(lock ? appId.getId() : null);
            save(p);
        }
    }

    /**
     * Unock the all partnerships that are locked by current context
     *
     * @return the count of unlocked partnerships
     */
    @Transactional
    public int unlockAllLockedPartnerships() {
        Collection<Partnership> list = partnershipRepository.findAllByExecutionLock(appId.getId());

        if (!list.isEmpty()) {
            list.forEach(p -> p.setExecutionLock(null));
            save(list);
        }

        return list.size();
    }

    /**
     * Hold the given partnership.
     *
     * @param name Partnership name
     */
    @Transactional
    public void hold(String name, boolean hold) {
        Partnership p = partnershipRepository.findByName(name);

        if (p != null && !p.isHold()) {
            p.setHold(hold);
            save(p);
        }
    }

    /**
     * Indicates whether given partnership is hold.
     *
     * @param name Partnership name
     * @return <code>true</code> if hold, <code>false</code> otherwise
     */
    public boolean isHold(String name) {
        return partnershipRepository.existsByNameAndHold(name, true);
    }

    @Transactional(readOnly = true)
    public boolean partnershipExistsByName(String name) throws PartnershipNotFoundException {
        try {
            return findPartnershipByName(name) != null;
        } catch (PartnershipNotFoundException e) {
            return false;
        }
    }

    @Transactional(readOnly = true)
    public Partnership findPartnershipByName(String name) throws PartnershipNotFoundException {
        return store.getAllByName().get(name);
    }

    @Transactional(readOnly = true)
    public PartnershipSettings findPartnershipSettingsByName(String name) throws PartnershipNotFoundException {
        return toSettings(store.getAllByName().get(name));
    }

    private PartnershipSettings toSettings(Partnership partnership) {
        switch (partnership.getInputFileType()) {
            case EXCEL:
                return getXlsPartnerSettings(partnership);
            case XML:
                return getXmlPartnerSettings(partnership);
            case CSV:
                return getCsvPartnerSettings(partnership);
            default:
                throw new UnsupportedOperationException("TODO: " + partnership.getInputFileType());
        }
    }

    private XlsPartnerSettings getXlsPartnerSettings(Partnership partnership) {
        JsonNode xlsConfigFile = readXlsConfigFile(partnership.getConfigFile());

        return new XlsPartnerSettings.XlsPartnerSettingsBuilder()
                .partnership(partnership)
                .rowOffset(xlsConfigFile.get("rowOffset").asInt())
                .columnOffset(xlsConfigFile.get("columnOffset").asInt())
                .build();
    }

//    private List<PartnershipListener> getListeners() {
//        Map<String, PartnershipListener> beans = beanFactory.getBeansOfType(PartnershipListener.class);
//
//        if (beans.isEmpty()) {
//            return Collections.emptyList();
//        }
//
//        List<PartnershipListener> list = new ArrayList<>(beans.values());
//
//        PartnershipListener.sort(list);
//
//        return list;
//    }

    private XmlPartnerSettings getXmlPartnerSettings(Partnership partnership) {
        JsonNode xmlConfigFile = readXmlConfigFile(partnership.getConfigFile());

        return new XmlPartnerSettings.XmlPartnerSettingsBuilder()
                .partnership(partnership)
                .xsd(xmlConfigFile.get("xsd").asText())
                .build();
    }

    private CsvPartnerSettings getCsvPartnerSettings(Partnership partnership) {
        JsonNode csvConfigFile = readCsvConfigFile(partnership.getConfigFile());

        return new CsvPartnerSettings.Builder()
                .partnership(partnership)
                .rowOffset(csvConfigFile.get("rowOffset").asInt())
                .separator(csvConfigFile.get("separator").asText())
                .build();
    }

    private JsonNode readXlsConfigFile(String configFile) {
        // TODO: read json file
        final ObjectNode mock = objectMapper.createObjectNode();
        mock.put("rowOffset", 0);
        mock.put("columnOffset", 0);
        return mock;
    }

    private JsonNode readXmlConfigFile(String configFile) {
        // TODO: read json file
        final ObjectNode mock = objectMapper.createObjectNode();
        mock.put("xsd", "");
        return mock;
    }

    private JsonNode readCsvConfigFile(String configFile) {
        // TODO: read json file
        final ObjectNode mock = objectMapper.createObjectNode();
        mock.put("rowOffset", 1);
        mock.put("separator", ";");
        return mock;
    }

    @Transactional(readOnly = true)
    public PartnershipSettings findPartnershipSettingsMatching(String filename) throws PartnershipNotFoundException {
        Partnership partnership = store.streamAllByPattern()
                .filter(entry -> entry.getKey().matcher(filename).matches())
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(() -> PartnershipNotFoundException.forInputFile(filename));

        return toSettings(partnership);
    }

    public Collection<Partnership> getAllPartnerships() {
        return store.getAll();
    }

    @Transactional
    public Partnership save(Partnership partnership) {
        List<Partnership> result = save(Collections.singleton(partnership));

        if (result.isEmpty()) {
            return null;
        } else if (result.size() == 1) {
            return result.iterator().next();
        } else {
            throw new AssertionError();
        }
    }

    @Transactional
    public List<Partnership> save(Iterable<Partnership> partnerships) {
        Collection<Partnership> toSave = new ArrayList<>();

        for (Partnership partnership : partnerships) {
            CancellableEvent event = eventFactory.beforeSave(partnership);

            eventPublisher.publishEvent(event);

            if (!event.isCancelled(true)) {
                toSave.add(partnership);
            }
        }

        if (toSave.isEmpty()) {
            return Collections.emptyList();
        }

        List<Partnership> result = partnershipRepository.saveAll(toSave);
        partnershipRepository.flush();
        store.refresh();

        eventPublisher.publishEvent(eventFactory.afterSave(result));

        return result;
    }

    @Transactional
    public List<Partnership> save(Partnership... partnership) {
        return save(Arrays.asList(partnership));
    }

    public void delete(Partnership partnership) {
        delete(Collections.singletonList(partnership));
    }

    public void delete(Iterable<Partnership> partnerships) {
        List<Partnership> toDelete = new ArrayList<>();

        for (Partnership partnership : partnerships) {
            CancellableEvent event = eventFactory.beforeDelete(partnership);

            eventPublisher.publishEvent(event);

            if (!event.isCancelled(true)) {
                toDelete.add(partnership);
            }
        }

        if (!toDelete.isEmpty()) {
            partnershipRepository.deleteAll(toDelete);
            partnershipRepository.flush();
            store.refresh();

            eventPublisher.publishEvent(eventFactory.afterDelete(toDelete));
        }
    }

    public void delete(Partnership... partnerships) {
        delete(Arrays.asList(partnerships));
    }

    /**
     * Private internal store that keep a cache of all entities (as there should not be more than ~100)
     */
    private final class PartnershipsStore {
        private List<Partnership> all;
        private Map<Pattern, Partnership> partnershipByPattern;
        private Map<String, Partnership> partnershipByName;

        void refresh() {
            this.partnershipByPattern = null;
            this.partnershipByName = null;
            this.all = null;
        }

        Stream<Map.Entry<Pattern, Partnership>> streamAllByPattern() {
            return getAllByPattern().entrySet().stream();
        }

        Map<Pattern, Partnership> getAllByPattern() {
            load();

            return partnershipByPattern;
        }

        /**
         * Load all partnership and cache them in a map indexed by compiled patterns
         */
        private void load() {
            if (partnershipByPattern != null) {
                return;
            }

            all = Collections.unmodifiableList(partnershipRepository.findAll());
            partnershipByPattern = all.stream().collect(collectingAndThen(
                    toMap(this::compilePattern, Function.identity()),
                    Collections::unmodifiableMap
            ));
            partnershipByName = all.stream().collect(collectingAndThen(
                    toMap(Partnership::getName, Function.identity()),
                    Collections::unmodifiableMap
            ));
        }

        private Pattern compilePattern(Partnership partnership) {
            return Pattern.compile(partnership.getInputFilenamePattern());
        }

        Map<String, Partnership> getAllByName() {
            load();

            return partnershipByName;
        }

        Collection<Partnership> getAll() {
            load();

            return all;
        }

    }

}
