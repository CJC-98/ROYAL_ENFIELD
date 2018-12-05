package com.app.extremity.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AccountController {
	

	@RequestMapping(value="/Invoice")
	public String Invoice(Model model)
	{ 
		LocalDate date = LocalDate.now();
		System.out.println("date.." + date);
			
		System.out.println("In Invoice controller");
		model.addAttribute("link", "Invoice.jsp");
		model.addAttribute("date",date);
		return "Accounts/accountsIndex";
	} 
	
	
}
