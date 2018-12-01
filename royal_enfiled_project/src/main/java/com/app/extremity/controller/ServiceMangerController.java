package com.app.extremity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
  
/* 
 * This controller helps to navigate in service manager index.jsp
 * and handle all request-response made by service manager
 *  */


@Controller
public class ServiceMangerController {
	
	@RequestMapping(value="/goToServicesDashboardPage")
	public String goToServicesDashboardPage(Model model){
		
		model.addAttribute("link","serviceManagerDashboard.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value="/goToApprovedServicesPage")
	public String goToApprovedServicesgPage(Model model){
		
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToServicesInprogressPage")
	public String goToServicesInprogressPage(Model model){
		
		model.addAttribute("link","servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToApprovedCustomizationPage")
	public String goToApprovedCustomizationPage(Model model){
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToCustomizationInprogressPage")
	public String goToCustomizationInprogressPage(Model model){
		
		model.addAttribute("link","customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToBikeServicesRecordsPage")
	public String goToBikeServicesRecordsPage(Model model){
		
		model.addAttribute("link","bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToBikeCustomizationRecordsPage")
	public String goToBikeCustomizationRecordsPage(Model model){
		
		model.addAttribute("link","bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToAvailableCustomizationPage")
	public String goToAvailableCustomizationPage(Model model){
		
		model.addAttribute("link","availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToServicesInvoicePage")
	public String goToServicesInvoicePage(Model model){
		
		model.addAttribute("link","ServicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToCustomizationInvoicePage")
	public String goToCustomizationInvoicePage(Model model){
		
		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/goToMyNotificationsPage")
	public String goToMyNotificationsPage(Model model){
		
		model.addAttribute("link","MyNotifications.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
}
