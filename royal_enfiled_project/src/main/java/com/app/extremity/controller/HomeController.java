 package com.app.extremity.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.management.Notification;
import javax.servlet.http.HttpServletResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	
	@RequestMapping(value="/MyNotificationsPage1")
	public String MyNotificationsPage(Model model){

		//notificationInterface.saveNotfication(null);  
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("akash");
		model.addAttribute("outboxList",outboxList);
		
		
		//TODO: get login user name from session 
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("akash");
		for(Notfication n : inboxList) {
			System.out.println("name.." + n.getReciverName());
		}
		model.addAttribute("inboxList",inboxList);   

		model.addAttribute("a","10100");
	
		model.addAttribute("link","myNotifications.jsp");	
		return "Accounts/accountsIndex";
	}
	

	
	
	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model)throws IOException {
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("akash");
		model.addAttribute("outboxList",outboxList);  
		
		//TODO: get login user name from session
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("akash");
		model.addAttribute("inboxList",inboxList);   
		
		model.addAttribute("link","myNotifications.jsp");	
		return "Accounts/accountsIndex";

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
		notify.setSenderName("akash"); 
		notify.setSenderImg("person1.jpg");
		notify.setSenderPost("account manager");
		
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
