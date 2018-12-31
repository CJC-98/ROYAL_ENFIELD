package com.app.extremity.iservice;

import java.util.Date;
import java.util.List;

import com.app.extremity.model.Demo;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Cart;
import com.app.extremity.model.CartInvoice;


public interface Account_ServiceInterface {

	public List<Demo> getAllDemo();
	
	public Long NewBikeCount(Date fd, Date ld);
	
	public Long OldBikeCount(Date fd, Date ld);
	
	public Long SoldBikeCount(Date fds, Date lds);
	
	public Long OldSoldBikeCount(Date fds, Date lds);
	
	public List<NewBikeStock> getAllNewBikeStock();
	
	public List<Cart> getAllCart();
	
	public List<Cart> getCartByRegistrationAndPurchaseStatus(Registration reg, String PurchaseStatus);
	
	public Cart UpdatePurchaseStatus(Cart cart);
	
	public CartInvoice SaveCartInvoice(CartInvoice cartInvoice);
}
