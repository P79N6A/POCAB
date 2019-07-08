package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.integration.exception.UnsupportedPayloadException;
import org.junit.Test;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class InboundPayloadTransformerTest {

    @Test
    public void testSingleFile() {
        Message<?> message = MessageBuilder.withPayload(new File("./test")).build();
        Collection<Path> result = new InboundPayloadTransformer().doTransform(message);

        assertThat(result).hasSize(1);
        assertThat(result).contains(Paths.get("./test"));
    }

    @Test
    public void testSinglePath() {
        Message<?> message = MessageBuilder.withPayload(Paths.get("./test")).build();
        Collection<Path> result = new InboundPayloadTransformer().doTransform(message);

        assertThat(result).hasSize(1);
        assertThat(result).contains(Paths.get("./test"));
    }

    @Test
    public void testCollectionOfFile() {
        Message<?> message = MessageBuilder.withPayload(Arrays.asList(
                new File("./test1"),
                new File("./test2"),
                new File("./test3")
        )).build();
        Collection<Path> result = new InboundPayloadTransformer().doTransform(message);

        assertThat(result).hasSize(3);
        assertThat(result).contains(Paths.get("./test1"),
                                    Paths.get("./test2"),
                                    Paths.get("./test3"));
    }

    @Test
    public void testCollectionOfPath() {
        Message<?> message = MessageBuilder.withPayload(Arrays.asList(
                Paths.get("./test1"),
                Paths.get("./test2"),
                Paths.get("./test3")
        )).build();
        Collection<Path> result = new InboundPayloadTransformer().doTransform(message);

        assertThat(result).hasSize(3);
        assertThat(result).contains(Paths.get("./test1"),
                                    Paths.get("./test2"),
                                    Paths.get("./test3"));
    }

    @Test
    public void testMixedCollection() {
        Message<?> message = MessageBuilder.withPayload(Arrays.asList(
                Paths.get("./test1"),
                new File("./test2"),
                Paths.get("./test3")
        )).build();
        Collection<Path> result = new InboundPayloadTransformer().doTransform(message);

        assertThat(result).hasSize(3);
        assertThat(result).contains(Paths.get("./test1"),
                                    Paths.get("./test2"),
                                    Paths.get("./test3"));
    }

    @Test(expected = UnsupportedPayloadException.class)
    public void testEmptyCollection() {
        Message<?> message = MessageBuilder.withPayload(Collections.emptyList()).build();

        new InboundPayloadTransformer().doTransform(message);
    }

    @Test(expected = UnsupportedPayloadException.class)
    public void testInvalidCollection() {
        Message<?> message = MessageBuilder.withPayload(Arrays.asList(
                Paths.get("./test1"),
                new File("./test2"),
                new Object()
        )).build();

        new InboundPayloadTransformer().doTransform(message);
    }

    @Test(expected = UnsupportedPayloadException.class)
    public void testInvalidSingleElement() {
        Message<?> message = MessageBuilder.withPayload(new Object()).build();

        new InboundPayloadTransformer().doTransform(message);
    }
}
