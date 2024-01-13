package com.bhanu.spring.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter Method");
		this.id = id;
	}
	// works as init method.. no need of method name as init.. it can be configured
	// in xml
	@PostConstruct
	public void hi() {
		System.out.println("Inisde Hi method");
	}

	// works as destroy method.
	@PreDestroy
	public void bye() {
		System.out.println("Inside Bye method");

	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
