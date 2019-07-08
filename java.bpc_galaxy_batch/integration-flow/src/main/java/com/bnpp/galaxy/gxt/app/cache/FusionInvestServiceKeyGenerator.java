package com.bnpp.galaxy.gxt.app.cache;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestService;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;

import java.lang.reflect.Method;

/**
 * Custom {@link KeyGenerator} implementation that generate a key using the service name and method parameters.
 * Returns the service itself if no method parameter is given, otherwise returns a SimpleKey of the service + parameters.
 *
 * @see SimpleKeyGenerator
 */
public class FusionInvestServiceKeyGenerator implements KeyGenerator {
    @Override
    public Object generate(Object target, Method method, Object... params) {
        FusionInvestService service = (FusionInvestService) target;
        Object[] elements = new Object[params.length + 1];

        elements[0] = service.getName();

        System.arraycopy(params, 0, elements, 1, params.length);

        // Delegate to provided Spring implementation
        return SimpleKeyGenerator.generateKey(elements);
    }
}
