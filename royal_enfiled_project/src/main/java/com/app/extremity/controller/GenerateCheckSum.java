package com.app.extremity.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.extremity.iservice.Account_ServiceInterface;
import com.app.extremity.model.Cart;
import com.app.extremity.model.CartInvoice;
import com.app.extremity.model.Registration;
import com.paytm.pg.merchant.CheckSumServiceHelper;

@Controller
public class GenerateCheckSum implements PaytmFinalFields {
	
	
	@Autowired
	Account_ServiceInterface Service;

	
	@RequestMapping(value="/aa")
	public String geneteBill(Model model,@RequestParam String customerId ,@RequestParam String ammount) {
		System.out.println("in generateBill Controller..");
	
		Random r = new Random();
	    String id = String.format("%04d", r.nextInt(1001));
	    String orderid="abcd"+id;
		TreeMap<String, String> checkSum = generateChecksum(orderid, customerId, ammount);
		String check = checkSum.get("CHECKSUMHASH");
		System.out.println("chck="+check);
		
		System.out.println("amount :-" + ammount + "   " + "id :-" + customerId);
		
		model.addAttribute("check",check);
		model.addAttribute("orderid",orderid);
		model.addAttribute("ammount",ammount);
		model.addAttribute("customerId",customerId);
			
		return "Accounts/success";
		
	}

	public TreeMap<String, String> generateChecksum(String orderId, String customerId, String ammount) {
		TreeMap<String, String> paytmParams = new TreeMap<String, String>();
		paytmParams.put("MID", MERCHANDID);
		paytmParams.put("ORDER_ID", orderId);
		paytmParams.put("CHANNEL_ID", CHANNELID);
		paytmParams.put("CUST_ID", customerId);
		paytmParams.put("MOBILE_NO", MOBILENUMBER);
		paytmParams.put("EMAIL", EMAILID);
		paytmParams.put("TXN_AMOUNT", ammount);
		paytmParams.put("WEBSITE", WEBSIDEURL);
		paytmParams.put("INDUSTRY_TYPE_ID", INDUSTRYTYPE);
		paytmParams.put("CALLBACK_URL", CALLBACK_URL);

		try {
			String paytmChecksum = CheckSumServiceHelper.getCheckSumServiceHelper().genrateCheckSum(MERCHANDKEY,
					paytmParams);
			System.out.println(paytmChecksum);
			paytmParams.put("CHECKSUMHASH", paytmChecksum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return paytmParams;
	}

	@RequestMapping("/callback")
	public String tocall(HttpServletRequest request) {
		
	// final String merchantKey = "gKpu7IKaLSbkchFS";
		 String paytmChecksum = null;
		// Create a tree map from the form post param
		TreeMap<String, String> paytmParams = new TreeMap<String, String>();
		// Request is HttpServletRequest
		for (Entry<String, String[]> requestParamsEntry : request.getParameterMap().entrySet()) {
		    if ("CHECKSUMHASH".equalsIgnoreCase(requestParamsEntry.getKey())){
		        paytmChecksum = requestParamsEntry.getValue()[0];
		    } else {
		        paytmParams.put(requestParamsEntry.getKey(), requestParamsEntry.getValue()[0]);
		    }
		}
		// Call the method for verification
		boolean isValidChecksum = false;
		try {
			isValidChecksum = CheckSumServiceHelper.getCheckSumServiceHelper().verifycheckSum(MERCHANDKEY, paytmParams, paytmChecksum);
			if(isValidChecksum && paytmParams.containsKey("RESPCODE") ){
					System.out.println("rESPONES cODE.." +paytmParams.get("RESPCODE"));
					System.out.println( paytmParams.toString());
				}
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// If isValidChecksum is false, then checksum is not valid
		
		if(paytmParams.get("RESPMSG") != null) {
			if(isValidChecksum){
				System.out.println("success");
				UpdateCartPurchaseStatus(); // Update Method..
				System.out.append("Checksum Matched");
			}
			return "Accounts/ResponsePage";
		}		
		else{
			System.out.append("Checksum MisMatch");
			return "Accounts/Error";
		}
	
	}
	
	
		public void UpdateCartPurchaseStatus() {			
			Registration reg = new Registration(); //-- TO_Do :- UserId fetch from Registration.. 
			reg.setRegistrationId("1");
			
			String purchaseStatus = "buynow";
			String updatePurchaseStatus = "sold";
			
			List<Cart> cart = (List<Cart>)Service.getCartByRegistrationAndPurchaseStatus(reg, purchaseStatus);
			for(Cart c : cart) {
				c.setPurchaseStatus(updatePurchaseStatus);
				Service.UpdatePurchaseStatus(c);
			}			
		}
	
	
	
	
	
	
}
