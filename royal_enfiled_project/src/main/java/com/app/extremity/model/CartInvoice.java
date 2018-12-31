package com.app.extremity.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CartInvoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartInvoiceId;
	
	private String totalAmount;
	
	private LocalDate date;
	
	private String paymentStatus = "unpaid";  //OR paid

	@OneToOne(cascade=CascadeType.ALL)
	private Registration registration;

	
	
	
	
	
	

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getCartInvoiceId() {
		return cartInvoiceId;
	}

	public void setCartInvoiceId(int cartInvoiceId) {
		this.cartInvoiceId = cartInvoiceId;
	}
	
	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	
	
	
	
	

	
	
	
	
	
	
}