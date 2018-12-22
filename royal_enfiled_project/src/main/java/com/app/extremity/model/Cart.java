package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="mycart")
public class Cart {

	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int productId;
private int qty;

private double totalprice;

/*@ManyToOne
private OldBikeStock oldBike;*/
@ManyToOne
AccessoriesStock accessories;
@ManyToOne
private Registration registration;

@ManyToOne
BikeSaleForUser bikeSaleForUser;

@ManyToOne
OldBikeStock oldbike;

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

private String purchaseStatus="unsold";//buy now and sold
	
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
