package com.bhanu.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/list/config.xml");
	Hospital hsp=(Hospital) ctx.getBean("hsp");
		System.out.println("Hospital Name: "+hsp.getName());
		System.out.println("Departments:. "+hsp.getDepartments());
	}

}
