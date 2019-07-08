package com.bnpp.galaxy.gxt.app.report;

import com.bnpp.galaxy.entities.JobReport;

import java.util.HashMap;
import java.util.Map;

public class CacheExecution {

    private static CacheExecution instance;

    private Map<Long, JobReport> cache;

    public CacheExecution() {
        this.cache = new HashMap<Long, JobReport>();
    }

    public Map<Long, JobReport> getCache() {
        return cache;
    }

    public static synchronized CacheExecution getInstance() {
        if (instance == null)
            instance = new CacheExecution();
        return instance;
    }
}
