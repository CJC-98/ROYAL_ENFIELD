package com.app.extremity.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
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
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model){
		 
		 // First Record
		
		/*  ServcingBikeInfo sbi = new ServcingBikeInfo();
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
		
		bs1.setAppointmentDate("02/18/2018");
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
		
		
		
		
		//  Second Record
		/*
		  ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("XZD5215954");
		sbi.setPlateNumber("MH-15-KN-3256");
		
		ServicingInvoice si = new ServicingInvoice();
		si.setAmount(8500);
		si.setServiceCGstPercent(4);
		si.setServiceSGstPercent(4);
		si.setTotalAmount(11500);
		 
		ServicingChart sc1 = new ServicingChart();
		sc1.setWork("brake change");
		sc1.setCost(1500);
		   
		ServicingChart sc2 = new ServicingChart();
		sc2.setWork("engine change");
		sc2.setCost(150);
		
		ServicingChart sc3 = new ServicingChart();
		sc3.setWork("engine tuning");
		sc3.setCost(4500);
		
		ServicingChart sc4 = new ServicingChart();
		sc4.setWork("brake oil change");
		sc4.setCost(2000);
		
	
		
		BikeServicing bs1 = new BikeServicing();
		
		bs1.setAppointmentDate("22/11/2018");
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
		
		//Third Record
		
		 /* ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("WED5125954");
		sbi.setPlateNumber("MH-24-LK-7821");
		
		ServicingInvoice si = new ServicingInvoice();
		si.setAmount(9000);
		si.setServiceCGstPercent(4);
		si.setServiceSGstPercent(4);
		si.setTotalAmount(9720);
		 
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
		
		bs1.setAppointmentDate("16/11/2018");
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
		
		//Fourth Record
		
		 /*
		  ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("VFG4575962");
		sbi.setPlateNumber("MH-02-BG-8656");
		
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
		
		
	
		
		BikeServicing bs1 = new BikeServicing();
		
		bs1.setAppointmentDate("16/11/2018");
		bs1.setServcingBikeInfo(sbi);
		
		bs1.getServicingChart().add(sc1);
		bs1.getServicingChart().add(sc2);
		bs1.getServicingChart().add(sc3);
			
		
		
		sc1.setBikeServicing(bs1);
		sc2.setBikeServicing(bs1);
		sc3.setBikeServicing(bs1);
	
		
		bs1.setServicingInvoice(si);
		
		String nextServiceId = serviceManagerInterface.getNextBikeServicingId();
		
		bs1.setBikeServicingId(nextServiceId);
		
		serviceManagerInterface.saveBikeServicing(bs1);
		
		*/
		
		//Fifth Record
		 
		 /*
		  ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("KLM5215530");
		sbi.setPlateNumber("MH-12-MJ-0256");
		
		ServicingInvoice si = new ServicingInvoice();
		si.setAmount(8000);
		si.setServiceCGstPercent(4);
		si.setServiceSGstPercent(4);
		si.setTotalAmount(8640);
		 
		ServicingChart sc1 = new ServicingChart();
		sc1.setWork("engine change");
		sc1.setCost(150);
		   
		ServicingChart sc2 = new ServicingChart();
		sc2.setWork("brake change");
		sc2.setCost(1500);
	
		
		ServicingChart sc3 = new ServicingChart();
		sc3.setWork("engine tuning");
		sc3.setCost(4500);
		
	
		
		BikeServicing bs1 = new BikeServicing();
		
		bs1.setAppointmentDate("27/12/2018");
		bs1.setServcingBikeInfo(sbi);
		
		bs1.getServicingChart().add(sc1);
		bs1.getServicingChart().add(sc2);
		bs1.getServicingChart().add(sc3);
		
		
		
		sc1.setBikeServicing(bs1);
		sc2.setBikeServicing(bs1);
		sc3.setBikeServicing(bs1);
		
		
		bs1.setServicingInvoice(si);
		
		String nextServiceId = serviceManagerInterface.getNextBikeServicingId();
		
		bs1.setBikeServicingId(nextServiceId);
		
		serviceManagerInterface.saveBikeServicing(bs1);
		
		*/
		
		//Sixth Record
		
		 /*
		  ServcingBikeInfo sbi = new ServcingBikeInfo();
		sbi.setChasisNumber("XZD5215954");
		sbi.setPlateNumber("MH-29-ON-6056");
		
		ServicingInvoice si = new ServicingInvoice();
		si.setAmount(9500);
		si.setServiceCGstPercent(4);
		si.setServiceSGstPercent(4);
		si.setTotalAmount(10240);
		 
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
		sc4.setWork("bike painting");
		sc4.setCost(840);
		
		ServicingChart sc5 = new ServicingChart();
		sc5.setWork("engine tuning");
		sc5.setCost(4500);
		
	
		
		BikeServicing bs1 = new BikeServicing();
		
		bs1.setAppointmentDate("16/11/2018");
		bs1.setServcingBikeInfo(sbi);
		
		bs1.getServicingChart().add(sc1);
		bs1.getServicingChart().add(sc2);
		bs1.getServicingChart().add(sc3);
		bs1.getServicingChart().add(sc4);
		bs1.getServicingChart().add(sc5);		
		
		
		sc1.setBikeServicing(bs1);
		sc2.setBikeServicing(bs1);
		sc3.setBikeServicing(bs1);
		sc4.setBikeServicing(bs1);
		sc5.setBikeServicing(bs1);
		
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

		
	
		Color c1 = new Color();
		c1.setColorId("C1");
		c1.setColorName("green");
		
		Color c2 = new Color();
		c2.setColorId("C2");
		c2.setColorName("red");
		
		Color c3 = new Color();
		c3.setColorId("c3");
		c3.setColorName("black");
		
		Color c4 = new Color();
		c4.setColorId("C4");
		c4.setColorName("blue");
		
		List<String> colors = new ArrayList();  
		colors.add("A");
		colors.add("B");
		colors.add("C");
		colors.add("D");
		

		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model){
		
		System.out.println("go to notification page...............");
		model.addAttribute("link","myNotifications.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	
	
	
	
}
