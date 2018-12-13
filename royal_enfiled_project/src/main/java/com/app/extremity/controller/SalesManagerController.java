package com.app.extremity.controller;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.Color;
import com.app.extremity.model.EngineCapacity;

@Controller
public class SalesManagerController {
	
	@Autowired
	BikeSaleServiceI bikeService;
	
	
	@RequestMapping(value="/addnew")
	public String signIn(Model model)    
	{ 
		
		System.out.println("In SignIn controller");
		//return "IndivisualUser/indivisualUserIndex";
		//return "IndivisualUser/indivisualUserIndex";//by default go to client index.jsp  
		model.addAttribute("link","SalesManager/AddNewBike.jsp");
		return "SalesManager/salesManagerDashboard";


	}  
	
	

	

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

	@RequestMapping(value = "/Offers")
	public String Offer(Model model) {

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

	@RequestMapping(value = "/ViewOrderBike")
	public String ViewNewBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOrderBike.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewOrderAccessories")
	public String ViewAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOrderAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewInvoice")
	public String ViewInvoice(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewInvoice.jsp");
		return "SalesManager/salesManagerIndex";

	}
	@RequestMapping(value = "/ViewBikeSaleForUser")
	public String ViewBikeSaleForUser(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewBikeSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	@RequestMapping(value = "/ViewAccessoriesSaleForUser")
	public String ViewAccessoriesSaleForUser(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewAccessoriesSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	@RequestMapping(value = "/ViewOffer")
	public String ViewOffer(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewOffer.jsp");
		return "SalesManager/salesManagerIndex";

	}
	@RequestMapping(value = "/BikeSaleForUser")
	public String BikesaleForUser(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "BikeSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	@RequestMapping(value = "/AccessoriesSaleForUser")
	public String AccessoriesSaleForUser(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "AccessoriesSaleForUser.jsp");
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
		model.addAttribute("link", "ViewAccessoriesDeadStock.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/ViewDeadStockBike")
	public String ViewDeadStockBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewBikeDeadStock.jsp");
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
	
	@RequestMapping(value="/add")
	public String SaveNewBike(@RequestParam String bikeModel,@ModelAttribute Color color,@RequestParam String bikeColor, @ModelAttribute BikeModel bk,@RequestParam String bikeEngine,@ModelAttribute EngineCapacity ec)
	{
		int ucount=bikeService.getbikeCount();
		System.out.println("fetching getCount()---"+ucount);
		ucount++;
		String user="BMID00";
		user=user+Integer.toString(ucount);
		
		System.out.println("registration id of user is"+user);
		
		//Count of bikeEngine
		int ecount=bikeService.getbikeCount();
		System.out.println("fetching getCount()---"+ecount);
		ecount++;
		String ecs="BEC00";
		ecs=ecs+Integer.toString(ecount);
		bk.setModelName(bikeModel);
		ec.setEngineCapacityId(ecs);
		ec.setEngineType(bikeEngine);
		bk.setEnginecapacity(ec);
		bk.setBikeModelId(user);
		
		//count of color
		
	     String bikecolor=bikeService.getBikecolor();
		System.out.println(bikecolor);
		color.setColorName(bikeColor);
		color.setColorId(bikecolor);
		bk.getColor().add(color);
		bikeService.saveDataBike(bk);
		 return "SalesManager/salesManagerIndex";
		
		
	}


}
