package com.app.extremity.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.Address;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;
import com.app.extremity.model.City;
import com.app.extremity.model.Contact;
import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
import com.app.extremity.model.State;
import com.app.extremity.iservice.IDealerService;
import com.google.gson.Gson;





@Controller
public class DealerController {

	@Autowired
	IDealerService service;
	
	@RequestMapping(value="/DealerDashboardPage")
	public String ServicesDashboardPage(Model model){
		//
		//
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","dealerDashboard.jsp");
		return "Dealer/dealerIndex";
	}
	
	


	 /* @author Shital Belokar this method is for show all cart items*/
	@RequestMapping(value="/cart")
	public String cartPage(Model model){
		//
		//
		List<Cart> list=service.getAllCart();
		 model.addAttribute("data", list);
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","MyCart.jsp");
		return "Dealer/dealerIndex";
	}
	
	/*@ author shital belokar @ Sonika this method is to add bikes in cart*/
	@RequestMapping(value="/addcart",method=RequestMethod.GET)
	public String saveToCart(Model model,@RequestParam(value="id") String id, @ModelAttribute Cart cart  ) {
		System.out.println("in home controller"+id);
		System.out.println("quantity And Total"+cart.getQty());
		System.out.println("cart");
		List<BikeSaleForUser> bs1list=service.getBikeId();
		for(BikeSaleForUser bs:bs1list){
			System.out.println("in for"+bs);
			System.out.println("get bikeid"+bs.getBikemodel().getModelId());
			if((bs.getBikemodel().getModelId()).equals(id)){
				System.out.println("in if");
			  model.addAttribute("data", bs);
			  
		System.out.println("dashboard hits...........");
		model.addAttribute("link","cart.jsp");
			}
		
		}
		
		return "Dealer/dealerIndex";
	}
			/*@ author Shital Belokar his method is to saved cart items*/
			@RequestMapping(value="/savecart",method=RequestMethod.POST)
			public String saveCart(Model model,@RequestParam(value="qty") int qty,@ModelAttribute Cart cart,@RequestParam long total,@RequestParam String modelId) {
			System.out.println("values"+qty+""+total);
				List<BikeSaleForUser> bs1list=service.getBikeId();
				for(BikeSaleForUser bs:bs1list){
					System.out.println("in for");
					System.out.println("get bikeid"+bs.getBikemodel().getModelId());
					if(bs.getBikemodel().getModelId().equals(modelId)){
					  model.addAttribute("data", bs);
					  cart.setBikeSaleForUser(bs);
					  cart.setQty(qty);
					  cart.setTotalprice(total);
					  Cart c=service.saveCart(cart);
					  System.out.println("save cart");
					 
					  
						List<Cart> list=service.getAllCart();
						 model.addAttribute("data", list);
			}
				
					
				}
				model.addAttribute("link","MyCart.jsp");
				return "Dealer/dealerIndex";
				
			}
	
