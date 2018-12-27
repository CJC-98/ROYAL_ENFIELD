package com.app.extremity.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IDealerService;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.Country;
import com.app.extremity.serviceimpl.DealerServiceImplementation;
import com.app.extremity.serviceimpl.HomeServiceImplementation;


  //author: pranay kohad 
   
//controller
@Controller    
public class HomeController {
	@Autowired
	IHomeService homeService;
	@Autowired 
	IDealerService dservice;
	
	HttpSession session;
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
		List<Country>list= dservice.getAllcountry();
	    map.put("data", list);

		return "signup";
	}
	
	@RequestMapping(value="/SignIn")
	public String signIn1(Model model, @RequestParam String email,@RequestParam String password,HttpServletRequest request)    
	{ 
			System.out.println("in si");
		logger.info("In SignIn controller log");
		int i=homeService.checkLoginCredentials(email,password,request);
		session = request.getSession();
		
		switch (i) {
		case 1:
			model.addAttribute("link", "adminDashboard.jsp");			
			return "Admin/adminIndex";			
		case 2:
			model.addAttribute("link", "salesManagerDashboard.jsp");
			return "SalesManager/salesManagerIndex";
		case 3:
			/*//get service count
			model.addAttribute("approvedServiceCount", serviceManagerInterface.getAllServiceCountByServiceStatus("waiting"));
			model.addAttribute("inProgerssServices", serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress"));
			model.addAttribute("completedservices", serviceManagerInterface.getAllServiceCountByServiceStatus("done"));
			model.addAttribute("totalServiceCount", serviceManagerInterface.getAllServiceCount());
			
			//get customization count
			model.addAttribute("approvedCustomizationCount", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("waiting"));
			model.addAttribute("inProgerssCustomization", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("in-progress"));
		    model.addAttribute("completedCustomization", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("done"));
			//get short notification list
			model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
			model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
			*/
			/*model.addAttribute("link", "serviceManagerDashboard.jsp");
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
			model.addAttribute("lg1", lg1);*/
			model.addAttribute("link", "accountsDashboard.jsp");
			return "Accounts/accountsIndex";
			
		case 5:
			model.addAttribute("link", "dealerDashboard.jsp");
			return "Dealer/dealerIndex";
		case 6:
			//return user home page here
	
		default:
			model.addAttribute("msg", "Wrong Credentials");
			return "login";
		}
		
	}  
	
	   
	
	@RequestMapping(value="/gotToColorOptionPage")
	public String gotToColorOptionPage1()    
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
