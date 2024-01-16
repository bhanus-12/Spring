package com.bhanu.springcoreadvanced.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bhanu.springcoreadvanced.springmvc.controllers.dto.User;

@Controller
public class UserController {
	@RequestMapping("userRegistration")
	public ModelAndView registerUser() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	@RequestMapping(value="registerUser",method=RequestMethod.GET)
	public ModelAndView userData(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;
		
	}
	
}
