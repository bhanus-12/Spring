package com.bhanu.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhanu.springaop.product.ProductService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/springaop/test/config.xml");
		ProductService product=(ProductService) ctx.getBean("product");
		System.out.println(product.multiply(4, 5));
		
	}

}
