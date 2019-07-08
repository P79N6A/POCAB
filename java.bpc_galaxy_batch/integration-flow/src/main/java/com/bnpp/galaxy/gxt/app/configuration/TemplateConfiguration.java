package com.bnpp.galaxy.gxt.app.configuration;

import com.bnpp.galaxy.gxt.app.template.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.dialect.IDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import java.util.Collection;

@Configuration
public class TemplateConfiguration {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    public ITemplateResolver textMailTemplateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setName("TEXTRESOLVER");
        resolver.setApplicationContext(applicationContext);
        resolver.setPrefix("classpath:/email/text/");
//        resolver.setSuffix(".txt");
        resolver.setTemplateMode(TemplateMode.TEXT);
        resolver.setCharacterEncoding("UTF-8");
        resolver.setCacheable(true);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public ITemplateResolver htmlMailTemplateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setApplicationContext(applicationContext);
        resolver.setPrefix("classpath:/email/html/");
//        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        resolver.setCharacterEncoding("UTF-8");
        resolver.setCacheable(true);
        resolver.setCheckExistence(true);
        return resolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(Collection<ITemplateResolver> templateResolvers, Collection<IDialect> dialects) {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setEnableSpringELCompiler(true);
        templateResolvers.forEach(engine::addTemplateResolver);
        dialects.forEach(engine::addDialect);
        return engine;
    }

    @Bean
    public TemplateService templateService() {
        return new TemplateService(templateEngine);
    }
}
