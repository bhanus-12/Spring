package com.bhanu.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/properties/config.xml");
	CountryAndLangs cal=(CountryAndLangs) ctx.getBean("cal");
		
		System.out.println(cal);
	}

}
