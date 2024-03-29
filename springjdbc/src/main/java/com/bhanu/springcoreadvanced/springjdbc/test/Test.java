package com.bhanu.springcoreadvanced.springjdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bhanu.springcoreadvanced.springjdbc.dao.EmployeeDAO;
import com.bhanu.springcoreadvanced.springjdbc.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/bhanu/springcoreadvanced/springjdbc/test/config.xml");
		//JdbcTemplate jdbcTemplate=(JdbcTemplate)ctx.getBean("jdbcTemplate");
		/*Employee emp=new Employee();
		emp.setId(2);
		emp.setFname("Bob");
		emp.setLastname("Ferguson");*/
		int id=2;
		/*String sql="insert into employees values(?,?,?)";
		int result=jdbcTemplate.update(sql,emp.getId(),emp.getFname(),emp.getLastname());
		System.out.println("Records inserted: "+result);*/
		EmployeeDAO dao=(EmployeeDAO)ctx.getBean("dao");
		/*int result= dao.create(emp);
		System.out.println("Records inserted: "+result);*/
		/*int result= dao.update(emp);
		System.out.println("Records updated: "+result);*/
		/*int result= dao.delete(id);
		System.out.println("Records deleted: "+result);*/
		System.out.println(dao.read(id));
		System.out.println(dao.read());

		
		
	}
}
