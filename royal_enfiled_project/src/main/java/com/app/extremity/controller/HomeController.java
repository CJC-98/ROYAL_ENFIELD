package com.app.extremity.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.extremity.iservice.IDealerService;
import com.app.extremity.model.Country;



  //author: pranay kohad 
   
//controller
@Controller    
public class HomeController {
	@Autowired IDealerService service;
	
	static Logger logger = LogManager.getLogger(HomeController.class);
	    
	// All site actions are go through this method
	    //This is our landing page
	@RequestMapping(value="/")
	public String homePage()
	{ 
		logger.info("In home controller log");
		return "home";
	}  
	
	@RequestMapping(value="/loginPage")
	public String loginPage()
	{ 
		System.out.println("In login controller");

		return "login";
	} 
	@RequestMapping("/signup")
	public String reg(ModelMap map)
	{
		System.out.println("in registration");
		List<Country>list= service.getAllcountry();
	    map.put("data", list);

		return "signup";
	}
	
	
	
	@RequestMapping(value="/SignIn")
	public String signIn(Model model)    
	{ 
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","dealerDashboard.jsp");
	
		System.out.println("In SignIn controller");
		return "Dealer/dealerIndex";//by default go to client index.jsp  

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
