package com.app.extremity.controller;

import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.EngineCapacity;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.Quotation;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.State;
import com.app.extremity.model.TestDriveCustomer;




@Controller
/*@RequestMapping(value="/admin")*/
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	

	@RequestMapping(value="/composeMail")
	public String toComposeMailPage(Model model) {
		model.addAttribute("link", "composeMail.jsp");
		
		return "Admin/adminIndex";
	}
	
	
	/*this method is used to send Email to employee With Registration Link
	 * 
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage  emailmessage,@RequestParam("file") MultipartFile file) {
		System.out.println(emailmessage.getTo_address());
		System.out.println(emailmessage.getSubject());
		System.out.println(emailmessage.getBody());
		adminService.sendEmail(emailmessage,file);
		return "Admin/adminIndex";
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
	
	@RequestMapping(value="/newBikeStock")
	public String getNewBikeStock(Model model)
	{
		List<NewBikeStock> newBikeStockList=adminService.getNewBikeStock();
		model.addAttribute("newBikeStockList",newBikeStockList);
		model.addAttribute("link","newBikeStock.jsp");
		return "Admin/adminIndex";
		
	}
	/*this method is used to newBikeStockList Details
	 * 
	 *  author: omprakash nagolkar 
	 * */
	
	@RequestMapping(value="/accessoriesStock")
	public String getAccessoriesStock(Model model)
	{
		List<AccessoriesStock> accessoriesStockList=adminService.getAccessoriesStock();
		model.addAttribute("accessoriesStockList", accessoriesStockList);
		model.addAttribute("link","accessoriesStock.jsp");
		return "Admin/adminIndex";
		
	}
	/*this method is used to getAccessoriesStock Details
	 * 
	 *  author: omprakash nagolkar 
	 * */
	
   	@RequestMapping(value="/deadBikeStock")
	public String getDeadStock(Model model)
	{
		System.out.println("in controller");
		List<DeadStock> deadStockList=adminService.getDeadStock();
		System.out.println(deadStockList.get(0).getDeadBikeStock().getArrivalDate());
		model.addAttribute("deadStockList", deadStockList);
		model.addAttribute("link","deadBikeStock.jsp");
        return "Admin/adminIndex";
	}

/*this method is used to getDeadStock Details
 * 
 *  author: omprakash nagolkar 
 * */
@RequestMapping(value="/oldBikeStock")
   public String getOldBikeStock(Model model)
{
	   List<OldBikeStock> oldBikeStockList=adminService.getOldBikeStock();
	   model.addAttribute("oldBikeStockList", oldBikeStockList);
	   model.addAttribute("link","oldBikeStock.jsp");
	   return "Admin/adminIndex";
}
/*this method is used to getOldBikeStock Details
 * 
 *  author: omprakash nagolkar 
 * */
@RequestMapping(value="/accessoriesDeadStock")
public String getAccessoriesDeadStock(Model model)
{
	List<AccessoriesDeadStock> accessoriesDeadStockList=adminService.getAccessoriesDeadStock();
	 model.addAttribute("accessoriesDeadStockList", accessoriesDeadStockList);
	 System.out.println(accessoriesDeadStockList);
	 model.addAttribute("link","accessoriesDeadStock.jsp");
	return "Admin/adminIndex";
}
}

	

	


