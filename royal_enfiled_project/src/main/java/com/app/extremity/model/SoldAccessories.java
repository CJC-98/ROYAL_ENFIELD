package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

//to sold accessories
//admin and sale only..
@Entity
public class SoldAccessories {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String soldAccessoriesId;
	private String partName;
	public String getSoldAccessoriesId() {
		return soldAccessoriesId;
	}

	public void setSoldAccessoriesId(String soldAccessoriesId) {
		this.soldAccessoriesId = soldAccessoriesId;
	}

	private String partPrice;
	private long partQuantity;
	@OneToOne(cascade = CascadeType.ALL)
	private BikeModel bikeModel;
	//@OneToMany(cascade = CascadeType.ALL)
	//private User user;

	
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

}
