package com.app.extremity.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;

/* 
 * This controller helps to navigate in service manager index.jsp
 * and handle all request-response made by service manager
 *  */

@Controller
public class ServiceMangerController {

	static Logger logger = LogManager.getLogger(ServiceMangerController.class);

	@RequestMapping(value = "/DashboardPage")
	public String ServicesDashboardPage(Model model) {

		/*
		 * ServcingBikeInfo bi=new ServcingBikeInfo();
		 * 
		 * BikeServicing bs=new BikeServicing(); bs.setBikeServicingId("BS001");
		 * bs.setBikeReleaseStatus("waiting");
		 * bs.setAppointmentDate("02/08/2018");
		 * bs.setBikeReleaseStatus("on-hold"); bs.setServcingBikeInfo(bi);
		 * 
		 * //List<ServicingChart> sc = new ArrayList();
		 */

		logger.info("dashboard hits........... log");
		model.addAttribute("link", "serviceManagerDashboard.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/ApprovedServicesPage")
	public String ApprovedServicesgPage(Model model) {

		System.out.println("approved service htis..................");
		model.addAttribute("link", "approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/ServicesInprogressPage")
	public String ServicesInprogressPage(Model model) {

		model.addAttribute("link", "servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/ApprovedCustomizationPage")
	public String ApprovedCustomizationPage(Model model) {

		model.addAttribute("link", "approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/CustomizationInprogressPage")
	public String CustomizationInprogressPage(Model model) {

		model.addAttribute("link", "customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/BikeServicesRecordsPage")
	public String BikeServicesRecordsPage(Model model) {

		model.addAttribute("link", "bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/BikeCustomizationRecordsPage")
	public String BikeCustomizationRecordsPage(Model model) {

		model.addAttribute("link", "bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/AvailableServicesPage")
	public String AvailableServicesPagePage(Model model) {

		model.addAttribute("link", "availableServicing.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/AvailableCustomizationPage")
	public String AvailableCustomizationPage(Model model) {

		model.addAttribute("link", "availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/ServicesInvoicePage")
	public String ServicesInvoicePage(Model model) {

		model.addAttribute("link", "servicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/CustomizationInvoicePage")
	public String CustomizationInvoicePage(Model model) {

		model.addAttribute("link", "customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value = "/MyNotificationsPage")
	public String MyNotificationsPage(Model model) {

		model.addAttribute("link", "MyNotifications.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

}
