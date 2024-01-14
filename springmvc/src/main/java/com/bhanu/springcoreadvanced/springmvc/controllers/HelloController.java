package com.bhanu.springcoreadvanced.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	@RequestMapping("displayObject")
	public ModelAndView displayView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display");
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Bhanu");
		modelAndView.addObject("salary",20000.00);
		return modelAndView;
		
	}

}
