package com.bhanu.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/dependencycheck/config.xml");
		Patient patient=(Patient) ctx.getBean("patient");
		System.out.println(patient);
	}
	
}
