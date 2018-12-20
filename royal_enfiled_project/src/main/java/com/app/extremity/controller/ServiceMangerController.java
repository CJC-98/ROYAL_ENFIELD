package com.app.extremity.controller;


import java.io.IOException;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.ArrayList;
import java.io.IOException;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.ServicingChartIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationBikeInfo;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.CustomizationInvoice;
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
	

	static Logger logger = LogManager.getLogger(ServiceMangerController.class);
	
	@Autowired
	ServiceManagerInterface serviceManagerInterface;

	@Autowired
	NotificationInterface notificationInterface;
	
	@Autowired
	IAdminService adminService;
	
	@Autowired
	ServicingChartIDao servicingChartIDao;
	
	
	HttpSession session;
	
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model,HttpServletRequest request){
		
		
		
		//test data for customization
		
		CustomizationBikeInfo info = new CustomizationBikeInfo();
		info.setChasisNumber("7541464");
		info.setModelName("bajaj pulsur");
		info.setPlateNumber("MH-14-RE-5979");
		

		
		CustomizationChart part4 = new CustomizationChart();
		part4.setPart("labout cost");
		part4.setCost(500);
		
		CustomizationChart part5 = new CustomizationChart();
		part5.setPart("handle");
		part5.setCost(250);
		
		CustomizationChart part1 = new CustomizationChart();
		part1.setPart("egine change");
		part1.setCost(25000);
		
		CustomizationInvoice invoice = new CustomizationInvoice();
		invoice.setAmount(35000);
		invoice.setCustomizationCGstPercent(4);
		invoice.setCustomizationSGstPercent(4);
		invoice.setTotalAmount(45000);
		
		BikeCustomization cust = new BikeCustomization();
		cust.setBikeCustomizationId(serviceManagerInterface.getNextBikeCustomizationId());
		cust.setAppointmentDate("13-1-2018");
		cust.setCustomizationBikeInfo(info);
		cust.getCustomizationChart().add(part4);
		cust.getCustomizationChart().add(part5);
		cust.getCustomizationChart().add(part1);
		cust.setCustomizationInvoice(invoice);
		
		//BikeCustomization c = serviceManagerInterface.saveBikeCustomization(cust);
		//System.out.println("data saved........."+c.getBikeCustomizationId());
		
		session = request.getSession();

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
		model.addAttribute("bikeServicingList", bikeServicingList);
     

		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(@RequestParam(required = false) String serviceId, Model model,HttpServletRequest request){
		
		if(serviceId!=null) {
			BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);
			bike.setServcingStatus("in-progress");
			serviceManagerInterface.saveBikeServicing(bike);
		}
		
		
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

		List<BikeCustomization> bikeCustomizationsList = serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("waiting");	
		model.addAttribute("bikeCustomizationsList",bikeCustomizationsList);
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";  
		
	}
	
	@RequestMapping(value="/CustomizationInprogressPage")
	public String CustomizationInprogressPage(@RequestParam(required = false) String customizationId, Model model,HttpServletRequest request){
		
		
		System.out.println(customizationId);
		if(customizationId!=null) {
			BikeCustomization bike = serviceManagerInterface.getBikeCustomizationById(customizationId);
			bike.setCustomizationStatus("in-progress");
			serviceManagerInterface.saveBikeCustomization(bike);
		}
			
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
				ServicingChart chart = servicingChartIDao.findById(i);
				ServicingChart newChart = new ServicingChart();
				
				newChart.setServicingChartId(i);
				newChart.setStatus("done");
				newChart.setCost(chart.getCost());
				newChart.setWork(chart.getWork());
				
				servicingChartIDao.save(newChart);
			}
			
			updateServicePercent();
						
			
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
	
	private void updateServicePercent() {
		
		int totalCount = 0;
		int doneCount = 0;
		
		List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
		
		for(BikeServicing service : bikeServicingList) {
			
			List<ServicingChart> chartList = service.getServicingChart();
			
			for(ServicingChart work : chartList) {
				
				totalCount++;
				
				if(work.getStatus().equals("done")) {
					doneCount++;
				}
			}
			service.setServiceProgressPercent((doneCount*100)/totalCount);
			
			if(service.getServiceProgressPercent()==100) {
				service.setServcingStatus("done");
			}
			
			serviceManagerInterface.saveBikeServicing(service);
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
	
	@RequestMapping(value="/getServiceDetails",method=RequestMethod.GET)    
	public @ResponseBody List<ServicingChart> getServiceDetails(@RequestParam String serviceId,HttpServletResponse response) throws IOException {
		
		BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);

		return bike.getServicingChart();
	}
	
	@RequestMapping(value="/getCustomizationDetails",method=RequestMethod.GET)    
	public @ResponseBody List<CustomizationChart> getCustomizationDetails(@RequestParam String customizationId,HttpServletResponse response) throws IOException {
		
		BikeCustomization bike = serviceManagerInterface.getBikeCustomizationById(customizationId);

		return bike.getCustomizationChart();
	}
	
	
	
	
	
	
	
}
