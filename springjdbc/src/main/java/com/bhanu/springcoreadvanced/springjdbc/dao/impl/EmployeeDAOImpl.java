package com.bhanu.springcoreadvanced.springjdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.bhanu.springcoreadvanced.springjdbc.dao.EmployeeDAO;
import com.bhanu.springcoreadvanced.springjdbc.dto.Employee;
import com.bhanu.springcoreadvanced.springjdbc.rowmapper.EmployeeRowMapper;
@Component("dao")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	Employee employee=new Employee();
	
	@Override
	public int create(Employee employee) {
		String sql="insert into employees values(?,?,?)";
		int result=jdbcTemplate.update(sql,employee.getId(),employee.getFname(),employee.getLastname());
		return result;
	}
	@Override
	public int update(Employee employee) {
		String sql="update employees set firstname=?,lastname=? where id=?";
		int result=jdbcTemplate.update(sql,employee.getFname(),employee.getLastname(),employee.getId());
		return result;
		
	}
	@Override
	public int delete(int id) {
		String sql="delete from employees where id=?";
		int result=jdbcTemplate.update(sql,id);
		return result;
	}
	@Override
	public Employee read(int id) {
		// TODO Auto-generated method stub
		String sql="select * from employees where id=?";
		EmployeeRowMapper employeerm=new EmployeeRowMapper();
		Employee emp=jdbcTemplate.queryForObject(sql, employeerm,id);
		return emp;
	}
	@Override
	public List<Employee> read() {
		// TODO Auto-generated method stub
		String sql="select * from employees";
		EmployeeRowMapper employeerm=new EmployeeRowMapper();
		List<Employee> emp=jdbcTemplate.query(sql, employeerm);
		return emp;
	}
	
	

}
