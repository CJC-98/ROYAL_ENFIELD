package com.app.extremity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SalesManagerController {
	
	
	@RequestMapping(value="/addnew")
	public String signIn(Model model)    
	{ 
		
		System.out.println("In SignIn controller");
		//return "IndivisualUser/indivisualUserIndex";
		//return "IndivisualUser/indivisualUserIndex";//by default go to client index.jsp  
		model.addAttribute("link","SalesManager/AddNewBike.jsp");
		return "SalesManager/salesManagerDashboard";

	}  
	
	

	
}
