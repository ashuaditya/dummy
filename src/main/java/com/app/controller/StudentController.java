package com.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentController {
	public StudentController() 
	{
		System.out.println("I m from Student Controller");
	}
	
    @RequestMapping("/show") 
	public String showPage() {
    	return "Home";
		
	}
    @RequestMapping("/display") 
   	public String readForm(ModelMap map) {
    	map.addAttribute("eid", 101);
   		return "Data1";
   		
   	}
}


