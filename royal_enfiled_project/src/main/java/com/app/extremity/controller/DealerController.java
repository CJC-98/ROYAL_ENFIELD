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
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.Address;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeModelName;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;
import com.app.extremity.model.City;
import com.app.extremity.model.Contact;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
import com.app.extremity.model.State;
import com.app.extremity.exceptionHandling.QuantityNotNullException;
import com.app.extremity.iservice.IDealerService;
import com.google.gson.Gson;

@Controller
public class DealerController {

	@Autowired
	IDealerService service;

	HttpSession session;

	@RequestMapping(value = "/DealerDashboardPage")
	public String ServicesDashboardPage(Model model) {
		//
		//

		System.out.println("dashboard hits...........");
		model.addAttribute("link", "dealerDashboard.jsp");
		return "Dealer/dealerIndex";
	}
/* @ author shital belokar this method is used for continue shopping and return on dealer dashboard*/
	@RequestMapping(value = "/continue")
	public String ContinueShopping(Model model) {
		
		System.out.println("dashboard hits...........");
		model.addAttribute("link", "dealerDashboard.jsp");
		return "Dealer/dealerIndex";
	}
/* @ author shital belokar this method to show all new bike*/
	@RequestMapping(value = "/NewBike1")
	public String NewBike(Model model) {
		List<BikeModel> bikeList = service.getAllBikes();

		model.addAttribute("list", bikeList);

		System.out.println("newbike hits...........");
		model.addAttribute("link", "NewBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}

	/* @ author shital belokar this method to show  customize bike*/
	@RequestMapping(value = "/CustmizeBike")
	public String custmizeBike(Model model) {

		System.out.println("newbike hits...........");
		model.addAttribute("link", "customizationofBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}

	// @author Shital Belokar this method  is to show all cart items
	@RequestMapping(value = "/cart")
	public String cartPage(Model model, HttpServletRequest request) {
		session = request.getSession();

		Registration reg = (Registration) session.getAttribute("reg");
		session.getAttribute("email");
		System.out.println("session id" + reg);
		List<Cart> bikeCartList = new ArrayList();
		List<Cart> accesseriesCartList = new ArrayList();
		List<Cart> oldBikeCartList = new ArrayList();
		List<Cart> cartlist = service.getAllCart();
		long sum=0;
		for (Cart c : cartlist) {
			if (c.getRegistration() != null) {
				String reiid = c.getRegistration().getRegistrationId();
				System.out.println("db regid"
						+ c.getRegistration().getRegistrationId());
				if ((reiid).equals(reg.getRegistrationId())) {
					System.out.println("save cart if");
					if(!c.getPurchaseStatus().equals("sold")){
					if (c.getRegistration().getRegistrationId().equals(reiid))
						 {
						
							if (c.getAccessories() != null) {
								accesseriesCartList.add(c);

							}
							if (c.getBikeSaleForUser() != null) {
								bikeCartList.add(c);

							}
							if(c.getOldbike()!=null){
								oldBikeCartList.add(c);
							}
						}
					}
					
					 sum=(long) (sum+c.getTotalprice());
					 model.addAttribute("msg", sum);
					
				}

				System.out.println("dashboard hits...........");
				model.addAttribute("link", "MyCart.jsp");

			}

		}
		
		model.addAttribute("data1", bikeCartList);
		model.addAttribute("data2", accesseriesCartList);
		model.addAttribute("data3", oldBikeCartList);
		return "Dealer/dealerIndex";

	}

	/* @ author shital belokar  this method is to add bikes in cart */
	@RequestMapping(value = "/addcart", method = RequestMethod.GET)
	public String saveToCart(Model model,
			@RequestParam(value = "id") String id, @ModelAttribute Cart cart) {
		System.out.println("in home controller" + id);
		System.out.println("quantity And Total" + cart.getQty());
		System.out.println("cart");
		List<BikeSaleForUser> bs1list = service.getBikeId();
		for (BikeSaleForUser bs : bs1list) {
			System.out.println("in for" + bs);
			System.out.println("get bikeid" + bs.getBikemodel().getModelId());
			if ((bs.getBikemodel().getModelId()).equals(id)) {
				System.out.println("in if");
				model.addAttribute("data", bs);

				System.out.println("dashboard hits...........");
				model.addAttribute("link", "cart.jsp");
			}

		}

		return "Dealer/dealerIndex";
	}

	/* @ author Shital Belokar this method is to saved cart items */
	@RequestMapping(value = "/savecart", method = RequestMethod.POST)
	public String saveCart(Model model, @RequestParam(value = "qty") int qty,
			@ModelAttribute Cart cart, @RequestParam long total,
			@RequestParam String modelId, HttpServletRequest request) {

		session = request.getSession();
		System.out.println("values" + qty);
		if (qty == 0) {
			System.out.println("in 1st try");
			QuantityNotNullException e = new QuantityNotNullException();
			try {
				System.out.println("in try");
				throw e;
			} catch (QuantityNotNullException e1) {
				// TODO Auto-generated catch block
				System.out.println("in catch");
				e1.printStackTrace();
				System.out.println(e.getMessage());
				// return "Dealer/ExceptionHandler";
			}
		}
		System.out.println("name " + session.getAttribute("id"));
		Registration reg = (Registration) session.getAttribute("reg");
		session.getAttribute("email");
		System.out.println("session id" + reg);
		String regid = reg.getRegistrationId();
		System.out.println("session regid" + regid);
		List<BikeSaleForUser> bs1list = service.getBikeId();
		for (BikeSaleForUser bs : bs1list) {
			System.out.println("in for");
			System.out.println("get bikeid" + bs.getBikemodel().getModelId());
			if (bs.getBikemodel().getModelId().equals(modelId)) {
				model.addAttribute("data", bs);
				cart.setBikeSaleForUser(bs);

				cart.setQty(qty);
				cart.setTotalprice(total);

				cart.setRegistration(reg);
				int result = Integer.parseInt(bs.getQuantity());
				System.out.println("db qty" + result);

				if (result > qty) {

					System.out.println("in result>qty");

					Cart c = service.saveCart(cart);
					String reiid = c.getRegistration().getRegistrationId();
					System.out.println("db regid"
							+ c.getRegistration().getRegistrationId());
					{
						if ((reiid).equals(reg.getRegistrationId())) {
							System.out.println("save cart if");

							cartPage(model, request);
						}
					}
				} else {

					model.addAttribute("msg",
							"stock is not sufficient please enter less quantity");

					model.addAttribute("link", "cart.jsp");
					return "Dealer/dealerIndex";

				}
			}

		}
		model.addAttribute("link", "MyCart.jsp");
		return "Dealer/dealerIndex";
	}

	/* @author shital belokar this method used for to delete cart items */
	@RequestMapping(value = "/deletecart", method = RequestMethod.POST)
	public String deleteCartProduct(Model model, @RequestParam int productId,
			HttpServletRequest request) {
		session = request.getSession();
		service.deleteCart(productId);
		Registration reg = (Registration) session.getAttribute("reg");
		cartPage(model, request);
		//model.addAttribute("data", list);
		model.addAttribute("link", "MyCart.jsp");
		return "Dealer/dealerIndex";

	}

	
	// @author Shital Belokar this method is to show specification of selected
	// bikemodel
	@RequestMapping(value = "/quickview", method = RequestMethod.GET)
	public String QuickViewPage(Model model, @RequestParam("id") String id) {

		System.out.println("quick view id" + id);
		List<BikeSaleForUser> bs1list = service.getBikeIdWiseAllSpecification();
		for (BikeSaleForUser bs : bs1list) {
			System.out.println("in for");
			System.out.println("get bikeid" + bs.getBikemodel().getModelId());

			if ((bs.getBikemodel().getModelId()).equals(id)) {
				System.out.println("in if");
				model.addAttribute("data", bs);
				model.addAttribute("link", "quickView.jsp");
				System.out.println("final");

			}
		}
		return "Dealer/dealerIndex";
	}

	
	@RequestMapping(value="/Print")
	public String Addbike(Model model){
		
		System.out.println("newbike hits...........");   
		model.addAttribute("link","AddOldBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}
	// @Author Sonika Takalkar this method is to get all state
	@RequestMapping(value = "/getstate", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getState(@RequestParam int a,
			HttpServletResponse res) throws IOException {
		System.out.println("Countryname=" + a);
		List<State> list = service.findAllState(a);
		System.out.println("in controller" + list);
		List<String> l1 = new ArrayList<String>();
		for (State s1 : list) {
			String sname = s1.getSname();
			System.out.println(sname);
			l1.add(sname);
		}
		String json = new Gson().toJson(l1);

		res.setContentType("application/json");

		res.getOutputStream();

		return json;
	}

	// @Author Sonika Takalkar
	// to get cities from db
	@RequestMapping(value = "/cities", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getCity(@RequestParam String b,
			HttpServletResponse res) throws IOException {
		System.out.println("in cities controller" + b);
		List<City> l1 = service.getAllcitiesByState(b);
		System.out.println(l1);
		List l2 = new ArrayList();
		for (City c : l1) {
			String cityname = c.getCityName();
			System.out.println("City=" + cityname);
			l2.add(cityname);
		}
		System.out.println(l1);
		String json = new Gson().toJson(l2);
		res.setContentType("application/json");
		res.getOutputStream();
		System.out.println("send response of cities..");
		return json;
	}

	
	// @author shital belokar this method used for to check already exist email in db //
	@RequestMapping(value = "/checkmail", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String chechMailStatus(HttpServletResponse res,
			@RequestParam String email) throws IOException {
		System.out.println("in homecontroller email" + email);
		Registration rgn = service.findEmail(email);
		if (rgn != null) {
			System.out.println("home controller emails" + rgn);

			System.out.println("in if email");
			String msg = "email already exist...please enter another email";
			String json = new Gson().toJson(msg);
			res.setContentType("application/json");
			res.getOutputStream();
			System.out.println("send response of msg..");
			return json;

		}
		return "signup";
	}

	// @author Akshta yevatkar <!-- this method to save form data to db 
	@RequestMapping("/save")
	public String saveData(@RequestParam String rolename,
			@RequestParam String email, @ModelAttribute Registration r,
			@ModelAttribute Contact c, @ModelAttribute Role ro,
			@ModelAttribute Address a, Model model, HttpServletRequest request)
			throws IOException {
		Date dt = new Date();
		int d = dt.getDate();
		int m = dt.getMonth() + 1;
		int y = dt.getYear() + 1900;
		r.getContact();
		String today = d + "/" + m + "/" + y;
		System.out.println("Today : " + today);
		r.setDate(today);
		System.out.println("selected role is:" + rolename);
		if (rolename.equalsIgnoreCase("dealer")) {
			System.out.println("In if to check dealer");
			ro.setRoleId(1);
			ro.setRoleName("DEALER");

		} else {
			System.out.println("In else to check user");
			ro.setRoleId(2);
			ro.setRoleName("USER");

		}
		Registration rgn = service.findEmail(email);
		if (rgn == null) {
			if (rolename.equals("DEALER")) {
				int dcount = service.getDealerCount();

				System.out.println("result from getDelearCount()" + dcount);
				String user = "DLR00";
				dcount++;
				user = user + Integer.toString(dcount);
				System.out.println("generated registration id" + user);
				ro.setRoleId(2);
				r.setRole(ro);
				r.setRegistrationId(user);
			} else {

				int ucount = service.getUserCount();
				System.out.println("fetching getUserCount()---" + ucount);
				ucount++;
				String user = "USR00";
				user = user + Integer.toString(ucount);
				ro.setRoleId(1);
				r.setRole(ro);
				System.out.println("registration id of user is" + user);
				r.setRegistrationId(user);
			}

			c.setAddress(a);
			r.setContact(c);
			System.out.println("in saveData controller");

			System.out.println("in save data");

			System.out.println("fetching state---------"
					+ r.getContact().getAddress().getCountry());
			c.setAddress(a);
			System.out.println("fetching mob--" + r.getContact().getMobile());
			r.setContact(c);

			service.saveData(r, request);
			String msg = "data saved successfully";
			model.addAttribute("msg", msg);
			return "login";
		}
		return "home";
	}

	/*
	 * //@author shital belokar this method is to add new bikestock in db
	 * 
	 * @RequestMapping(value="/saveBike") public String savedata(@RequestParam
	 * String modelName , @RequestParam MultipartFile image , HttpServletRequest
	 * request) throws IOException { //save image
	 * 
	 * //step 1 : set folder location String foldername =
	 * request.getServletContext
	 * ().getRealPath("Resources/images/bikeImages");//programme folder path
	 * 
	 * //step 2 : set image file to that folder location Path path =
	 * Paths.get(foldername, image.getOriginalFilename());
	 * 
	 * 
	 * //step 3 : write the image file Files.write(path, image.getBytes());
	 * 
	 * 
	 * //step 4 : store image name in DB BikeModel bike = new BikeModel();
	 * bike.setModelName(modelName);
	 * 
	 * 
	 * 
	 * bike.setImage(image.getOriginalFilename());
	 * 
	 * service.saveBikes(bike);
	 * 
	 * System.out.println("in homecontroller save method");
	 * 
	 * 
	 * return "Dealer/AddBike";
	 * 
	 * }
	 */

	@ExceptionHandler(value = QuantityNotNullException.class)
	public String exceptionHandling(Model model) {
		
		return "Dealer/ExceptionHandler";

	}

	/* @ author Hemant Jadhav this method is to add Accessories in cart */
	@RequestMapping(value = "/addcart3", method = RequestMethod.GET)
	public String saveAccToCart(Model model,
			@RequestParam(value = "id") String id, @ModelAttribute Cart cart) {
		System.out.println("in home controller" + id);
		System.out.println("quantity And Total" + cart.getQty());
		System.out.println("cart");
		List<AccessoriesStock> Aclist = service.getAccessoriesId();
		for (AccessoriesStock AC : Aclist) {
			System.out.println("in for" + AC);
			System.out.println("get AccId" + AC.getPartId());
			if ((AC.getPartId()).equals(id)) {
				System.out.println("in if");
				model.addAttribute("data", AC);

				System.out.println("dashboard hits...........");
				model.addAttribute("link", "cart3.jsp");
			}

		}
		return "Dealer/dealerIndex";
	}

	/* @ author Hemant Jadhav method is to saved cart items */
	@RequestMapping(value = "/savecart3", method = RequestMethod.POST)
	public String saveAccCart(Model model,
			@RequestParam(value = "qty") int qty, @ModelAttribute Cart cart,
			@RequestParam long total, @RequestParam String id,
			HttpServletRequest request) {
		session = request.getSession();
		System.out.println("values" + qty + "" + total);
		System.out.println("name " + session.getAttribute("id"));
		Registration reg = (Registration) session.getAttribute("reg");
		
		session.getAttribute("email");
		System.out.println("session id" + reg);
		String regid = reg.getRegistrationId();
		System.out.println("session regid" + regid);

		List<AccessoriesStock> Aclist = service.getAccessoriesId();
		for (AccessoriesStock AC : Aclist) {
			System.out.println("in for ");
			System.out.println("get Accessoriesid" + AC.getPartId());
			if (AC.getPartId().equals(id)) {
				model.addAttribute("data", AC);
				cart.setAccessories(AC);
				cart.setQty(qty);
				cart.setTotalprice(total);
				cart.setRegistration(reg);
				long result = (AC.getPartQuantity());
				System.out.println("db qty" + result);

				if (result > qty) {

					System.out.println("in result>qty");

					Cart c = service.saveCart(cart);
					String reiid = c.getRegistration().getRegistrationId();
					System.out.println("db regid"
							+ c.getRegistration().getRegistrationId());
					{
						if ((reiid).equals(reg.getRegistrationId())) {
							System.out.println("save cart if");

							cartPage(model, request);
						}
					}
		
				} else {

					model.addAttribute("msg",
							"stock is not sufficient please enter less quantity");

					model.addAttribute("link", "cart.jsp");
					return "Dealer/dealerIndex";

				}
			}

		}
		model.addAttribute("link", "MyCart.jsp");
		return "Dealer/dealerIndex";
	}

	@RequestMapping(value = "/Accessories")
	public String Accessories(Model model) {
		List<AccessoriesStock> accessorieslist = service.getAllAccessories();

		model.addAttribute("list", accessorieslist);
		System.out.println("Accessories hits...........");
		model.addAttribute("link", "Accessories.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";

	}
	
	@RequestMapping(value="/saveoldBike")
	 public String saveoldBike(@RequestParam String oldBikeModelName , @RequestParam MultipartFile bikeImage , HttpServletRequest request) throws IOException {
		 
		 
		 //save image
		 
		 //step 1 : set folder location
		 String foldername = request.getServletContext().getRealPath("Resources/images/bikeImages");
	 
		 //step 2 : set image file to that folder location
		 Path path = Paths.get(foldername, bikeImage.getOriginalFilename());
		
		 
		 //step 3 : write the image file
		 Files.write(path, bikeImage.getBytes());
		 
		 
		 //step 4 : store image name in DB
		 OldBikeStock old=new OldBikeStock();
		 
		 String oldBId=service.getOldBikeCount();
		 old.setOldBikeStockId(oldBId);
		 old.setOldBikeModelName(oldBikeModelName);
		 old.setBikeImage(bikeImage.getOriginalFilename());
		 service.saveOldBike(old);
		// service.saveStudent(old);
		  
		 
		 return "AddOldBike";
		 
		 
		 
	 }
	
	/*@ author Hemant Jadhav this method is to add old bike in cart*/
	@RequestMapping(value="/addcart2",method=RequestMethod.GET)
	public String saveOldBikeToCart(Model model,@RequestParam(value="id") String id, @ModelAttribute Cart cart  ) {
		System.out.println("in home controller addcart2"+id);
		System.out.println("quantity And Total"+cart.getQty());
		System.out.println("cart");
		List<OldBikeStock> oblist=service.getOldBikeId();
		for(OldBikeStock OB:oblist){
			System.out.println("in for"+OB);
			System.out.println("get AccId"+OB.getOldBikeStockId());
			if((OB.getOldBikeStockId()).equals(id)){
				System.out.println("in if");
			  model.addAttribute("data", OB);
			  
		System.out.println("dashboard hits...........");
		model.addAttribute("link","cart2.jsp");
			}
		
		}
		
		return "Dealer/dealerIndex";
	}

	/*@ author Hemant Jadhav method is to saved old bike in cart */
	@RequestMapping(value="/savecart2",method=RequestMethod.POST)
	public String saveOldBikeCart(Model model,@RequestParam(value="qty") int qty,@ModelAttribute Cart cart,@RequestParam long total,@RequestParam String id,HttpServletRequest request) {
		System.out.println("values"+qty+""+total);
		session = request.getSession();
		System.out.println("name " + session.getAttribute("id"));
		Registration reg = (Registration) session.getAttribute("reg");
		session.getAttribute("email");
		System.out.println("session id" + reg);
		String regid = reg.getRegistrationId();
		System.out.println("session regid" + regid);
		List<OldBikeStock> oblist=service.getOldBikeId();
		for(OldBikeStock OB:oblist){
		System.out.println("in for ");
		System.out.println("get Accessoriesid"+OB.getOldBikeStockId());
		if(OB.getOldBikeStockId().equals(id)){
			 model.addAttribute("data", OB);
			 cart.setOldbike(OB);
			 cart.setQty(qty);
			 cart.setTotalprice(total);
			 cart.setRegistration(reg);
			 Cart c = service.saveCart(cart);
			String reiid = c.getRegistration().getRegistrationId();
				System.out.println("db regid"
						+ c.getRegistration().getRegistrationId());
				{
					if (c.getRegistration() != null) {
						
					}
					if ((reiid).equals(reg.getRegistrationId())) {
						System.out.println("save cart if");

						cartPage(model, request);
					}
				}
			}
				
					
				}
		model.addAttribute("link", "MyCart.jsp");
		return "Dealer/dealerIndex";
				
			}
	//@author Sonika takalkar this method is to show old bike 
	@RequestMapping(value="/OldBike")
	public String OldBike(Model model){
		List<BikeModel> bikeList = service.getAllBikes();

		model.addAttribute("list", bikeList);
		System.out.println("oldbike hits...........");   
		model.addAttribute("link","OldBike.jsp");
		System.out.println("final");
		return "Dealer/dealerIndex";
	}

	//@author Shital  Belokar this method is to show specification of selected bikemodel 
		@RequestMapping(value="/quickview1",method=RequestMethod.GET)
		public String quickViewofBike(Model model, @RequestParam String oldBikeStockId)
		{
			System.out.println("in qickview controller..."+oldBikeStockId);
			List<OldBikeStock>list= service.getAllOldBike();
			for(OldBikeStock b:list)
			{
				System.out.println(b.getOldBikeStockId());
			
						
				if(b.getOldBikeStockId().equals(oldBikeStockId))
				{
					model.addAttribute("data", b);
					model.addAttribute("link","ol.jsp");
					return "Dealer/dealerIndex";
				}
			}
			return "Dealer/dealerIndex";
			
		}
		//@author Sonika takalkar this method is to show selected bikemodel all bikes
		@RequestMapping(value="/viewList",method=RequestMethod.GET)
		public String getOldBikeByName(Model model,@RequestParam(value="name") String name){
			System.out.println("in controller"+name);
			List<OldBikeStock>list=service.getAllBikeByOldbikemodelname(name);
			if(list.isEmpty()){
				model.addAttribute("link", "Ooops.jsp");
			}
			else{
			model.addAttribute("data", list);
			model.addAttribute("link", "success.jsp");
			System.out.println("final----");
			
			}	
			return "Dealer/dealerIndex";
		}
/* @ author shital belokar this method*/
		@RequestMapping("/status")
		public String checkStatus(Model model,HttpServletRequest request){
			System.out.println("in check status");
			session=request.getSession();
			Registration reg = (Registration) session.getAttribute("reg");
			session.getAttribute("email");
			System.out.println("session id" + reg);
			List<Cart> cartlist = service.getAllCart();
			long sum=0;
			for (Cart c : cartlist) {
				if (c.getRegistration() != null) {
					String reiid = c.getRegistration().getRegistrationId();
					System.out.println("db regid"
							+ c.getRegistration().getRegistrationId());
					if ((reiid).equals(reg.getRegistrationId())) {
						System.out.println("save cart if");

						if (c.getRegistration().getRegistrationId().equals(reiid))
							 {
							    c.setRegistration(reg);
								c.setPurchaseStatus("sold");
								Cart c1 = service.saveCart(c);
							 }
						}
					}
			}
			cartPage(model, request);
			model.addAttribute("link", "MyCart.jsp");
			return "Dealer/dealerIndex";
			
		}
		
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		System.out.println("logout()");

		HttpSession httpSession = request.getSession();
		httpSession.invalidate();

		return "home";
	}
}