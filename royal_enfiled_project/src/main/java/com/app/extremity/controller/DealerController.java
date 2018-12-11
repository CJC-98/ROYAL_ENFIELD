package com.app.extremity.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*import com.app.extremity.model.Address;
import com.app.extremity.model.City;
import com.app.extremity.model.Contact;
import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
import com.app.extremity.model.State;
import com.google.gson.Gson;

import servicei.Servicei;*/

@Controller
public class DealerController {
	
	
	
	
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
}
