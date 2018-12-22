 package com.app.extremity.controller;


import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.serviceimpl.Account_ServiceImpl;



  //author: pranay kohad 
   
//controller
@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	IHomeService homeService;
	
	@Autowired
	Account_ServiceImpl AService;
	

	static Logger logger = LogManager.getLogger(HomeController.class);

	@Autowired
	IAdminService adminService;
	
	@Autowired
	ServiceManagerInterface serviceManagerInterface;
	
	

	    
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
	public String signIn(Model model, @RequestParam String email,@RequestParam String password,HttpServletRequest request)    
	{ 

		logger.info("In SignIn controller log");
		int i=homeService.checkLoginCredentials(email,password,request);
	
		
		switch (i) {
		case 1:
			model.addAttribute("link", "adminDashboard.jsp");			
			return "Admin/adminIndex";			
		case 2:
			model.addAttribute("link", "salesManagerDashboard.jsp");
			return "SalesManager/salesManagerIndex";
		case 3:
			long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
			model.addAttribute("approvedServiceCount",sscount);

		    long tscount=serviceManagerInterface.getAllServiceCount();
			model.addAttribute("totalServiceCount", tscount);

			long ipcount=serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress");
			model.addAttribute("inProgerssServices", ipcount);
		
			long cscount=serviceManagerInterface.getAllServiceCountByServiceStatus("done");
			model.addAttribute("completedservices", cscount);
			model.addAttribute("link", "serviceManagerDashboard.jsp");
			return "ServiceManager/serviceManagerIndex";
		case 4:
			Date fd = null;
			Date ld = null;
			Date fds = null;
			Date lds = null;
			try {
				fd = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
				ld = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
				fds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
				lds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
			} catch (ParseException e) {
				
				e.printStackTrace();
			}
			
			long lg = AService.NewBikeCount(fd,ld);
				System.out.println("Home Controll.. New Bike Count is.. "+lg);
			model.addAttribute("lg", lg);			
			long lg1 = AService.SoldBikeCount(fds, lds);
				System.out.println("Home Controll.. Sold Bike Count is.. " + lg1);
			model.addAttribute("lg1", lg1);
			model.addAttribute("link", "accountsDashboard.jsp");
			return "Accounts/accountsIndex";
		default:
			model.addAttribute("msg", "Wrong Credentials");
			return "login";
		}
		
	}  
	
	   
	
	@RequestMapping(value="/gotToColorOptionPage")
	public String gotToColorOptionPage()    
	{ 	
		System.out.println("In gotToColorOptionPage controller");
		return "IndivisualUser/indivisualUserIndex";
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
