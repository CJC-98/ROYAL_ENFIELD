package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
	
	@RequestMapping(value="/saleBike")
	public String saleUsedBike()
	{  
		System.out.println("In sale Bike Controller");
		
		return "IndivisualUser/saleUsedBike";
	}


}
