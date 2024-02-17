package com.bhanu.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bhanu.spring.dao.Dao;
import com.bhanu.spring.dao.Service;

@Configuration
public class SpringConfig2 {
	
	@Bean
	public Service service() {
		return new Service();
	}
}
