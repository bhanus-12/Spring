package com.springmvcorm.user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springmvcorm.user.entities.User;

public interface UserDao {
	public int create(User user);
}
