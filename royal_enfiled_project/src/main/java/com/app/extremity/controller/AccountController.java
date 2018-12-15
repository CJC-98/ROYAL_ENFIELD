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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.Demo;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;


@Controller
public class AccountController {

	
	@Autowired
	NotificationInterface notificationInterface;
	@Autowired
	IAdminService adminService;
	
	@Autowired
	Account_ServiceInterface Service;

	@RequestMapping(value="/Invoice")
	public String Invoice(Model model)
	{ 
		System.out.println("In Invoice controller");
		LocalDate date = LocalDate.now();
		System.out.println("date.." + date);
		model.addAttribute("link", "Invoice.jsp");
		model.addAttribute("date",date);
		
		List<Demo> list = Service.getAllDemo();	
		for(Demo d : list) {
			System.out.println("in for loop");
			System.out.println(d.getName());
			//System.out.println("City--" + d.getAddress().getCity() + " State--" + d.getAddress().getState());
			System.out.println(d.getId()+"   qty-"+d.getQty()+"  unitcost-"+d.getUnitCost()+"  total-"+d.getTotal());
		}		
		model.addAttribute("list", list);
		
		return "Accounts/accountsIndex";
	} 
	
	
	@RequestMapping(value="/Notification")
	public String Notification(Model model) {
		System.out.println("In Notification Controll..");
		model.addAttribute("link", "myNotification.jsp");
		return "Accounts/accountsIndex";
	}
	

	@RequestMapping(value="/Dashboard")
	public String Dashboard(Model model) {
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
			System.out.println("Home Controll.. New Bike Count is.. "+lg);
		model.addAttribute("lg", lg);			
		long lg1 = Service.SoldBikeCount(fds, lds);
			System.out.println("Home Controll.. Sold Bike Count is.. " + lg1);
		model.addAttribute("lg1", lg1);
		model.addAttribute("link", "accountsDashboard.jsp");
		return "Accounts/accountsIndex";
	}
	

	@RequestMapping(value="/MyNotificationsPageAccount")
	public String MyNotificationsPage(Model model){
		System.out.println("in myNotificationAccount controller..");
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("akash");
		model.addAttribute("outboxList",outboxList);
			
		//TODO: get login user name from session 
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("akash");
		model.addAttribute("inboxList",inboxList);   

		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("akash", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("akash", true);
		for(Notfication n : shortInboxList) {
			System.out.println("notify id.."+n.getNotficationId());
			System.out.println("notify msg.." + n.getMessage() + n.getSenderName());
		}
		model.addAttribute("shortInboxList", shortInboxList);	
		
		model.addAttribute("link","myNotifications.jsp");	
		return "Accounts/accountsIndex";
	}
	

	
	
	@RequestMapping(value="/markItAccount")    
	public @ResponseBody String udpateNotification(@RequestParam int notficationId,Model model)throws IOException {
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
		
		//TODO: get login user name from session 
		List<Notfication> outboxList= notificationInterface.getMyOutboxNotfication("akash");
		model.addAttribute("outboxList",outboxList);  
		
		//TODO: get login user name from session
		List<Notfication> inboxList= notificationInterface.getMyInboxNotfication("akash");
		model.addAttribute("inboxList",inboxList);   
		
		//TODO: get login user details from session
		long inboxCount = notificationInterface.getInboxCount("akash", false);
		model.addAttribute("inboxCount", inboxCount);
		
		//TODO: get login user details from session
		List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication("akash", false);
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
												 Model model) {
	
		
		
		Notfication notify = new Notfication();
		
		
		//TODO: get login user details from session
		notify.setSenderName("akash"); 
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
	
	//Akash code Ends here..
}
