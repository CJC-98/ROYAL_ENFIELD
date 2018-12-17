 package com.app.extremity.controller;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import com.app.extremity.iservice.IAdminService;

import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;

import com.app.extremity.model.EmployeeDetails;

import com.app.extremity.model.Notfication;

  
/* 
 * This controller helps to navigate in service manager index.jsp
 * and handle all request-response made by service manager
 *  */
 
    
@Controller
public class ServiceMangerController {
	

	static Logger logger = LogManager.getLogger(ServiceMangerController.class);
	
	@Autowired
	ServiceManagerInterface serviceManagerInterface;
	
	@Autowired
	NotificationInterface notificationInterface;
	
	@Autowired
	IAdminService adminService;
	
	
	HttpSession session;
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model,HttpServletRequest request){
		
		
		//test data for notification
		Notfication notify = new Notfication();
		

		notify.setSenderName("Siddhi");
		notify.setSenderImg("person2.jpg");
		notify.setSenderPost("accounts manager");
		

		notify.setReciverName("Chaitali");
		notify.setReciverImg("person1.jpg");
		notify.setReciverPost("service manger");
		
		notify.setMessage("I am leaving");
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		//notificationInterface.saveNotfication(notify);




	       //account => approved customization count
			long account=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Waiting");
			System.out.println("Approved Customization are:"+account);
			model.addAttribute("approvedCustomizationCount",account);
			
			//tc => total customization count
		    long tccount=serviceManagerInterface.getAllCustomizationCount();
			System.out.println("Total Customization are:"+tccount);
			model.addAttribute("totalCustomizationCount",tccount);
			
			//ipcount => in progress count
			long ipcount=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("InProgress");
			System.out.println("In progerss Customization are:"+ipcount);
			model.addAttribute("inProgerssCustomizationCount", ipcount);
			
			//cccount => completed customization count
			long cccount=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Completed");
			System.out.println("Completed Customization are:"+cccount);
			model.addAttribute("completedCustomizationCount", cccount);
					
	


		//ipcount => in progress count
		long ipcount1=serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress");
		System.out.println("In progerss services are:"+ipcount1);
		model.addAttribute("inProgerssServices", ipcount1);



		
		session = request.getSession();
		
		System.out.println("name "+session.getAttribute("currentUserName"));
		System.out.println("post "+session.getAttribute("currentUserPost"));
		System.out.println("img "+session.getAttribute("currentUserImg"));

		   
		
 
		long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
		model.addAttribute("approvedServiceCount",sscount);
 
		
	    long tscount=serviceManagerInterface.getAllServiceCount();
		model.addAttribute("totalServiceCount", tscount);


	
		long cscount=serviceManagerInterface.getAllServiceCountByServiceStatus("done");
		model.addAttribute("completedservices", cscount);

		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("inboxCount", inboxCount);
		

		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("shortInboxList", shortInboxList);




		
		 logger.info("dashboard hits........... log");
			model.addAttribute("link","serviceManagerDashboard.jsp");
			return "ServiceManager/serviceManagerIndex";


	
	}
	@RequestMapping(value="/ApprovedServicesPage")
	public String ApprovedServicesgPage(Model model,HttpServletRequest request){
		 
		
		System.out.println("approved service htis..................");
		session = request.getSession();
	


		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("inboxCount", inboxCount);
		

		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
     	model.addAttribute("inboxCount", inboxCount);
		

	
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ApprovedCustomizationPage")
	public String ApprovedCustomizationPage(Model model,HttpServletRequest request){

		session = request.getSession();

		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("inboxCount", inboxCount);
		

		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
    	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";  
	}
	
	@RequestMapping(value="/CustomizationInprogressPage")
	public String CustomizationInprogressPage(Model model,HttpServletRequest request){
		

		session = request.getSession();

		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		

		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeServicesRecordsPage")
	public String BikeServicesRecordsPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
	model.addAttribute("inboxCount", inboxCount);
		

		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
        model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeCustomizationRecordsPage")
	public String BikeCustomizationRecordsPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
	model.addAttribute("inboxCount", inboxCount);

	
	
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
        model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableServicesPage")
	public String AvailableServicesPagePage(Model model,HttpServletRequest request){
		

		session = request.getSession();
	
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
	model.addAttribute("inboxCount", inboxCount);
		

		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
    	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","availableServicing.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableCustomizationPage")
	public String AvailableCustomizationPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
 	   model.addAttribute("inboxCount", inboxCount);
	 	

		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
    	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInvoicePage")
	public String ServicesInvoicePage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
     	model.addAttribute("inboxCount", inboxCount);


		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
    	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","servicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/CustomizationInvoicePage")
	public String CustomizationInvoicePage(Model model,HttpServletRequest request){


		
		session = request.getSession();	

		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
	
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	

	
	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString());

		model.addAttribute("outboxList",outboxList);
			

		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString());

		model.addAttribute("inboxList",inboxList);   


		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("inboxCount", inboxCount);
		
		List<Notfication>shortInboxList=notificationInterface.getMyNotReadedInboxNotfication("currentUserName", false);
		
    	model.addAttribute("shortInboxList", shortInboxList);	
		
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}
	


	
	
	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model,HttpServletRequest request){
		
		session = request.getSession();
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));


		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString());

		model.addAttribute("outboxList",outboxList);  
		



		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString());
		model.addAttribute("inboxList",inboxList);   
		

	
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("inboxCount", inboxCount);
		

		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
     	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";

	}
	
	
	@RequestMapping(value="/searchEmployee")    
	public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName,HttpServletRequest request) {
		
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
												 HttpServletRequest request,
												 Model model) {
	
		session = request.getSession();
		
		Notfication notify = new Notfication();
	
		notify.setSenderName(session.getAttribute("currentUserName").toString()); 
		notify.setSenderImg(session.getAttribute("currentUserImg").toString());
		notify.setSenderPost(session.getAttribute("currentUserPost").toString());

		notify.setReciverName(reciverName);
		notify.setReciverPost(reciverPost);
		notify.setReciverImg(reciverImg);
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		notify.setMessage(message);
		
		
		System.out.println(session.getAttribute("currentUserName").toString());
		System.out.println(session.getAttribute("currentUserImg").toString());
		System.out.println(session.getAttribute("currentUserPost").toString());
		System.out.println(reciverName);
		System.out.println(reciverPost);
		System.out.println(reciverImg);
		System.out.println(message);

		Notfication n = notificationInterface.saveNotfication(notify);
		System.out.println("data saved.............................");
		if(n!=null) {
			return "done";
		}
		
		return null;
		
	}
	

}
