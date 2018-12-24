package com.app.extremity.iservice;

import java.util.Date;
import java.util.List;

import com.app.extremity.model.Demo;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Cart;


public interface Account_ServiceInterface {

	public List<Demo> getAllDemo();
	
	//public List<UserCart> getAllByPurchaseStatusAndRegistration(String purchaseStatus, String registrationid);
	
	public Long NewBikeCount(Date fd, Date ld);
	
	public Long SoldBikeCount(Date fds, Date lds);
	
	public List<NewBikeStock> getAllNewBikeStock();
	
	public List<Cart> getAllCart();
	
	public List<Cart> getCartByRegistrationId(Registration reg);
	
	
}
