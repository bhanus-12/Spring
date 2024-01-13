package com.bhanu.spring.springcore.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Patient {
	
	private int id;
	private String name;
	private List<String> medicines;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", medicines=" + medicines + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getMedicines() {
		return medicines;
	}
	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}
	

}
