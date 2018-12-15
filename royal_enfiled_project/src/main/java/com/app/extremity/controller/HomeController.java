 package com.app.extremity.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;



  //author: pranay kohad 
   
//controller
@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	IHomeService homeService;
	
	static Logger logger = LogManager.getLogger(HomeController.class);
	@Autowired
	IAdminService adminService;
	
	

	    
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
		logger.info("In login controller log");
		
		return "login";
	}    
	
	/*this method will check login credentials 
	 * 
	 * Author: Nilesh Tammewar
	 * */ 
	
	@RequestMapping(value="/SignIn")
	public String signIn(Model model, @RequestParam String email,@RequestParam String password)    
	{ 
		
		logger.info("In SignIn controller log");
		int i=homeService.checkLoginCredentials(email,password);
		switch (i) {
		case 1:
			model.addAttribute("link", "adminDashboard.jsp");
			
			return "Admin/adminIndex";
			
		case 2:
			model.addAttribute("link", "salesManagerDashboard.jsp");
			return "SalesManager/salesManagerIndex";
		case 3:
			model.addAttribute("link", "serviceManagerDashboard.jsp");
			return "ServiceManager/serviceManagerIndex";
		case 4:
			model.addAttribute("link", "accountsIndex.jsp");
			return "Accounts/accountsIndex";
		default:
			model.addAttribute("msg", "Wrong Credentials");
			return "login";
		}
		
		//return "IndivisualUser/indivisualUserIndex";//by default go to client index.jsp  

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
