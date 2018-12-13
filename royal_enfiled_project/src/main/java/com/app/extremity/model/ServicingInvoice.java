package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ServicingInvoiceTable")
public class ServicingInvoice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int servicingInvoiceId;
	
	private double amount;
	
	private double totalAmount;
	
	private double serviceCGstPercent;
	
	private double serviceSGstPercent;
	
	private String paymentStatus = "unpaid";  //OR paid
	
	
	
	
	
	public double getServiceCGstPercent() {
		return serviceCGstPercent;
	}
	public void setServiceCGstPercent(double serviceCGstPercent) {
		this.serviceCGstPercent = serviceCGstPercent;
	}
	public double getServiceSGstPercent() {
		return serviceSGstPercent;
	}
	public void setServiceSGstPercent(double serviceSGstPercent) {
		this.serviceSGstPercent = serviceSGstPercent;
	}
	public int getServicingInvoiceId() {
		return servicingInvoiceId;
	}
	public void setServicingInvoiceId(int servicingInvoiceId) {
		this.servicingInvoiceId = servicingInvoiceId;
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
