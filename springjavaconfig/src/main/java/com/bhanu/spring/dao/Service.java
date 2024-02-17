package com.bhanu.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
	@Autowired
	public Dao dao;
	
	public void display()
	{
		dao.create();
	}

}
