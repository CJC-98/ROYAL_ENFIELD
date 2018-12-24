package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mycart")
public class Cart {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	private int qty;	
	private double totalprice;
	private Date orderDate;
	
	/*@ManyToOne
	private OldBikeStock oldBike;*/
	
	@OneToOne(cascade=CascadeType.ALL)
	private CartInvoice cartInvoice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private AccessoriesStock accessories;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Registration registration;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private BikeSaleForUser bikeSaleForUser;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private OldBikeStock oldbike;
	
	private String purchaseStatus="unsold";//buy now and sold




	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

public OldBikeStock getOldbike() {
	return oldbike;
}
public void setOldbike(OldBikeStock oldbike) {
	this.oldbike = oldbike;
}
public String getPurchaseStatus() {
	return purchaseStatus;
}
public void setPurchaseStatus(String purchaseStatus) {
	this.purchaseStatus = purchaseStatus;
}
public AccessoriesStock getAccessories() {
	return accessories;
}
public void setAccessories(AccessoriesStock accessories) {
	this.accessories = accessories;
}

	
	public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getTotalprice() {
	return totalprice;
}
public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}

public BikeSaleForUser getBikeSaleForUser() {
	return bikeSaleForUser;
}
public void setBikeSaleForUser(BikeSaleForUser bikeSaleForUser) {
	this.bikeSaleForUser = bikeSaleForUser;
}
public Registration getRegistration() {
	return registration;
}
public void setRegistration(Registration registration) {
	this.registration = registration;
}


}
