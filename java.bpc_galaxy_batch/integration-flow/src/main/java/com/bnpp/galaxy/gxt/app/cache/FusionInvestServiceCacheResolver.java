package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestService;
import org.springframework.cache.CacheManager;
import org.springframework.cache.interceptor.AbstractCacheResolver;
import org.springframework.cache.interceptor.CacheOperationInvocationContext;

import java.util.Collection;
import java.util.Collections;

/**
 *
 *
 */
public class FusionInvestServiceCacheResolver extends AbstractCacheResolver {

    private static final String DEFAULT_PREFIX = "FusionInvestServiceCache";

    private final String prefix;

    protected FusionInvestServiceCacheResolver(String prefix, CacheManager cacheManager) {
        super(cacheManager);
        this.prefix = prefix;
    }

    @Override
    protected Collection<String> getCacheNames(CacheOperationInvocationContext<?> context) {
        FusionInvestService service = (FusionInvestService) context.getTarget();
        String cacheName = getCacheName(service);

        return Collections.singleton(cacheName);
    }

    private String getCacheName(FusionInvestService service) {
        return prefix + service.getName();
    }

    public static FusionInvestServiceCacheResolver forFilter(CacheManager cacheManager) {
        return new FusionInvestServiceCacheResolver(DEFAULT_PREFIX + "_Filter_", cacheManager);
    }

    public static FusionInvestServiceCacheResolver forTranscoding(CacheManager cacheManager) {
        return new FusionInvestServiceCacheResolver(DEFAULT_PREFIX + "_Transcoding_", cacheManager);
    }

}
