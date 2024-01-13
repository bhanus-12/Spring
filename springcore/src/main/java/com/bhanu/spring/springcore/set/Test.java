package com.bhanu.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhanu.spring.springcore.list.Hospital;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/spring/springcore/set/config.xml");
	CarDealer cd=(CarDealer) ctx.getBean("cd");
		System.out.println("CarDealer Name: "+cd.getName());
		System.out.println("Car Models: "+cd.getModels());
		System.out.println(cd);
	}

}
