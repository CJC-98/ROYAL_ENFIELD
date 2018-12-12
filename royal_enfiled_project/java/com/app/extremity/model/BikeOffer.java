package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BikeOffer
{
@Id
//@GeneratedValue(strategy=GenerationType.IDENTITY)
private String offerId;
private String offerName;
private String startDate;
private String endDate;
private float discountInPercentage;
public String getOfferId() {
	return offerId;
}
public void setOfferId(String offerId) {
	this.offerId = offerId;
}
public String getOfferName() {
	return offerName;
}
public void setOfferName(String offerName) {
	this.offerName = offerName;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}
public float getDiscountInPercentage() {
	return discountInPercentage;
}
public void setDiscountInPercentage(float discountInPercentage) {
	this.discountInPercentage = discountInPercentage;
}
}
