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



import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.IAdminService;

import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;

import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
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
					
	

	/*	CustomizationBikeInfo cbi = new CustomizationBikeInfo();
		cbi.setChasisNumber("PTP59841");
		cbi.setPlateNumber("MH-17-SP-4170");
		

		CustomizationInvoice ci = new CustomizationInvoice();
		ci.setAmount(8000);
		ci.setCustomizationCGstPercent(4);
		ci.setCustomizationsGstPercent(4);
		ci.setTotalAmount(11200);
		 
		CustomizationChart cc1 = new CustomizationChart();
		cc1.setPart("Engine");
		cc1.setCost(150);
		   
		CustomizationChart cc2 = new CustomizationChart();
		cc2.setPart("Brake");
		cc2.setCost(1500);

		//ipcount => in progress count
		long ipcount=serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress");
		System.out.println("In progerss services are:"+ipcount);
		model.addAttribute("inProgerssServices", ipcount);


		long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
		model.addAttribute("approvedServiceCount",sscount);
 
		CustomizationChart cc3 = new CustomizationChart();
		cc3.setPart("Seat");
		cc3.setCost(500);
		
		CustomizationChart cc4 = new CustomizationChart();
		cc4.setPart("Headlight");
		cc4.setCost(2500);
		
		
	   BikeCustomization bc1 = new BikeCustomization();
		
	    bc1.setAppointmentDate("17-12-2018");
		bc1.setCustomizationBikeInfo(cbi);
		
		bc1.getCustomizationChart().add(cc1);
		bc1.getCustomizationChart().add(cc2);
		bc1.getCustomizationChart().add(cc3);
		bc1.getCustomizationChart().add(cc4);
		

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

	

		cc1.setBikeCustomization(bc1);
		cc2.setBikeCustomization(bc1);
		cc3.setBikeCustomization(bc1);
		cc4.setBikeCustomization(bc1);
		bc1.setCustomizationInvoice(ci);
		
		String nextCustomizeId = serviceManagerInterface.getNextBikeCustomizationId();
		
		bc1.setBikeCustomizationId(nextCustomizeId);
		
		serviceManagerInterface.saveBikeCustomization(bc1);*/


		
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
	
	@RequestMapping(value="/AvailableServicesPage")
	public String AvailableServicesPagePage(Model model){
		
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
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("pranay", false);
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
