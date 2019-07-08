package com.bnpp.galaxy.gxt.app.configuration.datasource;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "finastraEntityManagerFactory", basePackages = {
		"com.bnpp.galaxy.repositories" })
@Configuration
public class FinastraDBConfig {

	@Bean(name = "finastraDataSource")
	@ConfigurationProperties(prefix = "finastra.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "finastraEntityManagerFactory")
	@Qualifier("finastraEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("finastraDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.bnpp.galaxy.entities.finastra")
				.persistenceUnit("finastra_PU").build();
	}

	@Bean(name = "finastraTransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("finastraEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
