package com.bhanu.springcoreadvanced.springjdbc.dto;

public class Employee {
	private int id;
	private String fname;
	private String lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fname=" + fname + ", lastname=" + lastname + "]";
	}

}
