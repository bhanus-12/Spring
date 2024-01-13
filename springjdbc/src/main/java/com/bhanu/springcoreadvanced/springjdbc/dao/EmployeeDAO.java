package com.bhanu.springcoreadvanced.springjdbc.dao;

import java.util.List;

import com.bhanu.springcoreadvanced.springjdbc.dto.Employee;

public interface EmployeeDAO {
	
	public int create(Employee employee);
	public int update(Employee employee);
	public int delete(int id);
	public Employee read(int id);
	public List<Employee> read();

}
