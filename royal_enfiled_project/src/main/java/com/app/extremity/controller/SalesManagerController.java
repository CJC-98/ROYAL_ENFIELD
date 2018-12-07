package com.app.extremity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/* 
 * This controller helps to navigate in sale manager index.jsp
 * and handle all request-response made by sale manager
 *  */

@Controller
public class SalesManagerController {
	@RequestMapping(value="/DashboardPageSale")
	public String ServicesDashboardPage(Model model){
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","SaleManager/saleManagerDashboard.jsp");
		return "SaleManager/saleManagerIndex";
	}
}
