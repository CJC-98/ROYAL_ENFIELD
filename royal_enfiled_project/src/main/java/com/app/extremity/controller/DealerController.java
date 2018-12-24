package com.app.extremity.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeModelName;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Cart;
import com.app.extremity.model.City;
import com.app.extremity.model.Contact;
import com.app.extremity.model.CustomizationBikeInfo;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
import com.app.extremity.model.State;
import com.app.extremity.exceptionHandling.CustomException;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IDealerService;
import com.app.extremity.iservice.NotificationInterface;
import com.google.gson.Gson;

@Controller
public class DealerController {

	@Autowired
	IDealerService service;

	@Autowired
	NotificationInterface notificationInterface;
	
	@Autowired
	IAdminService adminService;
	
	HttpSession session;

	@RequestMapping(value = "/DealerDashboardPage")
	public String ServicesDashboardPage(Model model) {
		
		//@RequestMapping(value="/dealerDashboard")
		

			//test data for notification
			Notfication notify = new Notfication();

			notify.setSenderName("samir");
			notify.setSenderImg("person2.png");
			notify.setSenderPost("accounts manager");

			notify.setReciverName("pranay");
			notify.setReciverImg("person1.png");
			notify.setReciverPost("service manger");

			notify.setMessage("I am leaving");

			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
			DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 

			notify.setSendDate(LocalDateTime.now().format(dateFormat));
			notify.setSendTime(LocalDateTime.now().format(timeFormat));
			 
		    //get short notification list
			model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
			model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));
		    
			

		System.out.println("dashboard hits...........");
		model.addAttribute("link", "dealerDashboard.jsp");
		return "Dealer/dealerIndex";
	}
/* @ author shital belokar this method is used for continue shopping and return on dealer dashboard*/
	@RequestMapping(value = "/continueShopping")
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
		List<AccessoriesStock>list=service.getAllAccessories();
		System.out.println(list+"in controller...");
		model.addAttribute("data", list);
		model.addAttribute("link","customization.jsp");
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
					if(!c.getPurchaseStatus().equals("buyNow")){
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
					
					
					 sum=(long) (sum+c.getTotalprice());
					 model.addAttribute("msg", sum);
					 model.addAttribute("data1", bikeCartList);
					 model.addAttribute("data2", accesseriesCartList);
					 model.addAttribute("data3", oldBikeCartList);
					 model.addAttribute("link", "MyCart.jsp");
					}
					
					else{
						model.addAttribute("link","NoItemInCart.jsp");
					}
				}

				System.out.println("dashboard hits...........");
				

			}

		}
		
		
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
		
		if(qty==0)
		{
			System.out.println("in throws exception");
			throw new CustomException("Quantity should not be Zero", "CustomException");
			
	
		}
		
		else 
		{
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
				} 
				else {

					System.out.println("in throws exception");
					throw new CustomException("stock is not sufficient plese enter less quantity", "CustomException");
					
				}
			}
			
			
		}
		}
		model.addAttribute("link", "MyCart.jsp");
		return "Dealer/dealerIndex";
	}

	
	

	//@Author =akshata yevatkar
	@RequestMapping(value="/quantity", method=RequestMethod.GET,produces="application/json")
		public @ResponseBody String getBikeAvailability(Model model,@RequestParam String modelId,@RequestParam(value="qty") int qty, HttpServletResponse re)throws IOException
		{
			System.out.println("in getbikestock()...quantity"+qty+" modelID "+modelId);
			//BikeSaleForUser bs=new BikeSaleForUser();
			//int dbs=Integer.parseInt();
			List<BikeSaleForUser> bs1list=service.getBikeId();
			System.out.println("list from controller"+bs1list);
			for(BikeSaleForUser b1:bs1list)
			{
				if(b1.getBikemodel().getModelId().equals(modelId))
				{
				System.out.println("in if --quantity--"+b1.getQuantity());
				int dbs=Integer.parseInt(b1.getQuantity());
				
				if(dbs<qty)
				 {
					 System.out.println("In if");
				//String msg= "Stock Not available";
				//model.addAttribute(msg, "msg");
				String json=new Gson().toJson("Stock Not available");	
				re.setContentType("application/json");
				re.getOutputStream();
				return json;
				}
				 else {
					 String msg="Stock is Available";
					 String json=new Gson().toJson("Stock is Available");
					 re.setContentType("application/json");
					 re.getOutputStream();
					 return json;
				 }			
				}
			}
			System.out.println("check");
			return "json";

		}
	/* @author shital belokar this method used for to delete cart items */
	@RequestMapping(value = "/deletecart", method = RequestMethod.POST)
	public String deleteCartProduct(Model model, @RequestParam int productId,
			HttpServletRequest request) {
		session = request.getSession();
		service.deleteCart(productId);
		Registration reg = (Registration) session.getAttribute("reg");
	String c=cartPage(model, request);
	if(!c.isEmpty()){
		//model.addAttribute("data", list);
		model.addAttribute("link", "MyCart.jsp");
	}
	else{
			System.out.println("in throws exception");
			throw new CustomException("Your Cart Is Empty", "CustomException");
			
		}
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
				System.out.println("in throws exception");
				throw new CustomException("Product Not Available", "CustomException");
				
			}
			else{
			model.addAttribute("data", list);
			model.addAttribute("link", "success.jsp");
			System.out.println("final----");
			
			}	
			return "Dealer/dealerIndex";
		}
