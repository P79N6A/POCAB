package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.cache.CacheHelper;
import com.bnpp.galaxy.gxt.app.cache.FusionInvestServiceKeyGenerator;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestService;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * There are two available strategies for implementing external services caching.
 * <ol>
 * <li>
 * Using a custom {@link CacheResolver} per each service instance. Implications
 * are:
 * <ul>
 * <li>There is a single {@link Cache} instance per each service instance</li>
 * <li>Application is able to clear cache for all services</li>
 * <li>Application is able to clear cache for all services of one type (Filter/Transcoding)</li>
 * <li>Application is able to clear cache for a single service instance</li>
 * </ul>
 * Example configuration to use that strategy:
 * <pre>{@code
 * @CacheConfig(cacheResolver = "fusionInvestServiceCacheResolver")
 * public class CacheableFilterServiceDecorator<T> {}
 *
 * @CacheConfig(cacheResolver = "fusionInvestServiceCacheResolver")
 * public class CacheableTranscodingServiceDecorator<I, O> {}
 * }
 * </li>
 * <li>
 * Using a custom {@link KeyGenerator} that generate keys using method parameters AND
 * {@link FusionInvestService#getName() service instance name}. Implications are:
 * <ul>
 * <li>There is NO single {@link Cache} instance per service. Instead, there is a
 * {@link Cache} instance per service type (Filter/Transcoding)</li>
 * <li>Application is able to clear cache for all services</li>
 * <li>Application is able to clear cache for all services of one type (Filter/Transcoding)</li>
 * <li>Application is NOT ABLE to clear cache for a single service instance</li>
 * </ul>
 * Example configuration to use that strategy:
 * <pre>{@code
 * @CacheConfig(cacheNames = "FilterFusionInvestService", keyGenerator = "fusionInvestServiceCacheKeyGenerator")
 * public class CacheableFilterServiceDecorator<T> {}
 *
 * @CacheConfig(cacheNames = "TranscodingFusionInvestService", keyGenerator = "fusionInvestServiceCacheKeyGenerator")
 * public class CacheableTranscodingServiceDecorator<T> {}
 * }
 * </li>
 * </ol>
 */
@Configuration
@EnableCaching
public class CacheConfiguration {

    @Bean
    public CacheHelper cacheHelper(ListableBeanFactory beanFactory) {
        return new CacheHelper(beanFactory);
    }

    @Bean
    public KeyGenerator fusionInvestServiceCacheKeyGenerator() {
        return new FusionInvestServiceKeyGenerator();
    }

//    @Bean
//    public CacheResolver fusionInvestFilterServiceCacheResolver(CacheManager cacheManager) {
//        return FusionInvestServiceCacheResolver.forFilter(cacheManager);
//    }
//
//    @Bean
//    public CacheResolver fusionInvestTranscodingServiceCacheResolver(CacheManager cacheManager) {
//        return FusionInvestServiceCacheResolver.forTranscoding(cacheManager);
//    }

}
