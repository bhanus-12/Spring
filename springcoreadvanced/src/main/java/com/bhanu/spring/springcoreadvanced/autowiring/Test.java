package com.bhanu.spring.springcoreadvanced.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcoreadvanced/autowiring/config.xml");
		Employee emp=(Employee) ctx.getBean("emp");
		System.out.println(emp);
		}

}
