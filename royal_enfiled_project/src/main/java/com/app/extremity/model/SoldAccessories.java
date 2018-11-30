package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

//to sold accessories
//admin and sale only..
@Entity
public class SoldAccessories 
{
	@Id
	private String partId;
	private String partName;
	private String partPrice;
	private long partQuantity;
	@ManyToMany(cascade=CascadeType.ALL)
	private BikeModel bikeModel;
//	@OneToMany(cascade=CascadeType.ALL)
//	private User user;
	public String getPartId() {
		return partId;
	}
	public void setPartId(String partId) {
		this.partId = partId;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartPrice() {
		return partPrice;
	}
	public void setPartPrice(String partPrice) {
		this.partPrice = partPrice;
	}
	public long getPartQuantity() {
		return partQuantity;
	}
	public void setPartQuantity(long partQuantity) {
		this.partQuantity = partQuantity;
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
	
}
