package com.bhanu.springcoreadvanced.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bhanu.springcoreadvanced.springmvc.controllers.dto.Employee;

@Controller
public class ObjectController {

	@RequestMapping("displayList")
	public ModelAndView displayView() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("display");
		Employee emp1 = new Employee();
		emp1.setId(1);
		emp1.setName("ABC");
		emp1.setSalary(100000.00);
		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setName("DEF");
		emp2.setSalary(200000.00);
		Employee emp3 = new Employee();
		emp3.setId(3);
		emp3.setName("XYZ");
		emp3.setSalary(300000.00);
		ArrayList<Employee> employees=new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		modelAndView.addObject("employees",employees);
		modelAndView.addObject("employee3", emp3);
		return modelAndView;

	}

}
