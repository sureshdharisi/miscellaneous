package com.home.angular.configuration;

import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Path;

import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

@Configuration
public class CXFConfig {
	private Logger logger = LoggerFactory.getLogger(CXFConfig.class);
	@Autowired
	private Bus bus;

	@Autowired
	private ApplicationContext applicationContext;

	@Bean
	public Server rsServer() {
		final JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
		endpoint.setProvider(new JacksonJsonProvider());
		endpoint.setBus(bus);
		endpoint.setAddress("/angular-services");
		endpoint.setServiceBeans(getServiceBeans());
		return endpoint.create();
	}

	private List<Object> getServiceBeans() {
		// Print list of beans here
		List<Object> serviceBeansList = applicationContext.getBeansWithAnnotation(Path.class).values().stream()
				.collect(Collectors.toList());
		logger.debug("Service beans::::" + serviceBeansList);
		return serviceBeansList;
	}
}
