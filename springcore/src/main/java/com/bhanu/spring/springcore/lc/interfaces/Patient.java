package com.bhanu.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside setter Method");
		this.id = id;
	}
	//works as init method.. no need of method name as init.. it can be configured in xml
	/*
	 * public void hi() { System.out.println("Inisde Hi method"); }
	 * 
	 * //works as destroy method. public void bye() {
	 * System.out.println("Inside Bye method"); }
	 */
	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside init method");
		
	}

}