/* @ author shital belokar this method is to set status after buying bike*/
		@RequestMapping("/status")
		public String checkStatus(Model model,HttpServletRequest request){
			System.out.println("in check status");
			session=request.getSession();
			Registration reg = (Registration) session.getAttribute("reg");
			session.getAttribute("email");
			System.out.println("session id" + reg);
			List<Cart> cartlist = service.getAllCart();
			
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
								c.setPurchaseStatus("buyNow");
								Cart c1 = service.saveCart(c);
							 }
						}
					}
			}
			cartPage(model, request);
			model.addAttribute("link", "dealerDashboard.jsp");
			return "Dealer/dealerIndex";
			
		}
		
		@RequestMapping(value="/sendDealerNotification")    
		public @ResponseBody String sendNotification( @RequestParam String reciverName, @RequestParam String reciverPost,
													 @RequestParam String reciverImg, @RequestParam String message,HttpServletRequest request) {

			session =request.getSession();
			Notfication notify = new Notfication();
		
			notify.setSenderName(session.getAttribute("currentUserName").toString()); 
			notify.setSenderImg(session.getAttribute("currentUserImg").toString());
			notify.setSenderPost(session.getAttribute("currentUserPost").toString());

			notify.setReciverName(reciverName);
			notify.setReciverPost(reciverPost);
			notify.setReciverImg(reciverImg);
			
			DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
			DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a"); 
			
			notify.setSendDate(LocalDateTime.now().format(dateFormat));
			notify.setSendTime(LocalDateTime.now().format(timeFormat));
			
			notify.setMessage(message);
			
			
			Notfication saveNotify = notificationInterface.saveNotfication(notify);
			
			if(saveNotify != null) {
				return "done";
			}
			
			return null;
			
		}
		
		
		
		
		@RequestMapping(value="/MyNotificationss")
		public String MyNotificationsPage(Model model,HttpServletRequest request){
			
			session = request.getSession();
			
			//get short notification list
			model.addAttribute("inboxCount", notificationInterface.getInboxCount(session.getAttribute("email").toString(), false));
			model.addAttribute("shortInboxList", notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("email").toString(), false));
				
			//get current user name
			model.addAttribute("currentUserName", session.getAttribute("email").toString());
				
			//get outbox notification list
	        model.addAttribute("outboxList", notificationInterface.getMyOutboxNotfication(session.getAttribute("email").toString()));
		
	        //get inbox notification list
	 	    model.addAttribute("inboxList", notificationInterface.getMyInboxNotfication(session.getAttribute("email").toString()));   
	 	    
			model.addAttribute("link","MyNotification.jsp");	
			return "Dealer/dealerIndex";
		}

		@RequestMapping(value="/searchEmployee")    
		public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName, HttpServletResponse response) {
			
			if(adminService.getEmployeeDetailsByName(empName) != null) 
				return adminService.getEmployeeDetailsByName(empName);

			return null;

		}
		

		
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request) {
		System.out.println("logout()");
		//session.removeAttribute("reg");
		session = request.getSession();
		session.invalidate();

		return "login";
	}
	@RequestMapping(value="/savecustomize")
	public String customizeBike(@ModelAttribute BikeCustomization bikecust, @ModelAttribute AccessoriesStock as, @ModelAttribute CustomizationBikeInfo cbi,@RequestParam String modelName,
		@ModelAttribute CustomizationInvoice cstinvc  , @ModelAttribute CustomizationChart cc,Model model, HttpServletRequest req)
	{	session=req.getSession();
	System.out.println("ModelName111"+modelName);
	Registration reg = (Registration) session.getAttribute("reg");
	System.out.println(reg);
	if(reg!=null){
	
		System.out.println("in dealer controller....");
		System.out.println("in saveCustomize");
		List<BikeModel> bikem=service.getAllBikes();
		for(BikeModel b:bikem){
			System.out.println("in  model for ");
			if(b.getModelName().equals(modelName)){
				System.out.println("in if1111");
				bikecust.setBikeModel(b);
		
			}
		}
		System.out.println(modelName);
		String appointmentDate=req.getParameter("appointmentDate");
		bikecust.setAppointmentDate(appointmentDate);
		//bc.setAccessoriesStock(accessoriesStock);
		System.out.println(appointmentDate);
		String chasisNumber=req.getParameter("chasisNumber");
		String plateNumber=req.getParameter("plateNumber");
		cbi.setChasisNumber(chasisNumber);
		cbi.setPlateNumber(plateNumber);
		//bc.setCustomizationInvoice(cstinvc);
		//to get partname and partprice from accessoriesstock table as per selected checkbox
		String id1;
		String[] id=req.getParameterValues("id");
		System.out.println(id);
		List<CustomizationChart> list=new ArrayList<CustomizationChart>();
		int i;
		
			
		for(i=0 ; i<id.length ; i++){			
			
			String partId = id[i];
			String x=(partId);
			
			AccessoriesStock as1=new AccessoriesStock();
			as1.setPartId(x);
			
			List<AccessoriesStock> l=service.getAccessoriesStock(as1);
			as.setPartId(x);
			for(AccessoriesStock as2: l)
				{
					System.out.println(as2.getPartName());
					System.out.println(as2.getPartPrice());
					
					CustomizationChart c1=new CustomizationChart();
					c1.setPart(as2.getPartName());
					c1.setCost(Long.parseLong(as2.getPartPrice()));
					
					bikecust.getCustomizationChart().add(c1);
					
					

					
					System.out.println("data saved........");
					
				}	
		
				
			String bccount=service.getAllBikeCustomizationCount();
			System.out.println(bccount);
			//bc.setAccessoriesStock(as);
			bikecust.setBikeCustomizationId(bccount);
		
			//String bikemodelcount=service.getAllBikeModelCount();
			//System.out.println(bikemodelcount);
			//bm.setModelId(bikemodelcount);
			//bikecust.setBikeModel(bm);
			bikecust.setCustomizationBikeInfo(cbi);
			service.saveCustomizationDetails(bikecust);
		}
	}
		model.addAttribute("link","dealerDashboard.jsp");
		
		
		System.out.println("in saveCustomizationController");
		return "Dealer/dealerIndex";	
		
	}
}