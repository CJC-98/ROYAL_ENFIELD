package com.app.extremity.controller;

import java.time.LocalDate;
import java.util.ArrayList;
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
			System.out.println("City--" + d.getAddress().getCity() + " State--" + d.getAddress().getState());
			System.out.println(d.getId()+"   qty-"+d.getQty()+"  unitcost-"+d.getUnitCost()+"  total-"+d.getTotal());
		}
		
		model.addAttribute("list", list);
		
		return "Accounts/accountsIndex";
	} 
	
	
	
	
	
}
