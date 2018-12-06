package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomizationInvoiceTable")
public class CustomizationInvoice {
	
	@Id
	private int customizationInvoiceId;
	
	private double amount;
	
	private double customizationGstPercent;
	
	private double totalAmount;
	
	private String paymentStatus = "unpaid";  //OR paid
	
	
	
	public double getCustomizationGstPercent() {
		return customizationGstPercent;
	}
	public void setCustomizationGstPercent(double customizationGstPercent) {
		this.customizationGstPercent = customizationGstPercent;
	}

	public int getCustomizationInvoiceId() {
		return customizationInvoiceId;
	}
	public void setCustomizationInvoiceId(int customizationInvoiceId) {
		this.customizationInvoiceId = customizationInvoiceId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
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
