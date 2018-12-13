package com.app.extremity.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



         
 
  //author: pranay kohad 
   
 



import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IHomeService;

@Controller
@RequestMapping("/")


public class HomeController {

	@Autowired
	IHomeService homeService;

	static Logger logger = LogManager.getLogger(HomeController.class);
	@Autowired
	IAdminService adminService;
	@RequestMapping(value = "/")
	public String homePage() {
		logger.info("In home controller log");
		return "home";
	}

	@RequestMapping(value = "/loginPage")
	public String loginPage() {
		logger.info("In login controller log");

		return "login";
	}

	/*
	 * this method will check login credentials
	 * 
	 * Author: Nilesh Tammewar
	 */

	@RequestMapping(value="/SignIn")
	public String signIn(Model model, @RequestParam String email,@RequestParam String password)    
	{ 

		System.out.println("In SignIn controller");

		//return "IndivisualUser/indivisualUserIndex";

		//return "IndivisualUser/indivisualUserIndex";//by default go to client index.jsp  
	//	model.addAttribute("link","salesManagerDashboard.jsp");
		return "IndivisualUser/indivisualUserIndex";


	



		  
	//	model.addAttribute("link","salesManagerDashboard.jsp");
		
	}  
	   
	
	



	@RequestMapping(value = "/gotToColorOptionPage")
	public String gotToColorOptionPage() {

		System.out.println("In gotToColorOptionPage controller");
		return "IndivisualUser/indivisualUserIndex";
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		System.out.println("In admin controller");
		return "adminDashboard/adminIndex";
	}

	@RequestMapping(value = "/client")
	public String client() {
		System.out.println("In client controller");
		return "";
	}

	@RequestMapping(value = "/dealer")
	public String dealer() {
		System.out.println("In dealer controller");
		return "";
	}

	         
	@RequestMapping(value="/sales")
	public String sales(Model model)
	{ 
		
		System.out.println("In sales controller...");
		model.addAttribute("link","salesManagerDashboard.jsp");
		//model.addAttribute("link","newdash.jsp");
	return "SalesManager/salesManagerIndex";
	
	
	}    
	


	         

  

	
	@RequestMapping(value="/service")
	public String service(Model model)
	{  

		model.addAttribute("link", "salesManagerDashboard.jsp");
		// model.addAttribute("link","newdash.jsp");
		return "SalesManager/salesManagerIndex";

	}


}
