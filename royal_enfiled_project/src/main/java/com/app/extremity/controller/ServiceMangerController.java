package com.app.extremity.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.http.HttpServlet;
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

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.Notfication;
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
		
	HttpSession session;
	
	
	
	
	@RequestMapping(value="/DashboardPage")
	public String ServicesDashboardPage(Model model, HttpServletRequest request){
		
		
		
		//test data for notification
		Notfication notify = new Notfication();
		
		notify.setReciverImg("person3.jpg");
		notify.setReciverName("Pranay Kohad");
		notify.setReciverPost("ServiceManager");
		
		notify.setMessage("where are you? I need your help");
		
		notify.setSenderName("Prashant Pardhi");
		notify.setSenderImg("person4.jpg");
		notify.setSenderPost("Admin");
		
		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
		
		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));
		
		//notificationInterface.saveNotfication(notify);
		
		session = request.getSession();

		//get service count
		model.addAttribute("approvedServiceCount", serviceManagerInterface.getAllServiceCountByServiceStatus("waiting"));
		model.addAttribute("inProgerssServices", serviceManagerInterface.getAllServiceCountByServiceStatus("in-progress"));
		model.addAttribute("completedservices", serviceManagerInterface.getAllServiceCountByServiceStatus("done"));
		model.addAttribute("totalServiceCount", serviceManagerInterface.getAllServiceCount());
		
		//get customization count
		model.addAttribute("approvedCustomizationCount", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("waiting"));
		model.addAttribute("inProgerssCustomization", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("in-progress"));
	    model.addAttribute("completedCustomization", serviceManagerInterface.getAllCustomizationCountByCustomizationStatus("done"));
	    model.addAttribute("totalCustomizationCount", serviceManagerInterface.getAllCustomizationCount());		   
	    
	    //get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
	    
		model.addAttribute("link","serviceManagerDashboard.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
  

	@RequestMapping(value="/ApprovedServicesPage")
	public String ApprovedServicesgPage(Model model, HttpServletRequest request){
		 
		session = request.getSession();
	
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		//get bike approved servicing list
		model.addAttribute("bikeServicingList", serviceManagerInterface.getAllBikeServicingByServcingStatus("waiting"));
     
		model.addAttribute("link","approvedServices.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	

	
	
	@RequestMapping(value="/ServicesInprogressPage")
	public String ServicesInprogressPage(@RequestParam(required = false) String serviceId, Model model,HttpServletRequest request){
		
		if(serviceId != null) {
			BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);
			bike.setServcingStatus("in-progress");
			serviceManagerInterface.saveBikeServicing(bike);
		}
				
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
			
		//get in-progress servicing list
		model.addAttribute("bikeServicingList", serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress"));
		
		model.addAttribute("link","servicesInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ApprovedCustomizationPage")
	public String ApprovedCustomizationPage(Model model,HttpServletRequest request){

		session = request.getSession();

		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));

		//get approved customization list
		model.addAttribute("bikeCustomizationsList", serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("waiting"));
		
		model.addAttribute("link","approvedCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";  
		
	}
	
	@RequestMapping(value="/CustomizationInprogressPage")
	public String CustomizationInprogressPage(@RequestParam(required = false) String customizationId, Model model,HttpServletRequest request){
		
		if(customizationId!=null) {
			BikeCustomization bike = serviceManagerInterface.getBikeCustomizationById(customizationId);
			bike.setCustomizationStatus("in-progress");
			serviceManagerInterface.saveBikeCustomization(bike);
		}
			
		session = request.getSession();

		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		//get in-progress customization list
		model.addAttribute("bikeCustomizationList", serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("in-progress"));
				
		
		model.addAttribute("link","customizationInprogress.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeServicesRecordsPage")
	public String BikeServicesRecordsPage(Model model,HttpServletRequest request){
		
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		//get bike servicing record list
	    model.addAttribute("bikeServicingList", serviceManagerInterface.getAllBikeServicing());
		
		model.addAttribute("link","bikeServicesRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/BikeCustomizationRecordsPage")
	public String BikeCustomizationRecordsPage(Model model,HttpServletRequest request){
		
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));

		//get bike customization record list
	    model.addAttribute("bikeCustomizationsList", serviceManagerInterface.getAllBikeCustomization());
	    
		model.addAttribute("link","bikeCustomizationRecords.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableServicesPage")
	public String AvailableServicesPagePage(Model model,HttpServletRequest request){

		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
			
		//get available servicing list
		model.addAttribute("serviceList", serviceManagerInterface.getAllAvailableServicing());
			
		model.addAttribute("link","availableServicing.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/AvailableCustomizationPage")
	public String AvailableCustomizationPage(Model model,HttpServletRequest request){
		
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		//get all available accessories list
		model.addAttribute("accessoriesStockList", serviceManagerInterface.getAllAccessoriesStock());
		
		model.addAttribute("link","availableCustomization.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
	
	@RequestMapping(value="/ServicesInvoicePage")
	public String ServicesInvoicePage(Model model,HttpServletRequest request){
		  
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
    	


    	List<BikeServicing> bikeServicingList = serviceManagerInterface.getAllBikeServicing();

    	for(BikeServicing data: bikeServicingList) {
    	ServicingInvoice servicingInvoicesList=data.getServicingInvoice();
    	System.out.println(""+servicingInvoicesList.getServicingInvoiceId()+","+servicingInvoicesList.getAmount()+"");
    	}
		//get servicing invoice list  	
    	model.addAttribute("bikeServicingList", serviceManagerInterface.getAllBikeServicing());

		model.addAttribute("link","servicesInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}
		
	@RequestMapping(value="/CustomizationInvoicePage")
	public String CustomizationInvoicePage(Model model,HttpServletRequest request){
	
		session = request.getSession();	

		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
	    
	    //get customization invoice list
		model.addAttribute("bikeCustomizationsList", serviceManagerInterface.getAllBikeCustomization());
		
		model.addAttribute("link","customizationInvoice.jsp");
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value="/MyNotificationsPage")
	public String MyNotificationsPage(Model model,HttpServletRequest request){
		
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
			
		//get current user name
		model.addAttribute("currentUserName", session.getAttribute("currentUserName").toString());
			
		//get outbox notification list
        model.addAttribute("outboxList", notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString()));
	
        //get inbox notification list
 	    model.addAttribute("inboxList", notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString()));   
 	    
		model.addAttribute("link","myNotifications.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}

	@RequestMapping(value="/markIt")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId){
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
			
		return "done";

	}
		
	@RequestMapping(value="/searchEmployee")    
	public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName, HttpServletResponse response) {
		
		if(adminService.getEmployeeDetailsByName(empName) != null) 
			return adminService.getEmployeeDetailsByName(empName);

		return null;

	}
	

	
	@RequestMapping(value="/sendNotification")    
	public @ResponseBody String sendNotification(@RequestParam String reciverName, @RequestParam String reciverPost,
												 @RequestParam String reciverImg, @RequestParam String message) {

		
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
		
		
		Notfication saveNotify = notificationInterface.saveNotfication(notify);
		
		if(saveNotify != null) {
			return "done";
		}
		
		return null;
		
	}
	

	@RequestMapping(value="/submitServicingWork") 
	public String submitServicingWork(@RequestParam(required = false) int workStatusChange[], Model model, 
									 HttpServletRequest request) {
	
		session = request.getSession();
		
		if(workStatusChange != null) {
			for(int i : workStatusChange) {
				ServicingChart chart = serviceManagerInterface.getServicingChart(i);
				ServicingChart newChart = new ServicingChart();
				
				newChart.setServicingChartId(i);
				newChart.setStatus("done");
				newChart.setCost(chart.getCost());
				newChart.setWork(chart.getWork());
				serviceManagerInterface.updateServicingChart(newChart);
			}
			

			updateServicePercent();			

		}

		//get in-progress servicing list
		model.addAttribute("bikeServicingList", serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress"));

		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
	     	
		model.addAttribute("link","servicesInprogress.jsp");	
		return "ServiceManager/serviceManagerIndex";		
			
	}

	private void updateServicePercent() {
		int totalCount = 0;
		int doneCount = 0;
		
		List<BikeServicing>bikeServicingList = serviceManagerInterface.getAllBikeServicingByServcingStatus("in-progress");
		
		for(BikeServicing service : bikeServicingList) {		
			List<ServicingChart> chartList = service.getServicingChart();
			
			for(ServicingChart work : chartList) {				
				totalCount++;
				
				if(work.getStatus().equals("done"))
					doneCount++;
			
			}
			service.setServiceProgressPercent((doneCount*100)/totalCount);
			
			if(service.getServiceProgressPercent()==100) {
				service.setServcingStatus("done");
				updateServiceCount(service.getServcingBikeInfo().getChasisNumber());
			}
			
			serviceManagerInterface.saveBikeServicing(service);
		}
		
	}
	
	private void updateServiceCount(String chassisNumber) {
		
		FreeServicingCount bike = serviceManagerInterface.getFreeServicingCountByChassisNumber(chassisNumber);
		int cnt = bike.getFreeServicingCount();
		
		if(cnt<3) {
			bike.setFreeServicingCount(++cnt);
			serviceManagerInterface.updateFreeServicingCount(bike);
		}
		
	}

	@RequestMapping(value="/submitCustomizationWork") 
	public String submitCustomizationWork(@RequestParam(required = false) int workStatusChange[], Model model, 
										  HttpServletRequest request) {
		
		session = request.getSession();
		
		if(workStatusChange != null) {
			for(int i : workStatusChange) {
				CustomizationChart chart = serviceManagerInterface.getCustomizationChart(i);
				CustomizationChart newChart = new CustomizationChart();
				
				newChart.setCustomizationChartId(i);
				newChart.setStatus("done");
				newChart.setCost(chart.getCost());
				newChart.setPart(chart.getPart());
				
				serviceManagerInterface.updateCustomizationChart(newChart);
			}
			
			updateCustomizationPercent();
								
            //get in-progress customization list
			model.addAttribute("bikeCustomizationList", serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("in-progress"));

			//get short notification list
			model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
			model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
	     	
			model.addAttribute("link","customizationInprogress.jsp");	
			return "ServiceManager/serviceManagerIndex";

		}
		else {
			List<BikeCustomization>bikeCustomizationList = serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("in-progress");
			model.addAttribute("bikeCustomizationList",bikeCustomizationList);

			long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
			model.addAttribute("inboxCount", inboxCount);
			
			List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
	     	model.addAttribute("shortInboxList", shortInboxList);
	     	
			model.addAttribute("link","customizationInprogress.jsp");	  
			return "ServiceManager/serviceManagerIndex";

		}		
				
	}
	
	private void updateCustomizationPercent() {
		
		int totalCount = 0;
		int doneCount = 0;
		
		List<BikeCustomization> bikeCustomizationList = serviceManagerInterface.getAllBikeCustomizationByCustomizationStatus("in-progress");
		
		for(BikeCustomization cust : bikeCustomizationList) {		
			List<CustomizationChart> chartList = cust.getCustomizationChart();
			
			for(CustomizationChart work : chartList) {			
				totalCount++;
				
				if(work.getStatus().equals("done"))
					doneCount++;
				
			}
			cust.setCustomizationProgressPercent((doneCount*100)/totalCount);
			
			if(cust.getCustomizationProgressPercent()==100) {
				cust.setCustomizationStatus("done");
			}
			
			serviceManagerInterface.saveBikeCustomization(cust);
		}

		
	}
	
	@RequestMapping(value="/addNewService")
	public String addNewService(@ModelAttribute AvailableServicing service, Model model, HttpServletRequest request) {
		
		session = request.getSession();
		
		serviceManagerInterface.saveAvailableServicingIDao(service);
		
		//get servicing list
		model.addAttribute("serviceList", serviceManagerInterface.getAllAvailableServicing());

		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		model.addAttribute("link","availableServicing.jsp");	
		return "ServiceManager/serviceManagerIndex";
	}
	



	@RequestMapping(value="/getServiceDetails",method=RequestMethod.GET)    
	public @ResponseBody List<ServicingChart> getServiceDetails(@RequestParam String serviceId, HttpServletResponse response) {
	
		BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);
		return bike.getServicingChart();
	}
		
	@RequestMapping(value="/getCustomizationDetails",method=RequestMethod.GET)    
	public @ResponseBody List<CustomizationChart> getCustomizationDetails(@RequestParam String custId, HttpServletResponse response) {

		BikeCustomization bike = serviceManagerInterface.getBikeCustomizationById(custId);
		return bike.getCustomizationChart();
	}
	
	@RequestMapping(value="/releaseCustomizedBike")
	public @ResponseBody String releaseCustomizedBike(@RequestParam String custId, Model model, HttpServletRequest request) {
		
		BikeCustomization bike = serviceManagerInterface.getBikeCustomizationById(custId);
		bike.setBikeReleaseStatus("released");
		serviceManagerInterface.saveBikeCustomization(bike);
		
		return "done";  
	}
	
	@RequestMapping(value="/releaseServicingBike")
	public @ResponseBody String releaseServicingBike(@RequestParam String serviceId, Model model, HttpServletRequest request) {
		
		BikeServicing bike = serviceManagerInterface.getBikeServicingById(serviceId);
		bike.setBikeReleaseStatus("released");
		serviceManagerInterface.saveBikeServicing(bike);
		
		return "done";
	}
	
	
}
