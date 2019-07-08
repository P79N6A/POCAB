package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.integration.exception.UnsupportedPayloadException;
import org.springframework.integration.transformer.AbstractTransformer;
import org.springframework.messaging.Message;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Payload transformer that accepts any message with payload of types {@link File}, {@link Path} or {@link Iterable} of
 * them, and returns a new message with copied headers and original payload as a {@link Collection} of {@link Path}.
 * <p>
 * Inbound message is required to have at lead one {@link File} or {@link Path} in its payload.
 * <p>
 * Inbound message payload may be a mixed collection of {@link File} and {@link Path}.
 */
public class InboundPayloadTransformer extends AbstractTransformer {

    @Override
    protected Collection<Path> doTransform(Message<?> message) {
        Object payload = message.getPayload();

        if (payload instanceof File) {
            return Collections.singleton(((File) payload).toPath());
        } else if (payload instanceof Path) {
            return Collections.singleton((Path) payload);
        } else if (payload instanceof Iterable) {
            Collection<Path> paths = new ArrayList<>();

            for (Object item : (Iterable) payload) {
                if (item instanceof Path) {
                    paths.add((Path) item);
                } else if (item instanceof File) {
                    paths.add(((File) item).toPath());
                } else {
                    throw new UnsupportedPayloadException();
                }
            }

            if (paths.isEmpty()) {
                throw new UnsupportedPayloadException();
            }

            return paths;
        }

        throw new UnsupportedPayloadException();
    }

}
