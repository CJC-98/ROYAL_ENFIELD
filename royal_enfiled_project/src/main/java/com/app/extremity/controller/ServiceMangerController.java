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
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
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
	

        //ascount => aproved service count
		long sscount=serviceManagerInterface.getAllServiceCountByServiceStatus("waiting");
		System.out.println("Approved services are:"+sscount);
		model.addAttribute("approvedServiceCount",sscount);
		
		//ts => total service count
	    long tscount=serviceManagerInterface.getAllServiceCount();
		System.out.println("Total Services are:"+tscount);
		model.addAttribute("totalServiceCount", tscount);
		
		//ipcount => in progress count
		long ipcount=serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress");
		System.out.println("In progerss services are:"+ipcount);
		model.addAttribute("inProgerssServices", ipcount);
		

		//cscount => completed service count
		long cscount=serviceManagerInterface.getAllServiceCountByServiceStatus("done");
        System.out.println("Completed services are:"+cscount);
		model.addAttribute("completedservices", cscount);
				
		/*long a=ascount;
		long b=tscount;
		long asresult= (a* 100)/b;
		System.out.println(asresult);
		model.addAttribute("aspercentage", asresult);
		
		long c=ipcount;
		long ipresult=(c*100)/b;
		System.out.println(ipresult);
		model.addAttribute("ippercentage", ipresult);
		
		long d=cscount;
		long csresult=(d*100)/b;
		System.out.println(csresult);
		model.addAttribute("cspercentage", csresult);
	
*/
		
/* // First Record
		
		ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("AJD7945954");
		sbi.setPlateNumber("MH-14-HF-7456");
		
		ServicingInvoice si = new ServicingInvoice();
		si.setAmount(8500);
		si.setServiceCGstPercent(4);
		si.setServiceSGstPercent(4);
		si.setTotalAmount(11500);
		 
		ServicingChart sc1 = new ServicingChart();
		sc1.setWork("engine change");
		sc1.setCost(150);
		   
		ServicingChart sc2 = new ServicingChart();
		sc2.setWork("brake change");
		sc2.setCost(1500);
		
		ServicingChart sc3 = new ServicingChart();
		sc3.setWork("brake oil change");
		sc3.setCost(2000);
		
		ServicingChart sc4 = new ServicingChart();
		sc4.setWork("engine tuning");
		sc4.setCost(4500);
		
	
		
		BikeServicing bs1 = new BikeServicing();
		
		bs1.setAppointmentDate(02-18-2018);
		bs1.setServcingBikeInfo(sbi);
		
		bs1.getServicingChart().add(sc1);
		bs1.getServicingChart().add(sc2);
		bs1.getServicingChart().add(sc3);
		bs1.getServicingChart().add(sc4);	
		
		
		sc1.setBikeServicing(bs1);
		sc2.setBikeServicing(bs1);
		sc3.setBikeServicing(bs1);
		sc4.setBikeServicing(bs1);
		
		bs1.setServicingInvoice(si);
		
		String nextServiceId = serviceManagerInterface.getNextBikeServicingId();
		
		bs1.setBikeServicingId(nextServiceId);
		
		serviceManagerInterface.saveBikeServicing(bs1);
		
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
