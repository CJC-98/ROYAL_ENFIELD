package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Quotation
{
	@Id
	private String quotationId;
	@OneToOne(cascade=CascadeType.ALL)
	private BikeModel bikeModel;
//	@OneToOne(cascade=CascadeType.ALL)
//	private User user;
	private double bikePrice;
	public String getQuotationId() {
		return quotationId;
	}
	public void setQuotationId(String quotationId) {
		this.quotationId = quotationId;
	}
	public BikeModel getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(BikeModel bikeModel) {
		this.bikeModel = bikeModel;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	public double getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(double bikePrice) {
		this.bikePrice = bikePrice;
	}
}