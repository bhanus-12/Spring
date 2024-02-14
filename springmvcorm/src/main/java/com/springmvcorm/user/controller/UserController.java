package com.springmvcorm.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvcorm.user.entities.User;
import com.springmvcorm.user.service.UserService;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
	@Autowired
	UserService service;

	@RequestMapping("user")
	public String userReg() {
		return "userReg";
	}

	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String saveUser(ModelMap model, @ModelAttribute("user") User user) {
		int res = service.save(user);
		model.addAttribute("result", "User is created successfully with id: " + res);
		return "userReg";

	}

	@RequestMapping("getUsers")
	public String getAllUsers(ModelMap model) {
		List<User> users = service.findAll();
		model.addAttribute("users", users);
		return "displayUsers";
	}
	@RequestMapping("validateEmail")
	public @ResponseBody String validateEmail(@RequestParam("id") int id) {
		User user=service.validateId(id);
		String msg="";
		if(user!=null) {
			msg=id+" already exists";
		}
		System.out.println("Inside validate Email: "+msg);
		return msg;
		
	}

}
