package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyOrderForAccessories {
	
	@Id
	private String companyOrderForAccessoriesId;
	private String bikeModelName;
	private String accType;
	private String quantity;
	private String orderDate;
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getCompanyOrderForAccessoriesId() {
		return companyOrderForAccessoriesId;
	}
	public void setCompanyOrderForAccessoriesId(String companyOrderForAccessoriesId) {
		this.companyOrderForAccessoriesId = companyOrderForAccessoriesId;
	}
	public String getBikeModelName() {
		return bikeModelName;
	}
	public void setBikeModelName(String bikeModelName) {
		this.bikeModelName = bikeModelName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	
	
	

}
