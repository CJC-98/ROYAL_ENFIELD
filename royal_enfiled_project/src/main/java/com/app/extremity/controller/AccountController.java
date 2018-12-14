package com.app.extremity.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Demo;


@Controller
public class AccountController {

	
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
		model.addAttribute("link", "Notification.jsp");
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
	

}
