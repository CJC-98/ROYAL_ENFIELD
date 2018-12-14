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
	public String toComposeMailPage() {
		return "Admin/composeMail";
	}
	
	
	/*@RequestMapping("/accessoriesStock")
	public String toAccessoriesStockPage() {
		return "Admin/accessoriesStock";
	}*/
	
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
	
	

	/*@RequestMapping(value="/")
	public String getBikeModel() {
		
		List<BikeModel> bikeModelList=adminService.getBikeModel();
	
		System.out.println(bikeModelList);
		
		for(BikeModel bikeModel:bikeModelList)
		{
			System.out.println(bikeModel.getModelId());
			System.out.println(bikeModel.getImage());
			System.out.println(bikeModel.getModelName());
			
			for (Color color : bikeModel.getColors()) {
				System.out.println(color.getColorId());
				System.out.println(color.getColorName());
			}
		
			System.out.println(bikeModel.getEnginecapacity().getEngineId());
			System.out.println(bikeModel.getEnginecapacity().getEngineType());
		}
		
		
		return null;
	}*/
		
	//}
	/*this method is used to getColor Details
	 * 
	 *  author: omprakash nagolkar 
	 * */
	
	/*
	@RequestMapping(value="/")
	public String getColor()
	{
		List<Color> ListofColor=adminService.getcolor();
	    System.out.println(ListofColor);
	    
	    for(Color color:ListofColor)
	    {
	    	System.out.println(color.getColorId());
	    	System.out.println(color.getColorName());
	    }
		return null;
	}*/
	
	
	/*this method is used to getAvailableServicing Details
	 * 
	 *  author: omprakash nagolkar
	 * */
	@RequestMapping(value="/avaliableServicing")
	public String getAvailableServicing(Model model)
	{
		List<AvailableServicing> availableServicingList=adminService.getAvailableServicing();
		model.addAttribute("availableServicingList", availableServicingList);
		return "Admin/avaliableServicing";
		
	}
	
 /*@RequestMapping(value="/")
	public String bikeServicing()
	{
		List<BikeServicing> bikeServicingList=adminService.getBikeServicing();
		
		for(BikeServicing bikeservicing:bikeServicingList)
		{
			System.out.println(bikeservicing.getBikeServicingId());
			System.out.println(bikeservicing.getAppointmentDate());
			System.out.println(bikeservicing.getBikeReleaseStatus());
			System.out.println(bikeservicing.getServcingStatus());
		}
		
		return null;
	}
	*/
	@RequestMapping(value="/newBikeStock")
	public String getNewBikeStock(Model model)
	{
		List<NewBikeStock> newBikeStockList=adminService.getNewBikeStock();
		model.addAttribute("newBikeStockList",newBikeStockList);
		return "Admin/newBikeStock";
		
	}
	
	@RequestMapping(value="/accessoriesStock")
	public String getAccessoriesStock(Model model)
	{
		List<AccessoriesStock> accessoriesStockList=adminService.getAccessoriesStock();
		model.addAttribute("accessoriesStockList", accessoriesStockList);
		return "Admin/accessoriesStock";
		
	}
	
   /* @RequestMapping(value="/bikeOffer")
	 public String getBikeOffer(Model model)
	 {
		 List<BikeOffer> bikeOfferList=adminService.getBikeOffer();
		model.addAttribute("bikeOfferList", bikeOfferList);
		 return "Admin/bikeOffer";
		 
	 }*/
	/*@RequestMapping(value="/")
	public String getTestDriveCustomer()
	{
		List<TestDriveCustomer> testDriveCustomerList=adminService.getTestDriveCustomer();
		System.out.println(testDriveCustomerList);
		
		for(TestDriveCustomer testDriveCustomer:testDriveCustomerList)
		{
			System.out.println(testDriveCustomer.getTestId());
			System.out.println(testDriveCustomer.getBikeName());
			System.out.println(testDriveCustomer.getVisitingDate());
			System.out.println(testDriveCustomer.getTestDriveDate());
		}
		return null;
		
	}*/
	/*@RequestMapping(value="/")
	public String getSoldOldBikeStock()
	{
		List<SoldOldBikeStock> soldOldBikeStocList=adminService.getSoldOldBikeStock();
		System.out.println(soldOldBikeStocList);
		
		for(SoldOldBikeStock soldOldBikeStock:soldOldBikeStocList )
		{
			System.out.println(soldOldBikeStock.getBikeCondition());
			System.out.println(soldOldBikeStock.getBikeImage());
			System.out.println(soldOldBikeStock.getBikeMfgYear());
			System.out.println(soldOldBikeStock.getBikeMileage());
			System.out.println(soldOldBikeStock.getBikePurchaseYear());
			System.out.println(soldOldBikeStock.getBikeServiceStatus());
			System.out.println(soldOldBikeStock.getMobileNumber());
			System.out.println(soldOldBikeStock.getOldBikeId());
			System.out.println(soldOldBikeStock.getRegistrationNo());
			System.out.println(soldOldBikeStock.getSellerDetails());
			System.out.println(soldOldBikeStock.getTaxPaidDetails());
			System.out.println(soldOldBikeStock.getTaxRemaining());
			System.out.println(soldOldBikeStock.getTotalKmRun());
		}
		return null;
	*/	
	/*@RequestMapping(value="/")
	public String getServicingInvoice()
	{
		List<ServicingInvoice> servicingInvoiceList=adminService.getServicingInvoice();
		System.out.println(servicingInvoiceList);
		
		for(ServicingInvoice servicingInvoice:servicingInvoiceList)
		{
			System.out.println(servicingInvoice.getAmount());
			System.out.println(servicingInvoice.getPaymentStatus());
			System.out.println(servicingInvoice.getServiceCGstPercent());
			System.out.println(servicingInvoice.getServiceSGstPercent());
			System.out.println(servicingInvoice.getServicingInvoiceId());
			System.out.println(servicingInvoice.getTotalAmount());
		}
		
		return null;
		
	}*/
	/*@RequestMapping(value="/")
	public String getServicingChart()
	{
		List<ServicingChart> servicingChartList=adminService.getServicingChart();
		System.out.println(servicingChartList);
		
		for(ServicingChart servicingChart:servicingChartList )
		{
			
			System.out.println(servicingChart.getServicingChartId());
			System.out.println(servicingChart.getCost());
			System.out.println(servicingChart.getStatus());
			System.out.println(servicingChart.getWork());
			System.out.println(servicingChart.getBikeServicing().getBikeReleaseStatus());
			System.out.println(servicingChart.getBikeServicing().getBikeServicingId());
			System.out.println(servicingChart.getBikeServicing().getServcingStatus());
			System.out.println(servicingChart.getBikeServicing().getServcingBikeInfo().getChasisNumber());
			System.out.println(servicingChart.getBikeServicing().getServcingBikeInfo().getPlateNumber());
			System.out.println(servicingChart.getBikeServicing().getServcingBikeInfo().getServcingBikeInfoId());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getAmount());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getPaymentStatus());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getServiceCGstPercent());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getServiceSGstPercent());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getServicingInvoiceId());
			System.out.println(servicingChart.getBikeServicing().getServicingInvoice().getTotalAmount());
			
			}
		
		return null;
		
	}
*/	/*
	@RequestMapping("/")
	public String getServcingBikeInfo()
{
		List<ServcingBikeInfo> servicingBikeInfoList=adminService.getServcingBikeInfo();
		System.out.println(servicingBikeInfoList);
		
		for(ServcingBikeInfo servcingBikeInfo:servicingBikeInfoList)
		{
			System.out.println(servcingBikeInfo.getServcingBikeInfoId());
			System.out.println(servcingBikeInfo.getChasisNumber());
			System.out.println(servcingBikeInfo.getPlateNumber());
		}
	return null;
	
}*/ 
	
	/*@RequestMapping("/")
	public String getQuotation()
	{
		List<Quotation> quotationList=adminService.getQuotation();
		System.out.println(quotationList);
		for(Quotation quotation:quotationList)
		{
			System.out.println(quotation.getQuotationId());
			System.out.println(quotation.getBikePrice());
			System.out.println(quotation.getBikeModel().getImage());
			System.out.println(quotation.getBikeModel().getModelId());
			System.out.println(quotation.getBikeModel().getModelName());
			System.out.println(quotation.getBikeModel().getEnginecapacity().getEngineId());
			System.out.println(quotation.getBikeModel().getEnginecapacity().getEngineType());
		}
		return null;
		
	}*/
	/*@RequestMapping("/")
	public String getNotfication()
	{
		List<Notfication> notficationList=adminService.getNotfication();
		System.out.println(notficationList);
		
		for(Notfication notification:notficationList )
		{
			System.out.println("ReciverImg :"+ notification.getReciverImg());
			System.out.println("ReciverName   :"+ notification.getReciverName());
			System.out.println("ReciverPost :"+ notification.getReciverPost());
			System.out.println("Message :"+ notification.getMessage());
			System.out.println("MarkasRead:"+ notification.isMarkAsRead());
			System.out.println("Notifiactionid :"+ notification.getNotficationId());
			System.out.println("Senddate :"+ notification.getSendDate());
			System.out.println("SendTime :"+ notification.getSendTime());
			System.out.println("SenderImg :"+ notification.getSenderImg());
			System.out.println("SenderName :"+ notification.getSenderName());
			System.out.println("SenderPost :"+ notification.getSenderPost());

		}
		return null;
		
	}
*/
/*	@RequestMapping("/")
	public String getState()
	{
		List<State> stateList=adminService.getState();
		System.out.println(stateList);
		for(State state:stateList)
		{
			
			System.out.println("Country: " +state.getCountry().getId());
			System.out.println("CountryName:"+state.getCountry().getCountryName());
			System.out.println("Stateid: " +state.getId());
			System.out.println("Statename: " +state.getSname());
		}
		return null;
		
	}
*/
	/*@RequestMapping("/")
	public String getFreeServicing()
	{
		List<FreeServicingCount> freeServicingCountList=adminService.getFreeServicing();
		for(FreeServicingCount freeServicingCount:freeServicingCountList )
		{
			System.out.println("FreeServicingCountId: "+freeServicingCount.getFreeServicingCountId());
			System.out.println("FreeServicingCount:  "+freeServicingCount.getFreeServicingCount());
			System.out.println("ChassisNumber:   "+freeServicingCount.getChassisNumber());
		}
		return null;
		
	}*/
	/*@RequestMapping("/")
	public String getEngineCapacity()
	{
		List<EngineCapacity> engineCapacityList=adminService.getEngineCapacity();
		for(EngineCapacity engineCapacity:engineCapacityList)
		{
			System.out.println("EngineId : "+ engineCapacity.getEngineId());
			System.out.println("EngineType: "+engineCapacity.getEngineType());
			
		}
		return null;
		
	}*/
	@RequestMapping(value="/deadBikeStock")
	//@RequestMapping("/")
	public String getDeadStock(Model model)
	{
		System.out.println("in controller");
		List<DeadStock> deadStockList=adminService.getDeadStock();
		for(DeadStock deadStock:deadStockList )
		{
			System.out.println(deadStock.getDeadStockId());
			System.out.println(deadStock.getDeadBikeStock().getBikeId());
			System.out.println(deadStock.getDeadBikeStock().getArrivalDate());
			System.out.println(deadStock.getDeadBikeStock().getBikeMfgDate());
			System.out.println(deadStock.getDeadBikeStock().getBikePrice());
			System.out.println(deadStock.getDeadBikeStock().getChasisNumber());
			System.out.println(deadStock.getDeadBikeStock().getEngineStartingType());
			System.out.println(deadStock.getDeadBikeStock().getWheelType());
		}
		model.addAttribute("deadStockList", deadStockList);
		return "Admin/deadBikeStock";
		
	}
}
	



	

	


