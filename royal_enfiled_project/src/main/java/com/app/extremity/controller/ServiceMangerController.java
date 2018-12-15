package com.app.extremity.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.io.IOException;

import java.util.List;

import javax.management.Notification;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.AvailableServicing;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;

  
/* 
 * This controller helps to navigate in service manager index.jsp
 * and handle all request-response made by service manager
 *  */
 
    
@Controller
public class ServiceMangerController {
	
	@Autowired
	ServiceManagerInterface service;
	


	static Logger logger = LogManager.getLogger(ServiceMangerController.class);
	
	@Autowired
	ServiceManagerInterface serviceManagerInterface;
	
	@Autowired
	NotificationInterface notificationInterface;
	
	@Autowired
	IAdminService adminService;
	
//	public long inboxCount;
//	public List<Notfication> inboxList;
//	public List<Notfication> outboxList;
//	public List<Notfication> shortInboxList;
	
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model){
		
		
		//test data for notification
		Notfication notify = new Notfication();
		
		notify.setSenderName("samir");
		notify.setSenderImg("person2.png");
		notify.setSenderPost("accounts manager");
		
		notify.setReciverName("pranay");
		notify.setReciverImg("person1.png");
		notify.setReciverPost("service manger");
		
		notify.setMessage("I am leaving");
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		//notificationInterface.saveNotfication(notify);

		
		
		long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
		model.addAttribute("approvedServiceCount",sscount);

	    long tscount=serviceManagerInterface.getAllServiceCount();
		model.addAttribute("totalServiceCount", tscount);

		long ipcount=serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress");
		model.addAttribute("inProgerssServices", ipcount);
	
		long cscount=serviceManagerInterface.getAllServiceCountByServiceStatus("done");
		model.addAttribute("completedservices", cscount);
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);

		logger.info("dashboard hits........... log");
		model.addAttribute("link","serviceManagerDashboard.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
  
	@RequestMapping(value="/ApprovedServicesPage")
	public String ApprovedServicesgPage(Model model){
		 
		
		System.out.println("approved service htis..................");
	
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ApprovedCustomizationPage")
	public String ApprovedCustomizationPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";  
	}
	
	@RequestMapping(value="/CustomizationInprogressPage")
	public String CustomizationInprogressPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeServicesRecordsPage")
	public String BikeServicesRecordsPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeCustomizationRecordsPage")
	public String BikeCustomizationRecordsPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	
	
	@RequestMapping(value="/addNewService")
	public String saveServices(Model model,@ModelAttribute AvailableServicing saveService )
	{
		System.out.println("in addnewservice controller");
	
		
		service.saveNewServices(saveService);
		AvailableServicesPagePage(model);
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableServicesPage")
	public String AvailableServicesPagePage( Model model){
		

		List<AvailableServicing> list=service.getAllServices();
		System.out.println(list);
		model.addAttribute("list", list);
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","availableServicing.jsp");
		return "ServiceManager/serviceManagerIndex";
		
	}
	
	@RequestMapping(value="/AvailableCustomizationPage")
	public String AvailableCustomizationPage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInvoicePage")
	public String ServicesInvoicePage(Model model){
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","servicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/CustomizationInvoicePage")
	public String CustomizationInvoicePage(Model model){

		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	
	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model){
		
	
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay");
		model.addAttribute("outboxList",outboxList);
			
		//TODO: get login user name from session 
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay");
		model.addAttribute("inboxList",inboxList);   

		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pandurang", false);
		model.addAttribute("shortInboxList", shortInboxList);	
		
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}

	
	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model)throws IOException {
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay");
		model.addAttribute("outboxList",outboxList);  
		
		//TODO: get login user name from session
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay");
		model.addAttribute("inboxList",inboxList);   
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("pranay", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
		model.addAttribute("shortInboxList", shortInboxList);
		
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
