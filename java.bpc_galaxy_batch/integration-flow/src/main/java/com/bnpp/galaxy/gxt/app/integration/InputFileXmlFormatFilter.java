package com.bnpp.galaxy.gxt.app.integration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.integration.core.GenericSelector;
import org.springframework.messaging.Message;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

public class InputFileXmlFormatFilter implements GenericSelector<Message<Collection<Path>>> {

    private final Logger logger = LogManager.getLogger(getClass());

    @Autowired
    private Environment env;

    @Override
    public boolean accept(Message<Collection<Path>> message) {


        try {
            for (Path path : message.getPayload()) {
                String ressourcePath = env.getProperty("xsd." + path.getFileName());
                if (ressourcePath == null) {
                    logger.info("Fichier de validation xsd introuvable: {}", ressourcePath);
                    //TODO
				return true;
                }

                File schemaFile = Paths.get(Thread.currentThread().getClass().getResource("/" + ressourcePath).toURI())
                                       .toFile();

                Source xmlFile = new StreamSource(path.toFile());
                SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

                Schema schema = schemaFactory.newSchema(schemaFile);
                Validator validator = schema.newValidator();

                // validator.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, Boolean.FALSE);
                // validator.setProperty(XMLInputFactory.SUPPORT_DTD, Boolean.FALSE);
                // validator.setProperty(XMLConstants.FEATURE_SECURE_PROCESSING, Boolean.TRUE);

                validator.setProperty(XMLConstants.ACCESS_EXTERNAL_DTD, "");
                validator.setProperty(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");

                // new StreamSource(new StringReader( new String(Files.readAllBytes(message.getPrefixPath().toPath()))));

                validator.validate(xmlFile);
            }

            return true;

        } catch (SAXException | IOException | URISyntaxException e) {
            logger.error(e);
            return false;
        }
    }
}
