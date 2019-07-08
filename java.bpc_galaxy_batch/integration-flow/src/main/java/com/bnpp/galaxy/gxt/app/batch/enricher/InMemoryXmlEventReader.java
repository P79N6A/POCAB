package com.bnpp.galaxy.gxt.app.batch.enricher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * This class opens an XML file and store its @{@link XMLEvent} content in memory for further use.
 * The predicates purpose is to keep the index of the wanted @{@link XMLEvent} in memory so one can access the wanted part of the XML directly.
 * Used in combination with @{@link XmlWriterCallback}
 */
public class InMemoryXmlEventReader {

    private final static Logger LOG = LogManager.getLogger(InMemoryXmlEventReader.class);

    private final String              resourceName;
    private final Predicate<XMLEvent> headerStartCondition;
    private final Predicate<XMLEvent> headerEndCondition;
    private final Predicate<XMLEvent> footerStartCondition;
    private final Predicate<XMLEvent> footerEndCondition;

    private List<XMLEvent> events;

    private int headerStartIndex, headerEndIndex, footerStartIndex, footerEndIndex;

    InMemoryXmlEventReader(String resourceName, Predicate<XMLEvent> headerStartCondition, Predicate<XMLEvent> headerEndCondition,
                                  Predicate<XMLEvent> footerStartCondition, Predicate<XMLEvent> footerEndCondition) {
        this.resourceName = resourceName;
        this.headerStartCondition = headerStartCondition;
        this.headerEndCondition = headerEndCondition;
        this.footerStartCondition = footerStartCondition;
        this.footerEndCondition = footerEndCondition;
    }

    /**
     *
     * @return the list of @{@link XMLEvent} in the same order at it appears in the XML file
     */
    public List<XMLEvent> getEvents() {
        if (events == null) {
            readEvents();
            for (int i = 0; i < events.size(); i++) {
                if (headerStartCondition.test(events.get(i))) {
                    headerStartIndex = i;
                } else if (headerEndCondition.test(events.get(i))) {
                    headerEndIndex = i + 1;
                } else if (footerStartCondition.test(events.get(i))) {
                    footerStartIndex = i;
                } else if (footerEndCondition.test(events.get(i))) {
                    footerEndIndex = i + 1;
                }
            }
        }
        return events;
    }

    private static XMLEventReader openXmlEventReader(String resource) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = null;
        try {
            eventReader = factory.createXMLEventReader(InMemoryXmlEventReader.class.getClassLoader().getResourceAsStream(resource));
        } catch (XMLStreamException e) {
            LOG.error(e);
        }
        return eventReader;
    }

    private void closeXmlEventReader(XMLEventReader eventReader) {
        if (eventReader != null) {
            try {
                eventReader.close();
            } catch (XMLStreamException e) {
                LOG.error(e);
            }
        }
    }

    private void readEvents() {
        XMLEventReader eventReader = openXmlEventReader(resourceName);
        Iterable<XMLEvent> iterable = () -> eventReader;
        events = StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.toList());
        closeXmlEventReader(eventReader);
    }

    public int getHeaderStartIndex() {
        return headerStartIndex;
    }

    public int getHeaderEndIndex() {
        return headerEndIndex;
    }

    public int getFooterStartIndex() {
        return footerStartIndex;
    }

    public int getFooterEndIndex() {
        return footerEndIndex;
    }

    public static class Builder {

        private String              resourceName;
        private Predicate<XMLEvent> headerStartCondition;
        private Predicate<XMLEvent> headerEndCondition;
        private Predicate<XMLEvent> footerStartCondition;
        private Predicate<XMLEvent> footerEndCondition;


        public Builder(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
        }

        public Builder withHeaderStartCondition(Predicate<XMLEvent> headerStartCondition) {
            this.headerStartCondition = headerStartCondition;
            return this;
        }

        public Builder withHeaderEndCondition(Predicate<XMLEvent> headerEndCondition) {
            this.headerEndCondition = headerEndCondition;
            return this;
        }

        public Builder withFooterStartCondition(Predicate<XMLEvent> footerStartCondition) {
            this.footerStartCondition = footerStartCondition;
            return this;
        }

        public Builder withFooterEndCondition(Predicate<XMLEvent> footerEndCondition) {
            this.footerEndCondition = footerEndCondition;
            return this;
        }

        public InMemoryXmlEventReader build() {
            return new InMemoryXmlEventReader(resourceName, headerStartCondition, headerEndCondition, footerStartCondition, footerEndCondition);
        }

    }

}