	@RequestMapping(value="/continue")
	public String ContinueShopping(Model model){
		//
		//
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link","dealerDashboard.jsp");
		return "Dealer/dealerIndex";
	}
	
	
	
	
	@RequestMapping(value="/NewBike1")
	public String NewBike(Model model){
		 List<BikeModel> bikeList = service.getAllBikes();
		 
		 model.addAttribute("list",bikeList);
		 
		System.out.println("newbike hits...........");   
		model.addAttribute("link","NewBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	
	
	@RequestMapping(value="/OldBike")
	public String OldBike(Model model){
		List<BikeModel> bikeList = service.getAllBikes();
		 
		 model.addAttribute("list",bikeList);
		System.out.println("newbike hits...........");   
		model.addAttribute("link","OldBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	@RequestMapping(value="/CustmizeBike")
	public String custmizeBike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","customizationofBike.jsp");
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
	
	//@author Shital  Belokar this method is to show specification of selected bikemodel 
	@RequestMapping(value="/quickview",method=RequestMethod.GET)
	public String QuickViewPage(Model model,@RequestParam("id") String id) {
		
		System.out.println("quick view id"+id);
		List<BikeSaleForUser> bs1list=service.getBikeIdWiseAllSpecification();
		for(BikeSaleForUser bs:bs1list){
			System.out.println("in for");
			System.out.println("get bikeid"+bs.getBikemodel().getModelId());
			
		if((bs.getBikemodel().getModelId()).equals(id)){
			System.out.println("in if");
		  model.addAttribute("data", bs);
	model.addAttribute("link","quickView.jsp");
		System.out.println("final");
		
		}
		}
		return "Dealer/dealerIndex";
	}
	//@author Shital  Belokar this method is to show specification of selected bikemodel 
		@RequestMapping(value="/quickview1",method=RequestMethod.GET)
		public String QuickViewPage1(Model model,@RequestParam("id") String id) {
			
			System.out.println("quick view id"+id);
			List<BikeSaleForUser> bs1list=service.getBikeIdWiseAllSpecification();
			for(BikeSaleForUser bs:bs1list){
				System.out.println("in for");
				System.out.println("get bikeid"+bs.getBikemodel().getModelId());
				
			if((bs.getBikemodel().getModelId()).equals(id)){
				System.out.println("in if");
			  model.addAttribute("data", bs);
		model.addAttribute("link","ol.jsp");
			System.out.println("final");
			
			}
			}
			return "Dealer/dealerIndex";
		}
		
		
	
	@RequestMapping(value="/Print")
	public String Addbike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","AddBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	//@Author Sonika Takalkar
	@RequestMapping(value="/getstate", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody String getState(@RequestParam int a, HttpServletResponse res) throws IOException
	{
		System.out.println("Countryname="+a);
		List<State>list= service.findAllState(a);
		System.out.println("in controller"+list);
		List<String> l1=new ArrayList<String>();
		for(State s1:list)
		{
			String sname=s1.getSname();
			System.out.println(sname);
		l1.add(sname);
		}
		String json=new Gson().toJson(l1);

		
		res.setContentType("application/json");
		
		res.getOutputStream();
	
		
		return json;
	}
	
	//@Author Sonika Takalkar
	//to get cities from db
	@RequestMapping(value="/cities", method=RequestMethod.GET,produces="application/json")
	public @ResponseBody String getCity(@RequestParam String b, HttpServletResponse res)throws IOException
	{
		System.out.println("in cities controller"+b);
	  List<City>l1= service.getAllcitiesByState(b);
		System.out.println(l1);
		List l2=new ArrayList();
		for(City c:l1)
		{
			String cityname= c.getCityName();
			System.out.println("City="+cityname);
			l2.add(cityname);
		}
		System.out.println(l1);
		String json=new Gson().toJson(l2);
		res.setContentType("application/json");
		res.getOutputStream();
		System.out.println("send response of cities..");
		return json;
	}
	
	//this method used for  to check already exist email in db @author shital belokar
		@RequestMapping(value="/checkmail",method=RequestMethod.GET,produces="application/json")
		public @ResponseBody String chechMailStatus(HttpServletResponse res,@RequestParam String email) throws IOException{
			System.out.println("in homecontroller email"+email);
		    Login lgn=service.findEmail(email);
			if(lgn!=null){
			System.out.println("home controller emails"+lgn);

				System.out.println("in if email");
				String msg="email already exist...please enter another email";
				String json=new Gson().toJson(msg);
				res.setContentType("application/json");
				res.getOutputStream();
				System.out.println("send response of msg..");
				return json;
			
			}
			return "signup";
		}
		//<!-- this method to save form data to db @author Akshta yevatkar
		@RequestMapping("/save")
		public  String saveData(@RequestParam String rolename,@RequestParam String email,@ModelAttribute Registration r,@ModelAttribute Login l,@ModelAttribute Contact c,@ModelAttribute Role ro,@ModelAttribute Address a,Model model) throws IOException
		{
			Date dt=new Date();
		    int d=dt.getDate();
		    int m=dt.getMonth()+1;
		    int y=dt.getYear()+1900;
		    r.getContact();
		    String today=d+"/"+m+"/"+y;
		    System.out.println("Today : "+today);
		    r.setDate(today);
		    System.out.println("selected role is:"+rolename);
		    if(rolename.equalsIgnoreCase("dealer"))
		    {
		    	System.out.println("In if to check dealer");
		    ro.setRoleId(1);
		    ro.setRoleName("DEALER");
		    l.setRole(ro);
		    }
		    else
		    {
		    	System.out.println("In else to check user");
		    	 ro.setRoleId(2);
		    	 ro.setRoleName("USER");
		    	    l.setRole(ro);
		    }
		    Login lgn=service.findEmail(email);
		    if(lgn==null){
				if(rolename.equals("DEALER"))
				{
				int dcount=service.getDealerCount();
				
				System.out.println("result from getDelearCount()"+dcount);
				String user="DLR00";
				dcount++;
				user=user+Integer.toString(dcount);
				System.out.println("generated registration id"+user);
				ro.setRoleId(2);
				r.setRole(ro);
				r.setRegistrationId(user);
				}
				else 
				{
					
					int ucount=service.getUserCount();
					System.out.println("fetching getUserCount()---"+ucount);
					ucount++;
					String user="USR00";
					user=user+Integer.toString(ucount);
					ro.setRoleId(1);
					r.setRole(ro);
					System.out.println("registration id of user is"+user);
					r.setRegistrationId(user);
				}
				
			
			r.setLogin(l);
			c.setAddress(a);
			r.setContact(c);
			System.out.println("in saveData controller");
			
			System.out.println("in save data");
			
			System.out.println("fetching state---------"+r.getContact().getAddress().getCountry());
			c.setAddress(a);
			System.out.println("fetching mob--"+r.getContact().getMobile());
			r.setContact(c);

			
			service.saveData(r);
			String msg="data saved successfully";
			model.addAttribute("msg", msg);
			return "login";
			}
		    return "home";
		}
		
		//@author shital belokar this method is to add new bikestock in db
		@RequestMapping(value="/saveBike")
		public String savedata(@RequestParam String modelName , @RequestParam MultipartFile image , HttpServletRequest request) throws IOException 
		{
			 //save image
			 
			 //step 1 : set folder location
			 String foldername = request.getServletContext().getRealPath("Resources/images/bikeImages");//programme folder path

			 //step 2 : set image file to that folder location
			 Path path = Paths.get(foldername, image.getOriginalFilename());
			
			 
			 //step 3 : write the image file
			 Files.write(path, image.getBytes());
			 
			 
			 //step 4 : store image name in DB
			 BikeModel bike = new BikeModel();
			 bike.setModelName(modelName);
				
				
				
			 bike.setImage(image.getOriginalFilename());
			 
			 service.saveBikes(bike);
			  
			System.out.println("in homecontroller save method");
			
			 
			return "Dealer/AddBike";
			 
		} 
		/*@author shital belokar this method used for to delete cart items*/
		@RequestMapping(value="/deletecart",method=RequestMethod.POST)
		public String deleteCartProduct(Model model,@RequestParam int productId){
			 
			 service.deleteCart(productId);
			 List<Cart> list=service.getAllCart();
			 model.addAttribute("data", list);
			 
			 model.addAttribute("link","MyCart.jsp");
				return "Dealer/dealerIndex";
				
		
}
}