package com.app.extremity.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.NotificationInterface;

import com.app.extremity.model.AddAccessories;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeSaleForUser;
import com.app.extremity.model.Color;
import com.app.extremity.model.CompanyOrderForAccessories;
import com.app.extremity.model.CompanyOrderForBike;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.EngineCapacity;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.SoldAccessories;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.serviceimpl.BikeSaleServiceImpl;
import com.app.extremity.serviceimpl.NotificationImpl;
import com.google.gson.Gson;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesSaleForUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Controller
public class SalesManagerController {
	@Autowired
	IAdminService adminservice;
	@Autowired
	BikeSaleServiceI bikeSaleService;
	@Autowired
	BikeSaleServiceImpl bikeSaleServiceImpl;
	HttpSession session;
	@Autowired
	NotificationInterface notificationInterface;
	
	static Logger logger = LogManager.getLogger(SalesManagerController.class);

	
	@RequestMapping(value = "/MyNotificationsPages")
	public String MyNotificationsPages(Model model, HttpServletRequest request) {

		session = request.getSession();

		/*// get short notification list
		model.addAttribute("inboxCount",
				notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false));
		model.addAttribute("shortInboxList", notificationInterface
				.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false));

		// get current user name
		model.addAttribute("currentUserName", session.getAttribute("currentUserName").toString());

		// get outbox notification list
		model.addAttribute("outboxList",
				notificationInterface.getMyOutboxNotfication(session.getAttribute("currentUserName").toString()));

		// get inbox notification list
		model.addAttribute("inboxList",
				notificationInterface.getMyInboxNotfication(session.getAttribute("currentUserName").toString()));
*/
		model.addAttribute("link", "myNotifications.jsp");
		return "SalesManager/salesManagerIndex";
	}
	
	
	@RequestMapping(value="/marks")    
	public @ResponseBody String udpateNotifications(@RequestParam int notficationId){
		
		notificationInterface.markAsRead(notificationInterface.getNotficationById(notficationId));
			
		return "done";

	}
	
	
	@RequestMapping(value="/searchEmployee")    
	public @ResponseBody EmployeeDetails searchEmployees(@RequestParam String empName, HttpServletResponse response) {
		
		if(adminservice.getEmployeeDetailsByName(empName) != null) 
			return adminservice.getEmployeeDetailsByName(empName);

		return null;

	} 
	//Author:manoj joshi
	@RequestMapping("toSalesManagerHomePage")
	public String dashBoardPage(Model model, HttpServletRequest request) {
		Notfication notify = new Notfication();

		notify.setReciverImg("person3.jpg");
		notify.setReciverName("Pranay Kohad");
		notify.setReciverPost("ServiceManager");

		notify.setMessage("where are you? I need your help");

		notify.setSenderName("Prashant Pardhi");
		notify.setSenderImg("person4.jpg");
		notify.setSenderPost("Admin");

		DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");

		notify.setSendDate(LocalDateTime.now().format(dateFormat));
		notify.setSendTime(LocalDateTime.now().format(timeFormat));

		notificationInterface.saveNotfication(notify);

		session = request.getSession();
		long tscount = bikeSaleServiceImpl.getAllBikeSaleForUserCount();

		model.addAttribute("totalServiceCount", tscount);
		long account = bikeSaleServiceImpl.getAllOldBikeStockCount();
		model.addAttribute("approvedCustomizationCount", account);
		long tccount = bikeSaleServiceImpl.getAllDeadStockCount();
		model.addAttribute("totalCustomizationCount", tccount);

 		long tscount1 = bikeSaleServiceImpl.getAllSoldBikeSaleForUSerCount();
		model.addAttribute("totalServiceCount1", tscount);
		long account2 = bikeSaleServiceImpl.getAllSoldOldBikeCount();
		model.addAttribute("approvedCustomizationCount2", account);
		long tccount3 = bikeSaleServiceImpl.getAllCompanyOrderBikeCount();
		model.addAttribute("totalCustomizationCount3", tccount);
		
		model.addAttribute("link", "salesManagerDashboard.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value="/searchEmployees")    
	public @ResponseBody EmployeeDetails searchEmployee(@RequestParam String empName, HttpServletResponse response) {
		
		if(adminservice.getEmployeeDetailsByName(empName) != null) 
			return adminservice.getEmployeeDetailsByName(empName);

		return null;

	}
	//Author:manoj joshi
	@RequestMapping(value="/sendNotifications")    
	public @ResponseBody String sendNotification(@RequestParam String reciverName, @RequestParam String reciverPost,
												 @RequestParam String reciverImg, @RequestParam String message) {

		
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
	// this method is used to add new bike model details with image in table
	// bike_model
	//Author:manoj joshi
	@RequestMapping(value = "/saveNewBikeModel", method = RequestMethod.POST)
	public String addNewBikeModel(@ModelAttribute BikeModel bikeModel1, @ModelAttribute Color color,
			@ModelAttribute EngineCapacity engCap, @RequestParam String bikeModel, @RequestParam String bikeColor,
			@RequestParam String bikeEngine, @RequestParam("profilePic") MultipartFile profilePic, Model model) {
		System.out.println("In add new bike...");
		// for autogenerate string id
		int bmcount = bikeSaleService.getBikeModelCount();

		System.out.println("result from getBikeModelCount()" + bmcount);
		String bikeModelCnt = "BMID00";
		bmcount++;
		bikeModelCnt = bikeModelCnt + Integer.toString(bmcount);
		System.out.println("generated bikemodel id" + bikeModelCnt);

		// for engine cap
		int eccount = bikeSaleService.getEngineCapacityCount();
		System.out.println("Result from Engine Capacity Count" + eccount);
		String engCnt = "BECID00";
		eccount++;
		engCnt = engCnt + Integer.toString(eccount);
		System.out.println("generated EngineCap id" + engCnt);

		bikeModel1.setBikeModelId(bikeModelCnt);
		engCap.setEngineCapacityId(engCnt);

		engCap.setEngineType(bikeEngine);
		bikeModel1.setEnginecapacity(engCap);
		bikeModel1.setModelName(bikeModel);

		String bkClr = bikeSaleService.getBikeColor();
		System.out.println(bkClr);
		color.setColorName(bikeColor);
		color.setColorId(bkClr);
		bikeModel1.getColor().add(color);

		bikeSaleService.addNewBikeModel(bikeModel1, color, engCap, profilePic);
		model.addAttribute("link", "AddNewBike.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/AddnewBike")
	public String AddNewBikeForm(Model model) {
		System.out.println("in new bike form");
		model.addAttribute("link", "AddNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/AddAccessories")
	public String AddNewAccessoriesForm(Model model) {

		System.out.println("in new accessories form");
		model.addAttribute("link", "AddAccessoriesForm.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/addaccessories")
	public String Addaccessories(@ModelAttribute AddAccessories addAccessories, @RequestParam String bikeModel,
			Model model, @RequestParam String accessoriesType) {
		String accid = bikeSaleService.getAddAccessoriesId();
		addAccessories.setAccId(accid);
		addAccessories.setBikeModelName(bikeModel);
		addAccessories.setAccType(accessoriesType);
		AddAccessories aa = bikeSaleService.SaveAddAccessories(addAccessories);
		model.addAttribute("link", "AddAccessoriesForm.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/Offers")
	public String Offer(@ModelAttribute BikeOffer bikeoffer, Model model) {
		// BikeOffer bf = bikeSaleService.SaveOffer(bikeoffer);
		model.addAttribute("link", "Offers.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/BikeOffers")
	public String Offers(@ModelAttribute BikeOffer bikeoffer, Model model) {
		BikeOffer bf = bikeSaleService.SaveOffer(bikeoffer);
		model.addAttribute("link", "Offers.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/OrderNewBike", method = RequestMethod.POST)
	public String CompanyOrderForBike(@ModelAttribute CompanyOrderForBike companyOrderForBike,
			@ModelAttribute BikeModel bikemodel, @ModelAttribute Color color, Date orderDate, Model model) {
		String companyOrderForBikeId = bikeSaleService.getCompanyOrderForBike();
		System.out.println(companyOrderForBikeId);
		companyOrderForBike.setCompanyOrderForBikeId(companyOrderForBikeId);
		companyOrderForBike.setBikeModel(bikemodel);
		// companyOrderForBike.setOrderDate(orderDate);
		CompanyOrderForBike order = bikeSaleService.saveOrderToCompanyBike(companyOrderForBike);
		model.addAttribute("link", "OrderToCompanyForNewBike.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/OrderBikeCompany")
	public String CompanyOrderForBike(@ModelAttribute CompanyOrderForBike companyOrderForBike,
			@RequestParam String date, @RequestParam String engineType, @RequestParam String qty,
			@RequestParam String modelName, @ModelAttribute BikeModel bikemodel1, @ModelAttribute EngineCapacity engCap,
			@ModelAttribute Color color, Model model) {
		System.out.println("in orderbike");

		System.out.println(engineType);
		System.out.println(qty);
		String companyOrderForBikeId = bikeSaleService.getCompanyOrderForBike();
		System.out.println(companyOrderForBikeId);
		companyOrderForBike.setCompanyOrderForBikeId(companyOrderForBikeId);
		System.out.println(modelName);

		bikemodel1.setBikeModelId(modelName);

		BikeModel bkm = bikeSaleService.getOneBikeData(modelName);

		bikemodel1.setModelName(modelName);
		System.out.println(bikemodel1);
		companyOrderForBike.setQuantity(qty);
		companyOrderForBike.setBikeModel(bkm);
		companyOrderForBike.setDate(date);
		// companyOrderForBike.setBikemodel(bikemodel1);
		CompanyOrderForBike order = bikeSaleService.saveOrderToCompanyBike(companyOrderForBike);
		model.addAttribute("link", "OrderToCompanyForNewBike.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/DeadAccessories")
	public String DeadAccessories(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "DeadAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/DeadBike")
	public String DeadBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "DeadBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewOldBike")
	public String ViewOldBikeStock(@ModelAttribute OldBikeStock oldBikeStock, Model model) {

		List<OldBikeStock> old = bikeSaleService.getOldBikeStock(oldBikeStock);
		System.out.println("This is viewOldBike" + old);
		model.addAttribute("old", old);
		model.addAttribute("link", "ViewOldBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewOrderBike")
	public String ViewNewBike(@ModelAttribute CompanyOrderForBike companyOrderForBike, Model model) {

		List<CompanyOrderForBike> cofb = bikeSaleService.getOrderBike(companyOrderForBike);
		System.out.println("This is view offer" + cofb);
		model.addAttribute("order", cofb);
		model.addAttribute("link", "ViewOrderBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewOrderAccessories")
	public String ViewAccessories(@ModelAttribute CompanyOrderForAccessories companyOrderForAccessories, Model model) {

		List<CompanyOrderForAccessories> cofa = bikeSaleService.getOrderBike(companyOrderForAccessories);
		System.out.println("This is orderAccessories" + cofa);
		model.addAttribute("cofa", cofa);

		model.addAttribute("link", "ViewOrderAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewInvoice")
	public String ViewInvoice(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewInvoice.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewBikeSaleForUser")
	public String ViewBikeSaleForUser(@ModelAttribute BikeSaleForUser bikeSaleForUser, Model model) {
		System.out.println("view Bike Sale");
		List<BikeSaleForUser> saleForUser = bikeSaleService.getAllBikeSaleForUser();
		System.out.println(saleForUser);
		model.addAttribute("saleForUser", saleForUser);
		model.addAttribute("link", "ViewBikeSaleForUser.jsp");

		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewAccessoriesSaleForUser")
	public String ViewAccessoriesSaleForUser(@ModelAttribute AccessoriesSaleForUser accessoriesSaleForUser,
			Model model) {

		System.out.println("in AccessoriesSaleForUser");
		List<AccessoriesSaleForUser> accessoriesSaleForUsers = bikeSaleService
				.displayAllAccessoriesSaleForUser(accessoriesSaleForUser);
		model.addAttribute("accessoriesSaleForUsers", accessoriesSaleForUsers);
		model.addAttribute("link", "ViewAccessoriesSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewOffer")
	public String ViewOffer(@ModelAttribute BikeOffer bikeoffer, Model model) {

		System.out.println("in order");

		List<BikeOffer> bikeoffers = bikeSaleService.displayAll(bikeoffer);
		System.out.println("This is view offer" + bikeoffers);
		model.addAttribute("bikeoffers", bikeoffers);
		model.addAttribute("link", "ViewOffer.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/BikeSaleForUser")
	public String BikesaleForUser(Model model) {

		System.out.println("in order");
		List<BikeModel> list = bikeSaleService.getAllBike();
		model.addAttribute("data", list);
		model.addAttribute("link", "BikeSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/AccessoriesSaleForUser")
	public String AccessoriesSaleForUser(Model model) {

		System.out.println("in order");
		List<BikeModel> List = bikeSaleService.getAllBike();
		model.addAttribute("data", List);
		model.addAttribute("link", "AccessoriesSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewSoldAccessories")
	public String ViewSoldAccessories(@ModelAttribute SoldAccessories soldAccessories, Model model) {

		System.out.println("in order");
		List<SoldAccessories> soldAccessoriess = bikeSaleService.displayAllSoldAccessories(soldAccessories);
		System.out.println("This is viewSoldAccessories" + soldAccessoriess);
		model.addAttribute("soldAccessoriess", soldAccessoriess);
		model.addAttribute("link", "ViewSoldAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewSoldNewBike")
	public String ViewSoldNewBike(@ModelAttribute SoldBikeStock soldBikeStock, Model model) {

		System.out.println("in order");
		List<SoldBikeStock> SoldBikeStocks = bikeSaleService.displayAllSoldBikeStock(soldBikeStock);
		System.out.println("This is ViewSoldBikeStocks" + SoldBikeStocks);
		model.addAttribute("SoldBikeStocks", SoldBikeStocks);
		model.addAttribute("link", "ViewSoldNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewSoldOldBike")
	public String ViewSoldOldBikeStock(@ModelAttribute SoldOldBikeStock soldOldBikeStock, Model model) {
		List<SoldOldBikeStock> solds = bikeSaleService.getOldSoldBike(soldOldBikeStock);
		System.out.println("This is sold old Bike" + solds);
		model.addAttribute("sold", solds);
		System.out.println("in sold");
		model.addAttribute("link", "ViewSoldOldBike.jsp");
		return "SalesManager/salesManagerIndex";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewDeadStockAccessories")
	public String ViewDeadStockAccessories(@ModelAttribute AccessoriesDeadStock accessoriesDeadStock, Model model) {

		// System.out.println("in order");
		List<AccessoriesDeadStock> accessoriesDeadStock1 = bikeSaleService.getAllDeadStockAccessories();

		model.addAttribute("accessoriesDeadStock1", accessoriesDeadStock1);

		model.addAttribute("link", "ViewAccessoriesDeadStock.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/ViewDeadStockBike")
	public String ViewDeadStockBike(Model model) {

		System.out.println("in order");
		model.addAttribute("link", "ViewBikeDeadStock.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/OrderToCompanyForNewAccessories")
	public String OrderToCompanyForNewAccessories(Model model) {

		System.out.println("in order");

		List<AddAccessories> list = bikeSaleService.getAllAccessoriesData();
		model.addAttribute("data", list);
		model.addAttribute("link", "OrderToCompanyForNewAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/OrderToCompanyForNewBike")
	public String OrderToCompanyForNewBike(Model model) {

		System.out.println("in order");
		List<BikeModel> list = bikeSaleService.getAllBike();
		model.addAttribute("data", list);
		model.addAttribute("link", "OrderToCompanyForNewBike.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/getbikeengine", produces = "application/json")
	public @ResponseBody String getBikeType(@RequestParam String bikeid, HttpServletResponse response)
			throws IOException {
		System.out.println(bikeid);

		BikeModel bikeModel = bikeSaleService.getOneBikeData(bikeid);
		System.out.println("getting data" + bikeModel.getEnginecapacity().getEngineCapacityId());
		String getType = bikeModel.getEnginecapacity().getEngineType();
		String json = new Gson().toJson(getType);
		System.out.println("listtttttttt" + bikeModel);
		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream();

		return json;
	}
	//Author:manoj joshi
	@RequestMapping(value = "/getbikecolor", produces = "application/json")
	public @ResponseBody String getBikeColor(@RequestParam String bikeid, HttpServletResponse response)
			throws IOException {
		System.out.println(bikeid);

		BikeModel bikeModel = bikeSaleService.getOneBikeData(bikeid);
		System.out.println("getting data" + bikeModel.getColor().toString());
		// Set<Color> getType=bikeModel.getColor().;
		String json = new Gson().toJson(bikeModel.getColor());
		System.out.println("listtttttttt" + bikeModel);
		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream();

		return json;
	}
	//Author:manoj joshi
	@RequestMapping(value = "/OrderAccessories")
	public String SaveOrderAccessories(@ModelAttribute CompanyOrderForAccessories cmpnyo,
			@RequestParam String bikeModelName, @RequestParam String accType, @RequestParam String qty,
			@RequestParam String date, Model model) {
		System.out.println(bikeModelName);

		AddAccessories acc = bikeSaleService.getBikeName(bikeModelName);
		System.out.println(acc.getBikeModelName());
		System.out.println("in order accessories");
		String CompanyId = bikeSaleService.getCompanyOrderForAccessoriesId();
		cmpnyo.setCompanyOrderForAccessoriesId(CompanyId);
		cmpnyo.setBikeModelName(acc.getBikeModelName());
		cmpnyo.setAccType(accType);
		cmpnyo.setOrderDate(date);
		cmpnyo.setQuantity(qty);
		bikeSaleService.saveAccessoriesOrder(cmpnyo);
		model.addAttribute("link", "OrderToCompanyForNewAccessories.jsp");
		return "SalesManager/salesManagerIndex";

	}
	//Author:manoj joshi
	@RequestMapping(value = "/getbikeaccessories", produces = "application/json")
	public @ResponseBody String getBikeAccessories(@RequestParam String bikeid, HttpServletResponse response)
			throws IOException {
		System.out.println(bikeid);

		AddAccessories addAccessories = bikeSaleService.getOneAccessories(bikeid);

		String getType = addAccessories.getAccType();
		String json = new Gson().toJson(getType);

		System.out.println(json);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getOutputStream();

		return json;
	}

	// Bike Sale For User Code
	//Author:manoj joshi
	@RequestMapping(value = "/BikeSaleToUser", method = RequestMethod.POST)
	public String saveBikeSaleForUser(@ModelAttribute BikeSaleForUser bikesaletouser,
			@ModelAttribute BikeModel bikemodel, @RequestParam String date,
			@RequestParam("profilePic") MultipartFile profilePic, @RequestParam String modelName,
			@RequestParam String engineType, @RequestParam String colorName, @RequestParam String bikewheel,
			@RequestParam String mileage, @RequestParam String noOfGears, @RequestParam String tyreType,
			@RequestParam String showroomPrice, @RequestParam String bikeOnRoadPrice,
			@RequestParam String engineStartingType, @RequestParam String quantity, Model model) throws Exception {
		System.out.println("in save Bike sale for user...");
		// for Autogenerating string id
		String bsfCnt = bikeSaleService.getBikeSaleForUserID();
		System.out.println(bsfCnt);
		bikesaletouser.setBikeSaleForUserId(bsfCnt);

		BikeModel bkm = bikeSaleService.getOneBikeData(modelName);

		bkm.getModelName();
		// System.out.println(name);
		bikesaletouser.setBikemodel(bkm);
		bikesaletouser.setShowroomPrice(showroomPrice);
		bikesaletouser.setBikeOnRoadPrice(bikeOnRoadPrice);
		bikesaletouser.setBikewheel(bikewheel);

		// String dates=date;
		// Date datechnge=new SimpleDateFormat("dd/MM/yyyy").parse(dates);
		bikesaletouser.setDate(date);
		bikesaletouser.setEngineStartingType(engineStartingType);
		bikesaletouser.setNoOfGears(noOfGears);
		bikesaletouser.setTyreType(tyreType);
		bikesaletouser.setQuantity(quantity);

		bikeSaleService.SaveBikeSale(bikesaletouser, profilePic);// , profilePic
		model.addAttribute("link", "BikeSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";

	}

	// Sale Accessories code
	//Author:manoj joshi
	@RequestMapping(value = "/accessoriesSaleForUser", method = RequestMethod.POST)
	public String saleAccessoriesForUser(@ModelAttribute AccessoriesSaleForUser accSaleForUser,
			@RequestParam String modelName, @RequestParam String engineType, @RequestParam String colorName,
			@RequestParam("profilePic") MultipartFile profilePic, @RequestParam String partNames,
			@RequestParam String partPrices, @RequestParam String withGstPartPrices, @RequestParam String partQuantitys,
			@RequestParam String Date, Model model) {

		System.out.println("accessories for sale");
		String accid = bikeSaleService.getAccessoriesSaleForUserID();

		accSaleForUser.setAccessoriesSaleForUserId(accid);
		System.out.println(modelName);
		BikeModel bikeId = bikeSaleService.getOneBikeData(modelName);
		System.out.println(bikeId.getBikeModelId());

		accSaleForUser.setBikeModel(bikeId);
		accSaleForUser.setDate(Date);
		accSaleForUser.setPartNames(partNames);
		accSaleForUser.setPartPrices(partPrices);
		accSaleForUser.setPartQuantitys(partQuantitys);
		accSaleForUser.setWithGstPartPrices(withGstPartPrices);
		bikeSaleService.SaveAccessoriesSale(accSaleForUser, profilePic);
		model.addAttribute("link", "AccessoriesSaleForUser.jsp");
		return "SalesManager/salesManagerIndex";
	}

}
