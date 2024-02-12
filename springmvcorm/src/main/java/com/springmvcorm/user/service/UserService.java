package com.springmvcorm.user.service;

import java.util.List;

import com.springmvcorm.user.entities.User;

public interface UserService {
	
	int save(User user);
	List<User> findAll();

}
