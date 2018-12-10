package com.app.extremity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//******    
@Controller
public class SalesManagerController {

	@RequestMapping(value = "/DashboardPages")
	public String SaleDashboardPage(Model model) {

		System.out.println("dashboard hits...........");
		model.addAttribute("link", "salesManagerDashboard.jsp");
		return "SalesManager/salesManagerIndex";
	}

	@RequestMapping(value="/AddnewBike")
	public String AddNewBikeForm(Model model) {
		System.out.println("in new bike form");
		model.addAttribute("link", "AddNewBike.jsp");
		return "SalesManager/salesManagerIndex";
		// System.out.println("In sales controller");

	}

	@RequestMapping(value = "/AddForm")
	public String AddNewAccessoriesForm(Model model) {

		System.out.println("in new accessories form");
		model.addAttribute("link", "AddAccessoriesForm.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/OrderToCompanyForNewBike")
	public String OrderToCompany(Model model) {

		System.out.println("in new Bike form to company ");
		model.addAttribute("link", "OrderToCompanyForNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/OrderToCompanyForNewAccessories")
	public String OrderToCompanyForAccessories(Model model) {

		System.out.println("in new Accessories form to company ");
		model.addAttribute("link", "OrderToCompanyForNewAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/order")
	public String Order(Model model) {

		System.out.println("in order");
		return "SalesManager/salesManagerIndex";

	}

}
