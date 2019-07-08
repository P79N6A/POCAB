package com.bnpp.galaxy.gxt.app.batch.enricher;

import javax.xml.stream.XMLEventWriter;

/**
 * Exception thrown by @{@link XmlWriterCallback#write(XMLEventWriter)}
 */
public class XmlReaderException extends RuntimeException {

    public XmlReaderException(Throwable cause) {
        super(cause);
    }

}
