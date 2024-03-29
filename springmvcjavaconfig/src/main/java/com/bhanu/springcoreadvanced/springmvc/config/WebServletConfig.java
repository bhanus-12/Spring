package com.bhanu.springcoreadvanced.springmvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generatedt method stub
		AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
		ctx.register(SpringConfig.class);
		ServletRegistration.Dynamic servlet=servletContext.addServlet("dispatcher", new DispatcherServlet(ctx));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	
	}

}
