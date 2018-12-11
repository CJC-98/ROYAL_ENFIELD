package com.app.extremity.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.extremity.iservice.Account_ServiceInterface;



@Controller    
public class HomeController {
	
	@Autowired
	Account_ServiceInterface AService;
	
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
		logger.info("In login controller log");

		return "login";
	}    
	
	@RequestMapping(value="/SignIn")
	public String signIn(Model model)    
	{ 
		System.out.println("In SignIn controller......");
		model.addAttribute("link", "accountsDashboard.jsp");
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long lg = AService.NewBikeCount(fd,ld);
			System.out.println("Home Controll.. New Bike Count is.. "+lg);
		model.addAttribute("lg", lg);
		
		long lg1 = AService.SoldBikeCount(fds, lds);
			System.out.println("Home Controll.. Sold Bike Count is.. " + lg1);
		model.addAttribute("lg1", lg1);
			
		return "Accounts/accountsIndex";//by default go to client index.jsp  
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
