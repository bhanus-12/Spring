package com.springmvcorm.user.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcorm.user.dao.UserDao;
import com.springmvcorm.user.entities.User;

public class UserDaoImpl implements UserDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;


	@Override
	@Transactional
	public int create(User user) {
		// TODO Auto-generated method stub
		Integer result = (Integer)hibernateTemplate.save(user);
		return result;
	}


	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(User.class);
	}


	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(User.class,id);
	}

}
