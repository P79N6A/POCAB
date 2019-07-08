package com.bnpp.galaxy.gxt.app.batch.enricher;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.file.MultiResourceItemReader;

public class CustomMultiResourceItemReader<T> implements ItemStreamReader<ResourceAwareItem<T>> {

    private final MultiResourceItemReader<T> delegate;

    public CustomMultiResourceItemReader(MultiResourceItemReader<T> delegate) {
        this.delegate = delegate;
    }

    @Override
    public ResourceAwareItem<T> read() throws Exception {
        T item = delegate.read();
        if (item == null) {
            return null;
        }
        String resource = delegate.getCurrentResource().getURL().toExternalForm();
        return new ResourceAwareItem<>(item, resource);
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        delegate.open(executionContext);
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        delegate.update(executionContext);

    }

    @Override
    public void close() throws ItemStreamException {
        delegate.close();
    }

}
