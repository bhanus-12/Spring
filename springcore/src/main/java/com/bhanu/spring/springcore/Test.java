package com.bhanu.spring.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/config.xml");
		Employee emp=(Employee) ctx.getBean("emp");
		System.out.println("Employee ID: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
	}

}
