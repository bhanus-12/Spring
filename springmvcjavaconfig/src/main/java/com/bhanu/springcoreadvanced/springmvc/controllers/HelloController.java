package com.bhanu.springcoreadvanced.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhanu.springcoreadvanced.springmvc.controllers.dto.Employee;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView HelloView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Bhanu");
		modelAndView.addObject("salary",20000.00);
		return modelAndView;
		
	}
	
}
