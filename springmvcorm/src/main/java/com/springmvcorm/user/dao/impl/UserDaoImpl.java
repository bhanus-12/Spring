package com.springmvcorm.user.dao.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springmvcorm.user.dao.UserDao;
import com.springmvcorm.user.entities.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;


	@Override
	public int create(User user) {
		// TODO Auto-generated method stub
		Integer result = (Integer)hibernateTemplate.save(user);
		return result;
	}

}
