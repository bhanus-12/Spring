package com.bhanu.springcoreadvanced.springjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.bhanu.springcoreadvanced.springjdbc.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {
	
	Employee employee=new Employee();
	List<Employee> emp;
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setId(rs.getInt(1));
		employee.setFname(rs.getString(2));
		employee.setLastname(rs.getString(3));
		return employee;
	}
	

}
