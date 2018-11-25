package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//author: pranay kohad

 
@Controller    
public class HomeController {
	    
	// All site actions are go through this method
	//This is our landing page
	@RequestMapping(value="/")
	public String homePage()
	{ 
		System.out.println("In home controller");
		return "home";
	}  
	 
	@RequestMapping(value="/loginPage")
	public String loginPage()
	{ 
		System.out.println("In login controller");

		return "login";
	} 
	
	@RequestMapping(value="/SignIn")
	public String signIn()    
	{ 
		
		System.out.println("In SignIn controller");
		return "IndivisualUser/indivisualUserIndex";//by default go to client index.jsp  
	}  
	
	
	@RequestMapping(value="/gotToColorOptionPage")
	public String gotToColorOptionPage()    
	{ 
		
		System.out.println("In gotToColorOptionPage controller");
		return "IndivisualUser/indivisualUserIndex";
	}
	
	@RequestMapping(value="/admin")
	public String admin()
	{  
		System.out.println("In admin controller");
		return "";
	} 
	
	@RequestMapping(value="/client")
	public String client()
	{  
		System.out.println("In client controller");
		return "";
	}
		
	@RequestMapping(value="/dealer")
	public String dealer()
	{  
		System.out.println("In dealer controller");
		return "";
	}
	
	@RequestMapping(value="/sales")
	public String sales()
	{  
		System.out.println("In sales controller");
		return "";
	}
	
	@RequestMapping(value="/service")
	public String service()
	{  
		System.out.println("In service controller");
		return "";
	}
}
