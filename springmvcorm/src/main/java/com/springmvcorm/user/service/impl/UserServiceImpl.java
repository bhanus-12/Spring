package com.springmvcorm.user.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springmvcorm.user.dao.UserDao;
import com.springmvcorm.user.entities.User;
import com.springmvcorm.user.service.UserService;
@Component("service")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	@Override
	@Transactional
	public int save(User user) {
		// TODO Auto-generated method stub
		Integer res=dao.create(user);
		return res;
	}

}
