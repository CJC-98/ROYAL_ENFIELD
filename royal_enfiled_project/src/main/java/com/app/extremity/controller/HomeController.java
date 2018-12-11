package com.app.extremity.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



  //author: pranay kohad 
   
//controller
@Controller    
public class HomeController {
	
	static Logger logger = LogManager.getLogger(HomeController.class);
	    
	// All site actions are go through this method
	    //This is our landing page
	@RequestMapping(value="/")
	public String homePage()
	{ 
		logger.info("In home controller log");
		return "home";
	}  
	 
	@RequestMapping(value="")
	public String loginPage()
	{ 
		logger.info("In login controller log");

		return "login";
	}    
	
	@RequestMapping(value="/SignIn")
	public String signIn(Model model)    
	{ 
		
//		logger.info("In SignIn controller log");
//		model.addAttribute("link", "serviceManagerDashboard.jsp");
//		return "ServiceManager/serviceManagerIndex";
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
