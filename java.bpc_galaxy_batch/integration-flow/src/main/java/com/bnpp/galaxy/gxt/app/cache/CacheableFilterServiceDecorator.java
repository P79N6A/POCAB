package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FilterService;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestException;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "FilterFusionInvestService", keyGenerator = "fusionInvestServiceCacheKeyGenerator")
public class CacheableFilterServiceDecorator<T> implements FilterService<T>, CacheableFusionInvestService {

    private final FilterService<T> delegate;

    public CacheableFilterServiceDecorator(FilterService<T> delegate) {
        this.delegate = delegate;
    }

    @Override
    public String getName() {
        return delegate.getName();
    }

    @Override
    @Cacheable
    public T call() throws FusionInvestException {
        return delegate.call();
    }

    @Override
    @CacheEvict
    public void clearCache() {
        // Do nothing, just let Spring clear cache
    }
}
