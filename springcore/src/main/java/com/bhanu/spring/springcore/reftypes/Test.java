package com.bhanu.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/reftypes/config.xml");
		Student stu = (Student) ctx.getBean("student");

		System.out.println(stu);
	}

}
