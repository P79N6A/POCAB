package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.configuration.CacheConfiguration;
import org.springframework.beans.factory.ListableBeanFactory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CacheHelper {

    private final ListableBeanFactory beanFactory;

    public CacheHelper(ListableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    /**
     * Evict all data cached from Fusion Invest services proxies
     */
    public void evictAllFusionInvestServicesCaches() {
        beanFactory.getBeansOfType(CacheableFusionInvestService.class)
                .values()
                .forEach(CacheableFusionInvestService::clearCache);
    }

    /**
     * Evict all data cached from given Fusion Invest services proxies. Note that depending on the cache strategy, the
     * cache may also be cleared for other services than the ones given (and potentially for ALL services).
     *
     * @param serviceNames Service(s) name(s) to clear cache
     * @see CacheConfiguration
     */
    public void evictFusionInvestServicesCaches(String... serviceNames) {
        evictFusionInvestServicesCaches(new HashSet<>(Arrays.asList(serviceNames)));
    }

    /**
     * Evict all data cached from given Fusion Invest services proxies. Note that depending on the cache strategy, the
     * cache may also be cleared for other services than the ones given (and potentially for ALL services).
     *
     * @param serviceNames Services names to clear cache
     * @see CacheConfiguration
     */
    public void evictFusionInvestServicesCaches(Set<String> serviceNames) {
        beanFactory.getBeansOfType(CacheableFusionInvestService.class)
                .values()
                .stream()
                .filter(s -> serviceNames.contains(s.getName()))
                .forEach(CacheableFusionInvestService::clearCache);
    }

}
