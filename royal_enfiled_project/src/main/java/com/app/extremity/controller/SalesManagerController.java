package com.app.extremity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.Color;
import com.app.extremity.model.EngineCapacity;


@Controller
public class SalesManagerController
{
	@Autowired
	BikeSaleServiceI bikeSaleService;

	@RequestMapping(value = "/DashboardPages")
	public String SaleDashboardPage(Model model) {

		System.out.println("dashboard hits...........");
		model.addAttribute("link", "salesManagerDashboard.jsp");
		return "SalesManager/salesManagerIndex";
	}

	@RequestMapping(value = "/AddnewBike")
	public String AddNewBikeForm(Model model) {
		System.out.println("in new bike formxzcxgh");
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

	@RequestMapping(value = "/Offers")
	public String Order(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "Offers.jsp");
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
	
	//this method is used to add new bike model details with image in table bike_model
	@RequestMapping(value="/saveNewBikeModel",method=RequestMethod.POST)
	public String addNewBikeModel(@ModelAttribute BikeModel bikeModel1,@ModelAttribute Color color,@ModelAttribute EngineCapacity engCap,@RequestParam String bikeModel,@RequestParam String bikeColor,@RequestParam String bikeEngine,@RequestParam("profilePic") MultipartFile profilePic,Model model) {
		System.out.println("In add new bike...");
		//for autogenerate string id
		int bmcount=bikeSaleService.getBikeModelCount();
		
		System.out.println("result from getBikeModelCount()"+bmcount);
		String bikeModelCnt="BMID00";
		bmcount++;
		bikeModelCnt=bikeModelCnt+Integer.toString(bmcount);
		System.out.println("generated bikemodel id"+bikeModelCnt);
		
		
		
		//for engine cap
		int eccount=bikeSaleService.getEngineCapacityCount();
		System.out.println("Result from Engine Capacity Count"+eccount);
		String engCnt="BECID00";
		eccount++;
		engCnt=engCnt+Integer.toString(eccount);
		System.out.println("generated EngineCap id"+engCnt);
		
		bikeModel1.setBikeModelId(bikeModelCnt);
		engCap.setEngineCapacityId(engCnt);
		
		engCap.setEngineType(bikeEngine);
		bikeModel1.setEnginecapacity(engCap);
		bikeModel1.setModelName(bikeModel);
		
		String bkClr=bikeSaleService.getBikeColor();
		System.out.println(bkClr);
		color.setColorName(bikeColor);
		color.setColorId(bkClr);
		bikeModel1.getColor().add(color);
		
		
		
		bikeSaleService.addNewBikeModel(bikeModel1,color,engCap,profilePic);
		return "SalesManager/salesManagerIndex";
	}
	
}
