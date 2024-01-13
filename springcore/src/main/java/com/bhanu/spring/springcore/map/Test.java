package com.bhanu.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/map/config.xml");
	Customer customer=(Customer) ctx.getBean("customer");
		System.out.println("Customer Id: "+customer.getId());
		System.out.println("Products: "+customer.getProducts());
		System.out.println(customer);
	}

}
