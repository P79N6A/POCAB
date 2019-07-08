package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestService;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.FusionInvestServicesRegistry;
import com.bnpp.galaxy.gxt.app.engine.fusioninvest.impl.SimpleServicesRegistry;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.ListableBeanFactory;

import java.util.Collection;
import java.util.Objects;

/**
 * Implementation of {@link FusionInvestServicesRegistry} that automatically discovers and registers
 * all {@link FusionInvestService}s declared as Spring beans.
 */
public class AutoDiscoveringServicesRegistry extends SimpleServicesRegistry implements InitializingBean {

    private final ListableBeanFactory beanFactory;

    public AutoDiscoveringServicesRegistry(ListableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    @Override
    public void afterPropertiesSet() {
        Objects.requireNonNull(beanFactory, "beanFactory");
        registerSpringBeans();
    }

    private void registerSpringBeans() {
        Collection<FusionInvestService> beans = beanFactory.getBeansOfType(FusionInvestService.class).values();

        register(beans);
    }
}
