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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;

import com.app.extremity.model.CustomizationBikeInfo;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.CustomizationInvoice;

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
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model){


	
	//account => approved customization count
			long account=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Waiting");
			System.out.println("Approved Customization are:"+account);
			model.addAttribute("approvedCustomizationCount",account);
			
			//tc => total customization count
		    long tccount=serviceManagerInterface.getAllCustomizationCount();
			System.out.println("Total Customization are:"+tccount);
			model.addAttribute("totalCustomizationCount",tccount);
			
			//ipcount => in progress count
			long ipcount=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("In Progress");
			System.out.println("In progerss Customization are:"+ipcount);
			model.addAttribute("inProgerssCustomization", ipcount);
			
			//cccount => completed customization count
			long cccount=serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("Waiting");
			System.out.println("Completed Customization are:"+cccount);
			model.addAttribute("completedCustomization", cccount);
					
	
		
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
	
		
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(Model model){
		
		model.addAttribute("link","servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ApprovedCustomizationPage")
	public String ApprovedCustomizationPage(Model model){
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";  
	}
	
	@RequestMapping(value="/CustomizationInprogressPage")
	public String CustomizationInprogressPage(Model model){
		
		model.addAttribute("link","customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeServicesRecordsPage")
	public String BikeServicesRecordsPage(Model model){
		
		model.addAttribute("link","bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeCustomizationRecordsPage")
	public String BikeCustomizationRecordsPage(Model model){
		
		model.addAttribute("link","bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableServicesPage")
	public String AvailableServicesPagePage(Model model){
		
		model.addAttribute("link","availableServicing.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableCustomizationPage")
	public String AvailableCustomizationPage(Model model){
		
		model.addAttribute("link","availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInvoicePage")
	public String ServicesInvoicePage(Model model){
		
		model.addAttribute("link","servicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/CustomizationInvoicePage")
	public String CustomizationInvoicePage(Model model){

		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model){
		
		System.out.println("go to notification page...............");
		

		//notificationInterface.saveNotfication(null);  
		
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay kohad");
		model.addAttribute("outboxList",outboxList);
		
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay kohad");
		model.addAttribute("inboxList",inboxList);   

	
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/searchEmployee")    
	public @ResponseBody String serachEmployee(@RequestParam String empName,HttpServletResponse response,Model model) throws IOException {
		System.out.println("in employee controller");
		
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";		
	}
	
	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam String notficationId,Model model)throws IOException {
		System.out.println("in markit controller and list is update "+notficationId);
		
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("pranay kohad");
		model.addAttribute("outboxList",outboxList);  
		
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("pranay kohad");
		model.addAttribute("inboxList",inboxList);   
	
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";		

	}
	
	
}
