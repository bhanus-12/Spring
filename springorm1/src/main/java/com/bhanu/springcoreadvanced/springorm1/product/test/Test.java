package com.bhanu.springcoreadvanced.springorm1.product.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bhanu.springcoreadvanced.springjdbc.dao.EmployeeDAO;
import com.bhanu.springcoreadvanced.springjdbc.dto.Employee;
import com.bhanu.springcoreadvanced.springorm1.product.dao.ProductDAO;
import com.bhanu.springcoreadvanced.springorm1.product.entities.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/springcoreadvanced/springorm1/product/test/config.xml");
		ProductDAO dao=(ProductDAO)ctx.getBean("dao");
		Product product=new Product();
		/*product.setId(1);
		product.setName("Samsung");
		product.setDesc("Awesome");
		product.setPrice(25000.00);
		int res=dao.create(product);
		System.out.println("Records inserted: "+res);*/
		/*product.setPrice(30000.00);
		int res=dao.update(product);
		System.out.println("Records updated: "+res);*/
		/*product.setId(1);
		product.setName("Samsung");
		product.setDesc("Awesome");
		product.setPrice(25000.00);
		int res=dao.delete(product);
		System.out.println("Records Deleted: "+res);*/
		List<Product> res=dao.loadAll();
		for ( Product elem : res ) {
			  System.out.println("Element : "+elem);
			}
		System.out.println("Records : "+res);
	}
}
