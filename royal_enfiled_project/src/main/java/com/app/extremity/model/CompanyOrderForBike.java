package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CompanyOrderForBike {
	@Id
	private String companyOrderForBikeId;
	private String date;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bikeModelId")
	private BikeModel bikeModel;
	private String quantity;

	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BikeModel getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(BikeModel bikeModel) {
		this.bikeModel = bikeModel;
	}

	public String getCompanyOrderForBikeId() {
		return companyOrderForBikeId;
	}

	public void setCompanyOrderForBikeId(String companyOrderForBikeId) {
		this.companyOrderForBikeId = companyOrderForBikeId;
	}

	public String getCompanyOrderId() {
		return companyOrderForBikeId;
	}

	public void setCompanyOrderId(String companyOrderId) {
		this.companyOrderForBikeId = companyOrderId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}