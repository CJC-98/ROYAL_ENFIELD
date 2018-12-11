package com.app.extremity.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.ui.Model;

//to order accessories
@Entity
public class AccessoriesSaleForUser {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String accessoriesSaleForUserId;
	private Date addingDate;
	public Date getAddingDate() {
		return addingDate;
	}

	public void setAddingDate(Date addingDate) {
		this.addingDate = addingDate;
	}

	private String partNames;
	private String partPrices;
	private long partQuantitys;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bikeModelId")
	private BikeModel bikeModel;

	public BikeModel getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(BikeModel bikeModel) {
		this.bikeModel = bikeModel;
	}

	public String getAccessoriesSaleForUserId() {
		return accessoriesSaleForUserId;
	}

	public void setAccessoriesSaleForUserId(String accessoriesSaleForUserId) {
		this.accessoriesSaleForUserId = accessoriesSaleForUserId;
	}

	public String getPartNames() {
		return partNames;
	}

	public void setPartNames(String partNames) {
		this.partNames = partNames;
	}

	public String getPartPrices() {
		return partPrices;
	}

	public void setPartPrices(String partPrices) {
		this.partPrices = partPrices;
	}

	public long getPartQuantitys() {
		return partQuantitys;
	}

	public void setPartQuantitys(long partQuantitys) {
		this.partQuantitys = partQuantitys;
	}

	
}
