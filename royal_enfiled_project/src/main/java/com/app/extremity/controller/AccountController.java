package com.app.extremity.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.app.extremity.idao.AccountGetCartIDao;
import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.Demo;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Login;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;


@Controller
public class AccountController {

	@Autowired
	NotificationInterface notificationInterface;
	
	@Autowired
	IAdminService adminService;
	
	HttpSession session;
	
	@Autowired
	Account_ServiceInterface Service;
	

	
	@RequestMapping(value="/Invoice")
	public String Invoice(Model model)
	{ 			
			System.out.println("In Invoice controller");
		model.addAttribute("link", "Invoice.jsp");
		
		LocalDate date = LocalDate.now();		
		model.addAttribute("date",date);
		

		Registration regi = null;
		String purchaseSatus = null;
		String purchaseStatus = "buynow";
		
		Registration reg = new Registration(); //-- TO_Do :- UserId fetch from Registration.. 
		reg.setRegistrationId("1");
		
		List<Cart> cart = Service.getCartByRegistrationAndPurchaseStatus(reg, purchaseStatus);			
			for(Cart c : cart) {			
				System.out.println(c.getAccessories().getPartName());
				System.out.println(c.getOldbike().getNewBikeStock().getBikePrice());
				regi=new Registration();
				regi = c.getRegistration();
				purchaseSatus = c.getPurchaseStatus();
			}
			
			model.addAttribute("purchaseSatus", purchaseSatus);
			model.addAttribute("regi", regi);
			model.addAttribute("list", cart);
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
		return "Accounts/accountsIndex";
	} 
	

	@RequestMapping(value="/Dashboard")
	public String Dashboard(Model model ,HttpServletRequest request,@ModelAttribute Cart cart1) {
		
		System.out.println("in dashboard controll.. Subtotal..");
		
		session = request.getSession();
		System.out.println("name "+session.getAttribute("currentUserName"));
		System.out.println("name "+session.getAttribute("currentUserPost"));
		System.out.println("name "+session.getAttribute("currentUserImg"));
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		
		System.out.println("In Dashboard Controll..");
		Date fd = null;
		Date ld = null;  
		Date fds = null;
		Date lds = null;
		try {
			fd = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
			ld = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
			fds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
			lds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long lg = Service.NewBikeCount(fd,ld);			
		model.addAttribute("lg", lg);			
		long lg1 = Service.SoldBikeCount(fds, lds);			
		model.addAttribute("lg1", lg1);
		
		long oldBikecnt = Service.OldBikeCount(fds, lds);
		model.addAttribute("oldBikecnt", oldBikecnt);
		long oldSoldBikecnt = Service.OldSoldBikeCount(fds, lds);
		model.addAttribute("oldSoldBikecnt", oldSoldBikecnt);
		
		model.addAttribute("link", "accountsDashboard.jsp");
		return "Accounts/accountsIndex";
	
	}
	
	
	@RequestMapping(value="/MyNotificationsPageAccount")
	public String MyNotificationsPage(Model model, HttpServletRequest request){
		System.out.println("in myNotificationAccount controller..");
		
		session = request.getSession();
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString());
		model.addAttribute("outboxList",outboxList);
			
		//TODO: get login user name from session 
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString());
		model.addAttribute("inboxList",inboxList);   

		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);		
		model.addAttribute("shortInboxList", shortInboxList);	
		
		model.addAttribute("link","myNotifications.jsp");	
		return "Accounts/accountsIndex";
	}
	
	
	@RequestMapping(value="/markItAccount")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model, 
													HttpServletRequest request)throws IOException {
		session = request.getSession();
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString());
		model.addAttribute("outboxList",outboxList);  
		
		//TODO: get login user name from session
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString());
		model.addAttribute("inboxList",inboxList);   
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("shortInboxList", shortInboxList);
		
		model.addAttribute("link","myNotifications.jsp");	
		return "Accounts/accountsIndex";

	}
		
	
	@RequestMapping(value="/searchEmployeeAccount")    
	public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName) {
		
		if(adminService.getEmployeeDetailsByName(empName)!=null) 
			return adminService.getEmployeeDetailsByName(empName);

		return null;

	}
	
	
	@RequestMapping(value="/sendNotificationAccount")    
	public @ResponseBody String sendNotification(@RequestParam String reciverName, 
												 @RequestParam String reciverPost,
												 @RequestParam String reciverImg,
												 @RequestParam String message,
												 HttpServletResponse response, 
												 HttpServletRequest request,
												 Model model) {
	
		session = request.getSession();
		
		Notfication notify = new Notfication();
		
		
		//TODO: get login user details from session
		notify.setSenderName(session.getAttribute("currentUserName").toString()); 
		notify.setSenderImg("person4.jpg");
		notify.setSenderPost("account manager");
		
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
	
	
	@RequestMapping(value="newBikeList")
	public String NewBikeList(Model model, HttpServletRequest request) {
		session = request.getSession();
		model.addAttribute("link", "NewBikeStock.jsp");
		
		List<NewBikeStock> list = Service.getAllNewBikeStock();
		for(NewBikeStock n : list) {
			System.out.println("New Bike List.."+ n.getArrivalDate() + n.getBikeId() + "  "+ n.getBikePrice());
		}
		model.addAttribute("list", list);
		
		long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
		model.addAttribute("inboxCount", inboxCount);
		return "Accounts/accountsIndex";
	}
	
	//Akash code Ends here..
}
