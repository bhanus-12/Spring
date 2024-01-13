package com.bhanu.spring.springcore.lc.xmlconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/lc/xmlconfig/config.xml");
		Patient patient=(Patient) ctx.getBean("patient");
		System.out.println(patient);
		ctx.registerShutdownHook();
	}

}
