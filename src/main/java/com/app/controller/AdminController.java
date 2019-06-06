package com.app.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Admin;
import com.app.validator.AdminValidator;

@Controller
public class AdminController {
	@Autowired
	private AdminValidator validator;
	public AdminController() 
	{
		System.out.println("I m from Controller");
	}
	
    @RequestMapping("/admin") 
	public ModelAndView showPage() {
    	ModelAndView m=new ModelAndView();
    	m.setViewName("Admin");
    	Admin a = new Admin();
    	m.addObject("admin", a);
    	
		return m;
		
	}
    @RequestMapping(value="/save", method=RequestMethod.POST) 
   	public ModelAndView readForm(@ModelAttribute Admin admin, Errors errors) {
    	validator.validate(admin, errors);
		
       	ModelAndView m=new ModelAndView();
       	if(errors.hasErrors()) 
       	{ 
			m.setViewName("Admin");
		}
       	else 
       	{ 
			m.setViewName("Data");
			System.out.println(admin);
			m.addObject("emp", admin);
		}
       	
   		return m;
   		
   	}
}


