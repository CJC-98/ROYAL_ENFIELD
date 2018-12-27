package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CartInvoice {

	@Id
	private String cartInvoiceId;
	
	private double amount;
	
	private double cGstPercent;
	
	private double sGstPercent;
	
	private double gstPercent;
	
	private double totalAmount;
	
	private String paymentStatus = "unpaid";  //OR paid

	
	
	public String getCartInvoiceId() {
		return cartInvoiceId;
	}

	public void setCartInvoiceId(String cartInvoiceId) {
		this.cartInvoiceId = cartInvoiceId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getcGstPercent() {
		return cGstPercent;
	}

	public void setcGstPercent(double cGstPercent) {
		this.cGstPercent = cGstPercent;
	}

	public double getsGstPercent() {
		return sGstPercent;
	}

	public void setsGstPercent(double sGstPercent) {
		this.sGstPercent = sGstPercent;
	}

	public double getGstPercent() {
		return gstPercent;
	}

	public void setGstPercent(double gstPercent) {
		this.gstPercent = gstPercent;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	
	
	
	
	
}