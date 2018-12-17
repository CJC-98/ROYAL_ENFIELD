package com.app.extremity.controller;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.SoldBikeStock;




@Controller
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	

	/*this method is used to send Email to employee With Registration Link
	 * 
	 *  author: Nilesh Tammewar
	 * */
	@RequestMapping("/adminDashboard")
	public String toAdminDashboardPage(Model model)
	{
		System.out.println(" in todashboard");
		model.addAttribute("link","adminDashboard.jsp");
		return "Admin/adminIndex";
	}

	@RequestMapping("/accessoriesDeadStock")
	public String toAccessoriesDeadStockPage(Model model)
	{
		System.out.println(" in toaccessoriesDeadStock");
		model.addAttribute("link","accessoriesDeadStock.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/accessoriesStock")
	public String toAccessoriesStockPage(Model model)
	{
		System.out.println("In AccessoriesStock");
		model.addAttribute("link","accessoriesStock.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/avaliableServicing")
	public String toAvaliableServicingPage(Model model)
	{
		System.out.println("In AvaliableServicing");
		model.addAttribute("link","avaliableServicing.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/bikeCustomization")
	public String toBikeCustomizationPage(Model model)
	{
		System.out.println("In BikeCustomization");
		model.addAttribute("link","bikeCustomization.jsp");
		return "Admin/adminIndex";
	}
	
	
	@RequestMapping("/bikeOffer")
	public String toBikeOfferPage(Model model)
	{
		System.out.println("In BikeOffer");
		model.addAttribute("link","bikeOffer.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/bikeSalesForUser")
	public String toBikeSalesForUserPage(Model model)
	{
		System.out.println("In BikeSalesForUser");
		model.addAttribute("link","bikeSalesForUser.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/bikeServicing")
	public String toBikeServicingPage(Model model)
	{
		System.out.println("In BikeServicing");
		model.addAttribute("link","bikeServicing.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/customizationBikeInfo")
	public String toCustomizationBikeInfoPage(Model model)
	{
		System.out.println("In CustomizationBikeInfo");
		model.addAttribute("link","customizationBikeInfo.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/deadBikeStock")
	public String toDeadBikeStockPage(Model model)
	{
		System.out.println("In DeadBikeStock");
		model.addAttribute("link","deadBikeStock.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/employeeList")
	public String toEmployeeListPage(Model model)
	{
		System.out.println("In EmployeeList");
		model.addAttribute("link","employeeList.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/freeServicingCount")
	public String toFreeServicingCountPage(Model model)
	{
		System.out.println("In FreeServicingCount");
		model.addAttribute("link","freeServicingCount.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/composeMail")
	public String toComposeMailPage(Model model)
	{
		System.out.println("In ComposeMail");
		model.addAttribute("link","composeMail.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/newBikeStock")
	public String toNewBikeStockPage(Model model)
	{
		System.out.println("In NewBikeStock");
		model.addAttribute("link","newBikeStock.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/oldBikeStock")
	public String toOldBikeStockPage(Model model)
	{
		System.out.println("In OldBikeStock");
		model.addAttribute("link","pldBikeStock.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/quotation")
	public String toQuotationPage(Model model)
	{
		System.out.println("In Quotation");
		model.addAttribute("link","quotation.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/servicingAndCustomizationInvoice")
	public String toServicingAndCustomizationInvoicePage(Model model)
	{
		System.out.println("In Invoice");
		model.addAttribute("link","servicingAndCustomizationInvoice.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/servicingBikeInfo")
	public String toServicingBikeInfoPage(Model model)
	{
		System.out.println("In ServicingBikeInfo");
		model.addAttribute("link","servicingBikeInfo.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/soldAccessories")
	public String toSoldAccessoriesPage(Model model)
	{
		System.out.println("In SoldAccessories");
		model.addAttribute("link","soldAccessories.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/soldNewBike")
	public String toSoldNewBikePage(Model model)
	{
		System.out.println("In SoldNewBike");
		model.addAttribute("link","soldNewBike.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/soldOldBike")
	public String toSoldOldBikePage(Model model)
	{
		System.out.println("In SoldOldBike");
		model.addAttribute("link","soldOldBike.jsp");
		return "Admin/adminIndex";
	}
	
	@RequestMapping("/testDriveCustomer")
	public String toTestDriveCustomerPage(Model model)
	{
		System.out.println("In TestDriveCustomer");
		model.addAttribute("link","testDriveCustomer.jsp");
		return "Admin/adminIndex";
	}
	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage  emailmessage,@RequestParam("file") MultipartFile file) 
	{
		
		adminService.sendEmail(emailmessage,file);
		return null;
	}
	
	/*this method is used for Employee Registration Page
	 * 
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/employeeRegistration")
	public String toEmployeeRegistrationPage() {
		return "Admin/employeeRegistration";
	}
	
	/*this method is used to save Employee Details
	 * 
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String createEmployee(@ModelAttribute EmployeeDetails employeeDetails,@RequestParam("profilePic") MultipartFile profilePic,Model model) {
		
		adminService.saveEmployee(employeeDetails,profilePic);
		return "redirect:/loginPage";
	}
	
	
	
	
	
	
}
