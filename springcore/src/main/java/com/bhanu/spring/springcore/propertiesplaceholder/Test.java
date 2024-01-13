package com.bhanu.spring.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/propertiesplaceholder/config.xml");
		MyDAO dao=(MyDAO) ctx.getBean("myDao");
		System.out.println(dao);
	}

}
