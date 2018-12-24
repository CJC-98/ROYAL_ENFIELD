package com.app.extremity.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.SoldAccessories;
import com.app.extremity.model.SoldBikeStock;


import com.app.extremity.model.SoldOldBikeStock;


import com.app.extremity.model.TestDriveCustomer;



@Controller

/* @RequestMapping(value="/admin") */

public class AdminController {

	@Autowired
	IAdminService adminService;

	/*
	 * this method is for showing admin home page
	 */

	@RequestMapping(value = "/toAdminHomePage")
	public String toadminDashboard(Model model) {
		model.addAttribute("link", "adminDashboard.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/composeMail")
	public String toComposeMailPage(Model model,@RequestParam int designation) {
		model.addAttribute("designationId", designation);
		model.addAttribute("link", "composeMail.jsp");
		
		System.out.println(designation);
		return "Admin/adminIndex";
	}
	/*
	 * this method is used to send Email to employee With Registration Link
	 * 
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage emailmessage, @RequestParam("attachment") MultipartFile file,
			Model model,@RequestParam String designation) {
		
		System.out.println(emailmessage.getTo_address());
		System.out.println(emailmessage.getSubject());
		adminService.sendEmail(emailmessage, file,designation);
		model.addAttribute("link", "adminDashboard.jsp");
		return "Admin/adminIndex";
	}

	/*
	 * this method is used for Employee Registration Page
	 * 
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/employeeRegistration")
	public String toEmployeeRegistrationPage(@RequestParam int designation,Model model) {
		System.out.println(designation);
		model.addAttribute("designation", designation);
		return "Admin/employeeRegistration";
	}

	/*
	 * this method is used to save Employee Details
	 * 
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String createEmployee(@ModelAttribute EmployeeDetails employeeDetails,
			@RequestParam("profilePic") MultipartFile profilePic, Model model) {

		adminService.saveEmployee(employeeDetails, profilePic);
		return "login";
	}


	/*
	 * this method is used to newBikeStockList Details
	 * 
	 * author: omprakash nagolkar
	 */
	@RequestMapping(value = "/newBikeStock")
	public String getNewBikeStock(Model model) {
		List<NewBikeStock> newBikeStockList = adminService.getNewBikeStock();
		
		model.addAttribute("newBikeStockList", newBikeStockList);
		model.addAttribute("link", "newBikeStock.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/oldBikeStock")
	public String getOldBikeStock(Model model) {
		List<OldBikeStock> oldBikeStockList = adminService.getOldBikeStock();
		model.addAttribute("oldBikeStockList", oldBikeStockList);
		model.addAttribute("link", "oldBikeStock.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/deadBikeStock")
	public String getDeadStock(Model model) {

		List<DeadStock> deadStockList = adminService.getDeadStock();

		model.addAttribute("deadStockList", deadStockList);
		model.addAttribute("link", "deadBikeStock.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/accessoriesStock")
	public String getAccessoriesStock(Model model) {
		List<AccessoriesStock> accessoriesStockList = adminService.getAccessoriesStock();
		model.addAttribute("accessoriesStockList", accessoriesStockList);
		model.addAttribute("link", "accessoriesStock.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/accessoriesDeadStock")
	public String getAccessoriesDeadStock(Model model) {
		List<AccessoriesDeadStock> accessoriesDeadStockList = adminService.getAccessoriesDeadStock();
		model.addAttribute("accessoriesDeadStockList", accessoriesDeadStockList);
		System.out.println(accessoriesDeadStockList);
		model.addAttribute("link", "accessoriesDeadStock.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping(value = "/employeeList")
	public String getEmployeeList(Model model) {
		System.out.println("Employee_List");
		List<EmployeeDetails> employeeList =adminService.getEmployeelist();
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("link", "employeeList.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/bikeOffer")
	public String getbikeOffer(Model model) {
		List<BikeOffer> bikeOfferList = adminService.getBikeOffer();

		model.addAttribute("bikeOfferList", bikeOfferList);
		model.addAttribute("link", "bikeOffer.jsp");
		return "Admin/adminIndex";

	}
	/* this method is use for getCustomizationInvoice details */
	@RequestMapping(value = "/servicingAndCustomizationInvoice")
	public String getCustomizationInvoice(Model model)
	{
		List<CustomizationInvoice> customizationInvoiceList = adminService.getCustomizationInvoice();
		model.addAttribute("customizationInvoiceList", customizationInvoiceList);
		model.addAttribute("link", "servicingAndCustomizationInvoice.jsp");
		return "Admin/adminIndex";

	}

	/* this method is use for getServcingBikeInfo details */

	@RequestMapping(value = "/servicingBikeInfo")
	public String getServcingBikeInfo(Model model) {
		List<ServcingBikeInfo> servcingBikeInfoList = adminService.getServcingBikeInfo();
		model.addAttribute("servcingBikeInfoList", servcingBikeInfoList);
		model.addAttribute("link", "servicingBikeInfo.jsp");
		return "Admin/adminIndex";

	}

	/* this method is use for getTestDriveCustomer details */
	@RequestMapping(value = "/testDriveCustomer")
	public String getTestDriveCustomer(Model model) {
		System.out.println("In Test Drive");
		List<TestDriveCustomer> testDriveCustomerList = adminService.getTestDriveCustomer();
		model.addAttribute("testDriveCustomerList", testDriveCustomerList);
		model.addAttribute("link", "testDriveCustomer.jsp");
		return "Admin/adminIndex";

	}

	
	@RequestMapping(value = "/soldNewBike")
	public String getSoldBikeStockInfo(Model model) 
	{
		System.out.println("In Sold New Bike");
		List<SoldBikeStock> soldNewBikeInfoList = adminService.getSoldBikeStockInfo();
		model.addAttribute("soldNewBikeInfoList", soldNewBikeInfoList);
		model.addAttribute("link", "soldNewBike.jsp");
		return "Admin/adminIndex";

	}

	@RequestMapping(value = "/soldOldBike")
	public String getSoldOldBikeInfo(Model model) 
	{
		System.out.println("In Sold Old Bike");
		List<SoldOldBikeStock> soldOldBikeInfoList = adminService.getSoldOldBike();
		model.addAttribute("soldOldBikeInfoList", soldOldBikeInfoList);
		model.addAttribute("link", "soldOldBike.jsp");
		return "Admin/adminIndex";

	}
	@RequestMapping(value = "/soldAccessories")
	public String getSoldAccessoriesInfo(Model model) {
		List<SoldAccessories> soldAccessoriesInfoList = adminService.getSoldAccessoriesInfo();
		model.addAttribute("soldAccessoriesInfoList", soldAccessoriesInfoList);
		model.addAttribute("link", "soldAccessories.jsp");
		return "Admin/adminIndex";

	}
	
	@RequestMapping(value = "/avaliableServicing")
	public String getAvaliableServicingInfo(Model model) {
		List<AvailableServicing> avaliableServicingInfoList = adminService.getavaliableServicing();
		model.addAttribute("avaliableServicingInfoList", avaliableServicingInfoList);
		model.addAttribute("link", "avaliableServicing.jsp");
		return "Admin/adminIndex";

	}
	@RequestMapping(value = "/bikeCustomization")
	public String getBikeCustomizationInfo(Model model) {
		List<BikeCustomization> bikeCustomizationInfoList = adminService.getbikeCustomization();
		model.addAttribute("bikeCustomizationInfoList", bikeCustomizationInfoList);
		model.addAttribute("link", "bikeCustomization.jsp");
		return "Admin/adminIndex";

	}
	@RequestMapping(value = "/bikeServicing")
	public String getBikeServicingInfo(Model model) {
		List<BikeServicing> bikeServicingInfoList = adminService.getBikeServicing();
		model.addAttribute("bikeServicingInfoList", bikeServicingInfoList);
		model.addAttribute("link", "bikeServicing.jsp");
		return "Admin/adminIndex";

	}
	
	@RequestMapping(value = "/updateEmployee")
	public String getUpdateEmployeeInfo(@ModelAttribute EmployeeDetails employee ,Model model) {
		System.out.println(employee);
		System.out.println(employee.getEmployeeId());
		adminService.updateEmployee(employee);
		List<EmployeeDetails> employeeList =adminService.getEmployeelist();
		model.addAttribute("employeeList", employeeList);
		model.addAttribute("link", "employeeList.jsp");
		return "Admin/adminIndex";
		
		

	}
	


}
