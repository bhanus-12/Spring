package com.bhanu.spring.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bhanu.spring.dao.Dao;
import com.bhanu.spring.dao.Service;
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
		ctx.register(SpringConfig2.class);
		Service dao=(Service)ctx.getBean(Service.class);
		dao.display();
	}

}
