package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestException;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.TranscodingService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "TranscodingFusionInvestService", keyGenerator = "fusionInvestServiceCacheKeyGenerator")
public class CacheableTranscodingServiceDecorator<I, O> implements TranscodingService<I, O>, CacheableFusionInvestService {

    private final TranscodingService<I, O> delegate;

    public CacheableTranscodingServiceDecorator(TranscodingService<I, O> delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    @Cacheable
    public O transcode(I input) throws FusionInvestException {
        return delegate.transcode(input);
    }

    @Override
    @CacheEvict
    public void clearCache() {
        // Do nothing, just let Spring clear cache
    }

}
