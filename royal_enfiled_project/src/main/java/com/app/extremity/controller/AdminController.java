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
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.Quotation;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.TestDriveCustomer;





@Controller
/*@RequestMapping(value="/admin")*/
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	

	/*this method is used to send Email to employee With Registration Link
	 * 
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage  emailmessage,@RequestParam("file") MultipartFile file) {
		
		adminService.sendEmail(emailmessage,file);
		return null;
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
	/*@RequestMapping(value="/")
	public String getAvailableServicing()
	{
		List<AvailableServicing> ListofAvailableServicing=adminService.getAvailableServicing();
		for(AvailableServicing Servicing:ListofAvailableServicing)
	    {
	    	System.out.println(Servicing.getAvailableServicingId());
	    	System.out.println(Servicing.getServiceName());
	    }
		return null;
		
	}*/
	
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
	/*@RequestMapping(value="/")
	public String getNewBikeStock()
	{
		List<NewBikeStock> NewBikeStockList=adminService.getNewBikeStock();
		
		for(NewBikeStock newBikeStock:NewBikeStockList)
		{
			System.out.println(newBikeStock.getBikeId());
			System.out.println(newBikeStock.getArrivalDate());
			System.out.println(newBikeStock.getBikeMfgDate());
			System.out.println(newBikeStock.getChasisNumber());
			System.out.println(newBikeStock.getEngineStartingType());
			System.out.println(newBikeStock.getWheelType());
			System.out.println(newBikeStock.getBikeModel().getModelId());
			System.out.println(newBikeStock.getBikePrice());
		}
		return null;
		
	}
*/   /* @RequestMapping(value="/")
	 public String getBikeOffer()
	 {
		 List<BikeOffer> bikeOfferList=adminService.getBikeOffer();
		 System.out.println(bikeOfferList);
		 
		 for(BikeOffer bikeOffer:bikeOfferList)
		 {
			 System.out.println(bikeOffer.getDiscountInPercentage());
			 System.out.println(bikeOffer.getStartDate());
			 System.out.println(bikeOffer.getEndDate());
			 System.out.println(bikeOffer.getOfferId());
			 System.out.println(bikeOffer.getOfferName());
		 }
		return null;
		 
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
	@RequestMapping("/")
	public String getNotfication()
	{
		List<Notfication> notficationList=adminService.getNotfication();
		System.out.println(notficationList);
		
		for(Notfication notification:notficationList )
		{
			System.out.println("Fromid :"+ notification.getFromId());
			System.out.println("Toid   :"+ notification.getToId());
			System.out.println("Message :"+ notification.getMessage());
			System.out.println("MarkasRead:"+ notification.isMarkAsRead());
			System.out.println("Notifiactionid :"+ notification.getNotficationId());
			System.out.println("Senddate :"+ notification.getSendDate());
			System.out.println("SendTime :"+ notification.getSendTime());
		}
		return null;
		
	}
	}
