package com.bnpp.galaxy.gxt.app.batch.processors;

import org.springframework.batch.item.ItemProcessor;

import com.bnpp.galaxy.gxt.app.engine.core.GXTEngine;
import com.bnpp.galaxy.gxt.app.engine.core.GXTEngineTarget;

public class GXTEngineItemProcessor<T extends GXTEngineTarget> implements ItemProcessor<T, T> {

    private final GXTEngine<T> delegate;

    public GXTEngineItemProcessor(GXTEngine<T> delegate) {
        this.delegate = delegate;
    }

    @Override
    public T process(T target) throws Exception {
        return delegate.execute(target);
    }

}
