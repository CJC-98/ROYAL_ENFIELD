package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CompanyOrderForAccessories {
@Id
private String companyOrderForAccessoriesId;
private Date date;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "bikeModelId")
private BikeModel bikeModel;
private String accessoriesType;
private String quantity;

public String getCompanyOrderForAccessoriesId() {
	return companyOrderForAccessoriesId;
}
public void setCompanyOrderForAccessoriesId(String companyOrderForAccessoriesId) {
	this.companyOrderForAccessoriesId = companyOrderForAccessoriesId;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public BikeModel getBikeModel() {
	return bikeModel;
}
public void setBikeModel(BikeModel bikeModel) {
	this.bikeModel = bikeModel;
}
public String getAccessoriesType() {
	return accessoriesType;
}
public void setAccessoriesType(String accessoriesType) {
	this.accessoriesType = accessoriesType;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}

}
