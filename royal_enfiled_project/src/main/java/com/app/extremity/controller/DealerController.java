package com.app.extremity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DealerController {
	@RequestMapping(value="/DealerDashboardPage")
	public String signIn(Model model)    
	{ 
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","dealerDashboard.jsp");
	
		System.out.println("In SignIn controller");
		return "Dealer/dealerIndex";//by default go to client index.jsp  

	} 
	
	
	//Buy new Bike Page
	@RequestMapping(value="/NewBike1")
	public String NewBike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","NewBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	@RequestMapping(value="/OldBike")
	public String OldBike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","OldBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	@RequestMapping(value="/CustmizeBike")
	public String custmizeBike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","CustmizeBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	
	@RequestMapping(value="/Accessories")
	public String Accessories(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","Accessories.jsp");
      System.out.println("final");
		return "Dealer/dealerIndex";
	}
	@RequestMapping(value="/cart")
	public String cart(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","cart.jsp");
      System.out.println("final");
		return "Dealer/dealerIndex";
	}

}
