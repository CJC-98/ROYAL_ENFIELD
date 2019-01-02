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
	private String date;
	private String partNames;
	private String partPrices;
	private String partQuantitys;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bikeModelId")
	private BikeModel bikeModel;
	private String image;
	private String deadStockStatus="new";//dead

	public String getDeadStockStatus() {
		return deadStockStatus;
	}

	public void setDeadStockStatus(String deadStockStatus) {
		this.deadStockStatus = deadStockStatus;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	private String withGstPartPrices;
	
	public String getWithGstPartPrices() {
		return withGstPartPrices;
	}

	public void setWithGstPartPrices(String withGstPartPrices) {
		this.withGstPartPrices = withGstPartPrices;
	}
	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

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

	public String getPartQuantitys() {
		return partQuantitys;
	}

	public void setPartQuantitys(String partQuantitys) {
		this.partQuantitys = partQuantitys;
	}

	
}
