package com.app.extremity.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

import com.app.extremity.model.Address;
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
	
	//this method to check already exist email in db @author shital
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
		//<!-- this method to save form data to db @author Akshta
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
			return "signup";
			}
		    return "home";
		}
			

}
