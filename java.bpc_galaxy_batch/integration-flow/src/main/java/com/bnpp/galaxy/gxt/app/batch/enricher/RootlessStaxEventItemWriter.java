package com.bnpp.galaxy.gxt.app.batch.enricher;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.springframework.batch.item.xml.StaxEventItemWriter;

/**
 * This version of @{@link StaxEventItemWriter} write an XML ignoring the root tag
 */
public class RootlessStaxEventItemWriter<T> extends StaxEventItemWriter<T> {

    @Override
    protected void startDocument(XMLEventWriter writer) throws XMLStreamException {
        XMLEventFactory factory = createXmlEventFactory();
        // write start document
        writer.add(factory.createStartDocument(getEncoding(), getVersion()));
    }

    @Override
    protected void endDocument(XMLEventWriter writer) {
    }

}
