package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestService;

/**
 * Mark a service as been cache aware
 */
public interface CacheableFusionInvestService extends FusionInvestService {

    /**
     * Entirely empty the defined cache for that service. Note that depending on the cache strategy, the
     * cache may also be cleared for other services (and potentially for ALL services).
     */
    void clearCache();

}
