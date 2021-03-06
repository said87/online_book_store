package com.benali.onlineBookStore.config;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

	@Autowired
	EntityManager em;

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		config.exposeIdsFor(em.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
	}
}
