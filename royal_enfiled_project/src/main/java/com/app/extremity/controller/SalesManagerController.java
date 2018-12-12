package com.app.extremity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeOffer;

@Controller
public class SalesManagerController {
	@Autowired
    BikeSaleServiceI   bikesaleservicei;

	@RequestMapping(value = "/DashboardPages")
	public String SaleDashboardPage(Model model) {

		System.out.println("dashboard hits...........");
		model.addAttribute("link", "salesManagerDashboard.jsp");
		return "SalesManager/salesManagerIndex";
	}

	@RequestMapping(value = "/AddnewBike")
	public String AddNewBikeForm(Model model) {
		System.out.println("in new bike form");
		model.addAttribute("link", "AddNewBike.jsp");
		return "SalesManager/salesManagerIndex";
		// System.out.println("In sales controller");

	}

	@RequestMapping(value = "/AddAccessories")
	public String AddNewAccessoriesForm(Model model) {

		System.out.println("in new accessories form");
		model.addAttribute("link", "AddAccessoriesForm.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping("/Offers")
	public String Offer(@ModelAttribute BikeOffer bikeoffer,Model model) {
        System.out.println(bikeoffer.getEndDate());
        System.out.println(bikeoffer.getStartDate());
        System.out.println(bikeoffer.getOfferName());
        System.out.println("aaaa");
	  	System.out.println("in offer");
		BikeOffer bf=bikesaleservicei.SaveOffer(bikeoffer);
		model.addAttribute("link", "Offers.jsp");
		System.out.println("In THe Offer.....");
		return "SalesManager/salesManagerIndex";

	}


	@RequestMapping(value = "/DeadAccessories")
	public String DeadAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "DeadAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/DeadBike")
	public String DeadBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "DeadBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewOldBike")
	public String ViewOldBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOldBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewNewBike")
	public String ViewNewBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOldBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewAccessories")
	public String ViewAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewInvoice")
	public String ViewInvoice(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewInvoice.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewOffer")
	public String ViewOffer(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOffer.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewSoldAccessories")
	public String ViewSoldAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewSoldAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewSoldNewBike")
	public String ViewSoldNewBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewSoldNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewSoldOldBike")
	public String ViewSoldOldBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewSoldOldBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewDeadStockAccessories")
	public String ViewDeadStockAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewDeadStockAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewDeadStockBike")
	public String ViewDeadStockBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewDeadStockBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/OrderToCompanyForNewAccessories")
	public String OrderToCompanyForNewAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "OrderToCompanyForNewAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/OrderToCompanyForNewBike")
	public String OrderToCompanyForNewBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "OrderToCompanyForNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
}
