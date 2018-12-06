package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CompanyOrder
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
private String orderId;
private String orderDate;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="modelId")
private BikeModel bikemodel;
private String quantity;
private String totalPrice;
public String getOrderId() {
	return orderId;
}
public void setOrderId(String orderId) {
	this.orderId = orderId;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public BikeModel getBikemodel() {
	return bikemodel;
}
public void setBikemodel(BikeModel bikemodel) {
	this.bikemodel = bikemodel;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public String getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(String totalPrice) {
	this.totalPrice = totalPrice;
}
}