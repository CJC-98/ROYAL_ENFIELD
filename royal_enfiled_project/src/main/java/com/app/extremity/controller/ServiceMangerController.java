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
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.CustomizationBikeInfo;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;
import com.google.gson.Gson;

  
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
		
		session = request.getSession();
		
		//test data from bike servicing
		
		ServcingBikeInfo info = new ServcingBikeInfo();
		info.setModelName("bullet 500");
		info.setPlateNumber("MH-24-FD-1243");
		
		ServicingChart s1 = new ServicingChart();
		s1.setWork("labour cost");
		s1.setCost(245);
		s1.setStatus("done");
				
		ServicingChart s2 = new ServicingChart();
		s2.setWork("handle clean");
		s1.setCost(240);
		
		ServicingChart s3 = new ServicingChart();
		s3.setWork("bike clean");
		s3.setCost(3422);
		
		ServicingChart s4 = new ServicingChart();
		s4.setWork("seat clean");
		s4.setCost(50);
		
		ServicingInvoice i1 = new ServicingInvoice();
		i1.setAmount(3520);
		i1.setServiceCGstPercent(4);
		i1.setServiceSGstPercent(4);
		i1.setTotalAmount(3500);
		
		
		CustomizationBikeInfo cinfo = new CustomizationBikeInfo();
		info.setModelName("bullet 500");
		info.setPlateNumber("MH-24-FD-1243");
		
		CustomizationChart c1 = new CustomizationChart();
		c1.setPart("labour cost");
		c1.setCost(245);
		c1.setStatus("done");
				
		CustomizationChart c2 = new CustomizationChart();
		c1.setPart("Engine");
		c1.setCost(150);
		
		CustomizationChart c3 = new CustomizationChart();
		c3.setPart("Brake");
		c3.setCost(1500);
		
		CustomizationChart c4 = new CustomizationChart();
		c4.setPart("Seat");
		c4.setCost(500);
		
		
		CustomizationInvoice ci1 = new CustomizationInvoice();
		ci1.setAmount(3520);
		ci1.setCustomizationsGstPercent(4);
		ci1.setCustomizationCGstPercent(4);
		ci1.setTotalAmount(3500);
		
		
			
		
		//serviceManagerInterface.saveBikeServicing(bs);
		
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
		
		
		
		
		
		
		long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
		model.addAttribute("approvedServiceCount",sscount);

	    long tscount=serviceManagerInterface.getAllServiceCount();
		model.addAttribute("totalServiceCount", tscount);

		long ipcount=serviceManagerInterface.getAllServiceCountByServiceStatus("inprogress");
		model.addAttribute("inProgerssServices", ipcount);
	
		long cscount=serviceManagerInterface.getAllServiceCountByServiceStatus("done");
		model.addAttribute("completedservices", cscount);
		
		long account=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Waiting");
		
		model.addAttribute("approvedCustomizationCount",account);
		
	    long tccount=serviceManagerInterface.getAllCustomizationCount();
	
		model.addAttribute("totalCustomizationCount",tccount);
		

		long ipcount1=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("InProgress");
		
		model.addAttribute("inProgerssCustomization", ipcount1);
		
		long cccount=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Done");
	
		model.addAttribute("completedCustomization", cccount);
				


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
		

		List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("waiting");
		
		for(BikeServicing data: bikeServicingList) {
			System.out.println(data.getServcingBikeInfo().getModelName());
			System.out.println(data.getServiceProgressPercent());
			List<ServicingChart> chartlist = data.getServicingChart();
			
                 	 ServcingBikeInfo bikeno= data.getServcingBikeInfo();
				 System.out.println(""+bikeno.getChasisNumber()+" "+bikeno.getPlateNumber()+"");
						
						for(ServicingChart chart:chartlist) {
							System.out.println("      "+chart.getWork()+" "+chart.getCost()+" "+chart.getStatus());
						}
					
				}
		
        
		model.addAttribute("bikeServicingList",bikeServicingList);
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	
	
	
	@RequestMapping(value="/serviceDetails",method=RequestMethod.GET,produces="application/json")
	public @ResponseBody String update(HttpServletResponse res)throws IOException
	{

        List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("waiting");
		
		for(BikeServicing data: bikeServicingList) {
		 ServcingBikeInfo bikeno= data.getServcingBikeInfo();
        List<ServicingChart> chartlist = data.getServicingChart();
		for(ServicingChart chart:chartlist)
		{
		System.out.println("      "+chart.getWork()+" "+chart.getCost()+" "+chart.getStatus());
			
			
		String json=new Gson().toJson(chartlist);
		System.out.println(json);

		res.flushBuffer();
		res.setContentType("application/json");
		res.setCharacterEncoding("UTF-8");
		res.getOutputStream();
		System.out.println("..........");
		
		
		return json;
		
	}
	}
		return "ServiceManager/serviceManagerIndex";
     
	}
	
	
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(Model model,HttpServletRequest request){
		

		session = request.getSession();
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
     	model.addAttribute("inboxCount", inboxCount);
		

	
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);

		model.addAttribute("shortInboxList", shortInboxList);
		
		List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
		
		model.addAttribute("bikeServicingList",bikeServicingList);
		
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
		
		List<AvailableServicing> serviceList = serviceManagerInterface.getAllAvailableServicing();
		model.addAttribute("serviceList", serviceList);
	
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
    	
    	List<BikeServicing> bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("waiting");
    	for(BikeServicing data: bikeServicingList) {
    	ServicingInvoice servicingInvoicesList=data.getServicingInvoice();
    	System.out.println(""+servicingInvoicesList.getServicingInvoiceId()+","+servicingInvoicesList.getAmount()+"");
    	
    		
    	}
    	
    	model.addAttribute("bikeServicingList",bikeServicingList);
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
		

		

		List<Notfication>shortInboxList=notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);

		
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
	public String sendNotification(@RequestParam String reciverName, 
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
		
		Notfication n = notificationInterface.saveNotfication(notify);
		
		if(n!=null) {
			return "done";
		}
		
		return null;
		
	}
	
	@RequestMapping(value="/submitInProgressWork") 
	public String submitInProgressWork(@RequestParam(required = false) int workStatusChange[],Model model,HttpServletRequest request) {
		
		session = request.getSession();
		
		if(workStatusChange != null) {
			for(int i : workStatusChange) {
				System.out.println(i);
			}
			List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
			model.addAttribute("bikeServicingList",bikeServicingList);

			long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
			model.addAttribute("inboxCount", inboxCount);
			
			List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
	     	model.addAttribute("shortInboxList", shortInboxList);
	     	
			model.addAttribute("link","servicesInprogress.jsp");	
			return "ServiceManager/serviceManagerIndex";

		}
		else {
			List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
			model.addAttribute("bikeServicingList",bikeServicingList);

			long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
			model.addAttribute("inboxCount", inboxCount);
			
			List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
	     	model.addAttribute("shortInboxList", shortInboxList);
	     	
			model.addAttribute("link","servicesInprogress.jsp");	
			return "ServiceManager/serviceManagerIndex";

		}		
				
	}
	
	@RequestMapping(value="/addNewService")
	public String saveNewServices(@ModelAttribute AvailableServicing service, Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		serviceManagerInterface.saveAvailableServicingIDao(service);
		
		List<AvailableServicing> serviceList = serviceManagerInterface.getAllAvailableServicing();
		model.addAttribute("serviceList", serviceList);

		List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
		model.addAttribute("bikeServicingList",bikeServicingList);

		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
     	model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","availableServicing.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}
	

	@RequestMapping(value="/getAmountDetails",method=RequestMethod.GET)    
	public @ResponseBody List<ServicingInvoice> servicingInvoicesDetails(@RequestParam String serviceId,HttpServletResponse response) throws IOException {
		
		BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);

		return bike.getServicingInvoice();

	}
	
	
	
	
	
	
	
}
