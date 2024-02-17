package com.bhanu.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bhanu.spring.dao.Dao;
import com.bhanu.spring.dao.Service;

@Configuration
public class SpringConfig {
	@Bean
	public Dao dao() {
		return new Dao();
	}
	@Bean
	public Service service() {
		return new Service();
	}
}
