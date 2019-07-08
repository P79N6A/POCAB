package com.bnpp.galaxy.gxt.app.batch.enricher;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.batch.item.xml.StaxWriterCallback;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.util.List;
import java.util.function.Function;

/**
 * Callback used for writing either header or footer contents in an XML file. Depends on @{@link InMemoryXmlEventReader} for
 * browsing the desired XML in memory.
 * To be used with @{@link org.springframework.batch.item.xml.StaxEventItemWriter#setHeaderCallback(StaxWriterCallback)}
 * and @{@link org.springframework.batch.item.xml.StaxEventItemWriter#setFooterCallback(StaxWriterCallback)}
 */
public class XmlWriterCallback implements StaxWriterCallback {

    private static final Logger LOG = LogManager.getLogger(XmlWriterCallback.class);

    private final InMemoryXmlEventReader reader;
    private final Function<InMemoryXmlEventReader, Integer> startIndexReader;
    private final Function<InMemoryXmlEventReader, Integer> endIndexReader;

    public XmlWriterCallback(InMemoryXmlEventReader reader, Function<InMemoryXmlEventReader, Integer> startIndexReader, Function<InMemoryXmlEventReader, Integer> endIndexReader) {
        this.reader = reader;
        this.startIndexReader = startIndexReader;
        this.endIndexReader = endIndexReader;
    }

    @Override
    public void write(XMLEventWriter writer) {
        List<XMLEvent> events = reader.getEvents();
        int startIndex = startIndexReader.apply(reader);
        int endIndex = endIndexReader.apply(reader);
        for (int i = startIndex; i < endIndex; i++) {
            write(writer, events.get(i));
        }
    }

    private void write(XMLEventWriter writer, XMLEvent event) {
        try {
            writer.add(event);
        } catch (XMLStreamException e) {
            LOG.error(e);
            throw new XmlReaderException(e);
        }
    }

}
