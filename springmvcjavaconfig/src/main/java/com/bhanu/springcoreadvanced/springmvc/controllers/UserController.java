package com.bhanu.springcoreadvanced.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bhanu.springcoreadvanced.springmvc.controllers.dto.User;

@Controller
public class UserController {
	/*using ModelAndView 
	@RequestMapping("userRegistration")
	public ModelAndView registerUser() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("userReg");
		return modelAndView;
	}
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public ModelAndView userData(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;
		
	}*/
	//using ModelMap for data and returning view as normal string..making it lightly coupled and the code is more clean
	//ModelMap.addAttribute is used to set object 
	//to return a view - we can just return the view name as a string. 
	@RequestMapping("userRegistration")
	public String registerUser() {
		
		return "userReg";
	}
	@RequestMapping(value="registerUser",method=RequestMethod.POST)
	public String userData(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelMap modelMap=new ModelMap();
		modelMap.addAttribute("user", user);
		return "success";
		
	}
	
	
}
