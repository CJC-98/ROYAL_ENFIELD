package com.app.extremity.controller;



import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesStock;

import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationInvoice;

import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.SoldAccessories;
import com.app.extremity.model.SoldBikeStock;

import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.TestDriveCustomer;
import com.google.gson.Gson;

@Controller
public class AdminController {

	@Autowired
	IAdminService adminService;
	@Autowired
	NotificationInterface notificationInterface;

	HttpSession session;


	/*
	 * this method is for showing admin home page
	 * 
	 */

	@RequestMapping(value = "/toAdminHomePage")
	public String toadminDashboard(Model model) {
		model.addAttribute("accessoriesCount", adminService.getAccessoriesCount());
		model.addAttribute("bikeCount", adminService.getBikeSaleForUserCount());
		model.addAttribute("registrionCount", adminService.getRegistrationCount());
		model.addAttribute("userCount", adminService.getUserOrDealerCount("USER"));
		model.addAttribute("dealerCount", adminService.getUserOrDealerCount("DEALER"));
		model.addAttribute("feedbackList", adminService.getFeedbackList());
		
		model.addAttribute("link", "adminDashboard.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/composeMail")
	public String toComposeMailPage(Model model, @RequestParam int designation) {
		model.addAttribute("designationId", designation);
		model.addAttribute("link", "composeMail.jsp");

		System.out.println(designation);
		return "Admin/adminIndex";
	}
	/*
	 * this method is used to send Email to employee With Registration Link
	 * 
	 * author: Nilesh Tammewar
	 */
	@PostMapping("/sendEmail")
	public String sendEmail(@ModelAttribute EmailMessage emailmessage, @RequestParam("attachment") MultipartFile file,
			Model model,@RequestParam String designation) {
		adminService.sendEmail(emailmessage, file,designation);
		model.addAttribute("link", "adminDashboard.jsp");
		return "Admin/adminIndex";
	}

	/*
	 * this method is used for Employee Registration Page
	 * 
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/employeeRegistration")

	public String toEmployeeRegistrationPage(@RequestParam int designation, Model model) {
		System.out.println(designation);
		model.addAttribute("designation", designation);
		return "Admin/employeeRegistration";
	}
	
	
//	verify Email..... Dipali...
	
	@RequestMapping(value ="/log" , produces = "application/json")
	public @ResponseBody String verifyEmail(@RequestParam String email,HttpServletResponse response)
	{
		System.out.println("verify Email");
		int checkEmail= adminService.getEmployeeEmail(email);
		String json = new Gson().toJson(checkEmail);
		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		try {
			response.getOutputStream();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;
		 
		
		
	}

	/*
	 * this method is used to save Employee Details
	 * 
	 * 
	 * author: Nilesh Tammewar
	 */

	@PostMapping("/saveEmployee")
	public String createEmployee(@ModelAttribute EmployeeDetails employeeDetails,
			@RequestParam("profilePic") MultipartFile profilePic, Model model) {

		adminService.saveEmployee(employeeDetails, profilePic);
		return "login";

	}

	/*
	 * this method is used to newBikeStockList Details
	 * 
	 * author: omprakash nagolkar
	 */
	@RequestMapping(value = "/newBikeStock")
	public String getNewBikeStock(Model model,HttpServletRequest request) {
		
		session = request.getSession();
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		List<NewBikeStock> newBikeStockList = adminService.getNewBikeStock();

		model.addAttribute("newBikeStockList", newBikeStockList);
		model.addAttribute("link", "newBikeStock.jsp");
		return "Admin/adminIndex";

	}

	

	@RequestMapping(value ="/oldBikeStock")
	public String getOldBikeStock(Model model)
	{
		List<OldBikeStock> oldBikeStockList = adminService.getOldBikeStock();
		model.addAttribute("oldBikeStockList", oldBikeStockList);
		model.addAttribute("link", "oldBikeStock.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/deadBikeStock")
	public String getDeadStock(Model model) {

		List<DeadStock> deadStockList = adminService.getDeadStock();

		model.addAttribute("deadStockList", deadStockList);
		model.addAttribute("link", "deadBikeStock.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/accessoriesStock")
	public String getAccessoriesStock(Model model) {
		List<AccessoriesStock> accessoriesStockList = adminService.getAccessoriesStock();
		model.addAttribute("accessoriesStockList", accessoriesStockList);
		model.addAttribute("link", "accessoriesStock.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/accessoriesDeadStock")
	public String getAccessoriesDeadStock(Model model) {
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		List<AccessoriesDeadStock> accessoriesDeadStockList = adminService.getAccessoriesDeadStock();
		model.addAttribute("accessoriesDeadStockList", accessoriesDeadStockList);
		System.out.println(accessoriesDeadStockList);
		model.addAttribute("link", "accessoriesDeadStock.jsp");
		return "Admin/adminIndex";
	}

	

	@RequestMapping(value = "/employeeList")
	public String getEmployeeListByDesignation(@RequestParam(name = "designation") String employeeDesignation,
			Model model) {
		List<EmployeeDetails> employeeList = adminService.getEmployeeListByDesignation(employeeDesignation);

		model.addAttribute("employeeList", employeeList);
		model.addAttribute("link", "employeeList.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/bikeOffer")

	public String getbikeOffer(Model model, HttpServletRequest request ) {
		session = request.getSession();
		//get short notification list
		//System.out.println(session.getAttribute("currentUserName").toString());
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		List<BikeOffer> bikeOfferList = adminService.getBikeOffer();
		model.addAttribute("bikeOfferList", bikeOfferList);
		model.addAttribute("link", "bikeOffer.jsp");
		return "Admin/adminIndex";

	}

	/* this method is use for getCustomizationInvoice details */
	@RequestMapping(value = "/servicingAndCustomizationInvoice")
	public String getCustomizationInvoice(Model model,HttpServletRequest request)
	{
		session = request.getSession();
		
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		List<CustomizationInvoice> customizationInvoiceList = adminService.getCustomizationInvoice();
		model.addAttribute("customizationInvoiceList", customizationInvoiceList);
		model.addAttribute("link", "servicingAndCustomizationInvoice.jsp");
		return "Admin/adminIndex";

	}

	/* this method is use for getServcingBikeInfo details */

	@RequestMapping(value = "/servicingBikeInfo")
	public String getServcingBikeInfo(Model model, HttpServletRequest request) 
	{
		session=request.getSession();
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		List<ServcingBikeInfo> servcingBikeInfoList = adminService.getServcingBikeInfo();
		model.addAttribute("servcingBikeInfoList", servcingBikeInfoList);
		model.addAttribute("link", "servicingBikeInfo.jsp");
		return "Admin/adminIndex";

	}

	/* this method is use for getTestDriveCustomer details */
	@RequestMapping(value = "/testDriveCustomer")
	public String getTestDriveCustomer(Model model, HttpServletRequest request) {
		
	
	session = request.getSession();
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		List<TestDriveCustomer> testDriveCustomerList = adminService.getTestDriveCustomer();
		model.addAttribute("testDriveCustomerList", testDriveCustomerList);
		model.addAttribute("link", "testDriveCustomer.jsp");
		return "Admin/adminIndex";

	}
//	@RequestMapping(value="/servicingBikeInfo")
  public String getNewBikeSaleByDate(Model model, HttpServletRequest request)
  {
	  
	  session = request.getSession();
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		LocalDate now = LocalDate.now();
		 System.out.println("Current Date="+now);
	      
		 Date date=new Date();
		   System.out.println(date);
			List<SoldBikeStock> soldBikeStockList=adminService.getNewBikeSaleByDate(date);
			System.out.println("  Sold Bike is.. "+soldBikeStockList);
			model.addAttribute("soldBikeList", soldBikeStockList);
		    model.addAttribute("link", "soldNewBike.jsp");
		 
        return "Admin/adminIndex";
	  
  }
	
  
	@RequestMapping(value = "/soldNewBike")
	public String getSoldNewBikeInfo(Model model) 
	{
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		
		List<SoldBikeStock> soldNewBikeInfoList = adminService.getSoldNewBike();
		model.addAttribute("soldNewBikeInfoList", soldNewBikeInfoList);
		model.addAttribute("link", "soldNewBike.jsp");
		return "Admin/adminIndex";



	}
	
	@RequestMapping(value = "/avaliableServicing")
	public String getAvaliableServicingInfo(Model model, HttpServletRequest request)
	{
		//get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		
		List<AvailableServicing> avaliableServicingInfoList = adminService.getAvaliableServicing();
        model.addAttribute("avaliableServicingInfoList", avaliableServicingInfoList);
	    model.addAttribute("link", "avaliableServicing.jsp");
		
		
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/bikeCustomization")
	public String getBikeCustomizationInfo(Model model) {
		List<BikeCustomization> bikeCustomizationInfoList = adminService.getbikeCustomization();
		model.addAttribute("bikeCustomizationInfoList", bikeCustomizationInfoList);
		model.addAttribute("link", "bikeCustomization.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/bikeServicing")
	public String getBikeServicingInfo(Model model) {
		List<BikeServicing> bikeServicingInfoList = adminService.getBikeServicing();
		model.addAttribute("bikeServicingInfoList", bikeServicingInfoList);
		model.addAttribute("link", "bikeServicing.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/updateEmployee")
	public String getUpdateEmployeeInfo(@ModelAttribute EmployeeDetails employee, Model model) {
		adminService.updateEmployee(employee);
		List<EmployeeDetails> employeeList = adminService.getEmployeeListByDesignation(employee.getEmployeeDesignation());
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("link", "employeeList.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/soldAccessories")
	public String getSoldAccessories(Model model) {
		List<SoldAccessories> SoldAccessoriesList = adminService.getSoldAccessories();
		model.addAttribute("SoldAccessoriesList", SoldAccessoriesList);
		model.addAttribute("link", "soldAccessories.jsp");
		return "Admin/adminIndex";

	}
	
	@RequestMapping(value="/sendAdminNotification")    
	public @ResponseBody String sendNotification(@RequestParam String reciverName, @RequestParam String reciverPost,
												 @RequestParam String reciverImg, @RequestParam String message, HttpServletRequest request) {
        
		session=request.getSession();
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
	
	
	@RequestMapping(value="/adminDashboard")
	public String adminDashboardPage(Model model){


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
		 
	    //get short notification list
		model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
	    
		model.addAttribute("link","adminDashboard.jsp");
	
		return "Admin/adminIndex";
	}
	
	
	@RequestMapping(value="/myNotifications")
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
		return "Admin/adminIndex";
	}

   @RequestMapping(value="/soldOldBike")
   public String getSoldOldBikeStock(Model model)
   {
	   List<SoldOldBikeStock> soldOldBikeStockList=adminService.getSoldOldBikeStock();
	    model.addAttribute("soldOldBikeStockList", soldOldBikeStockList);
		model.addAttribute("link", "soldOldBike.jsp");
		return "Admin/adminIndex";
   }	
   
   @RequestMapping("/adminLogout")
   public String logout(HttpServletRequest request) {
	   session=request.getSession();
	   session.invalidate();
	   return "login";
   }
  
}
