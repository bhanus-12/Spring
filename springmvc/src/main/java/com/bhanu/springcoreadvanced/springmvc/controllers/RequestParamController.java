package com.bhanu.springcoreadvanced.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamController {
	@RequestMapping("showData")
	public ModelAndView showData(@RequestParam("id") int id,@RequestParam("name")String name,@RequestParam("salary")double sal) {
		ModelAndView modelAndView=new ModelAndView();
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Sal : "+sal);
		modelAndView.setViewName("userReg");
		return modelAndView;
		
	}

}
