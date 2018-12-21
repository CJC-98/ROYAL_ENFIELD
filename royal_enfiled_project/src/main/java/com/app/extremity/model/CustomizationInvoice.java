package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomizationInvoiceTable")
public class CustomizationInvoice {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customizationInvoiceId;
	
	private double amount;
	
	private double customizationCGstPercent;
	
	private double customizationSGstPercent;
	
	private double totalAmount;
	
	private String paymentStatus = "unpaid";  //OR paid
	
	
	
	

	public double getCustomizationCGstPercent() {
		return customizationCGstPercent;
	}
	public void setCustomizationCGstPercent(double customizationCGstPercent) {
		this.customizationCGstPercent = customizationCGstPercent;
	}
	
	public double getCustomizationSGstPercent() {
		return customizationSGstPercent;
	}
	public void setCustomizationSGstPercent(double customizationSGstPercent) {
		this.customizationSGstPercent = customizationSGstPercent;
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
