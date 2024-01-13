package com.bhanu.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee {
	@Value("Bhanu")
	private String name;
	@Autowired
	private Profile profile;
	
	private Address address;
	
	public Employee(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", profile=" + profile + ", address=" + address + "]";
	}
	
	

}
