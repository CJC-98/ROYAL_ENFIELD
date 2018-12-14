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
	
	@Autowired
	NotificationInterface notificationInterface;

	    
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
	
	
	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model){

		//notificationInterface.saveNotfication(null);  
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay");
		model.addAttribute("outboxList",outboxList);
		
		
		//TODO: get login user name from session 
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay kohad");
		model.addAttribute("inboxList",inboxList);   

	
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}
	

	
	
	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model)throws IOException {
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay kohad");
		model.addAttribute("outboxList",outboxList);  
		
		//TODO: get login user name from session
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay kohad");
		model.addAttribute("inboxList",inboxList);   
		
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";

	}
	
	
	@RequestMapping(value="/searchEmployee")    
	public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName) {
		
		if(adminService.getEmployeeDetailsByName(empName)!=null) 
			return adminService.getEmployeeDetailsByName(empName);

		return null;

	}
	
	@RequestMapping(value="/sendNotification")    
	public @ResponseBody String sendNotification(@RequestParam String reciverName, 
												 @RequestParam String reciverPost,
												 @RequestParam String reciverImg,
												 @RequestParam String message,
												 HttpServletResponse response, 
												 Model model) {
	
		
		
		Notfication notify = new Notfication();
		
		
		//TODO: get login user details from session
		notify.setSenderName("pranay"); 
		notify.setSenderImg("person1.jpg");
		notify.setSenderPost("Service Manager");
		
		notify.setReciverName(reciverName);
		notify.setReciverPost(reciverPost);
		notify.setReciverImg(reciverImg);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		notify.setMessage(message);
		
		Notfication n = notificationInterface.saveNotfication(notify);
		
		if(n!=null) {
			return "done";
		}
		
		return null;
		
	}


}
