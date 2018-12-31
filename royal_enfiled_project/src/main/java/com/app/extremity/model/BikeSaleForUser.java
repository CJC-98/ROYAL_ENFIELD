package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//admin,sale,user..
@Entity
public class BikeSaleForUser {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bikeSaleForUserId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bikeModelId")
	private BikeModel bikemodel;
	private String bikewheel;
	private String date;
	private String showroomPrice;
	private String mileage;
	private String noOfGears;
	private String tyreType;
	private String bikeOnRoadPrice;// with gst
	private String engineStartingType;// with kick or selfStart
	private String image;
	private String quantity;
	private String deadStockStatus="new";
	
	 

	public String getDeadStockStatus() {
		return deadStockStatus;
	}

	public void setDeadStockStatus(String deadStockStatus) {
		this.deadStockStatus = deadStockStatus;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getBikeSaleForUserId() {
		return bikeSaleForUserId;
	}

	public void setBikeSaleForUserId(String bikeSaleForUserId) {
		this.bikeSaleForUserId = bikeSaleForUserId;
	}

	

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(String noOfGears) {
		this.noOfGears = noOfGears;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	

	public BikeModel getBikemodel() {
		return bikemodel;
	}

	public void setBikemodel(BikeModel bikemodel) {
		this.bikemodel = bikemodel;
	}

	public String getBikewheel() {
		return bikewheel;
	}

	public void setBikewheel(String bikewheel) {
		this.bikewheel = bikewheel;
	}

	public String getShowroomPrice() {
		return showroomPrice;
	}

	public void setShowroomPrice(String showroomPrice) {
		this.showroomPrice = showroomPrice;
	}

	public String getBikeOnRoadPrice() {
		return bikeOnRoadPrice;
	}

	public void setBikeOnRoadPrice(String bikeOnRoadPrice) {
		this.bikeOnRoadPrice = bikeOnRoadPrice;
	}

	public String getEngineStartingType() {
		return engineStartingType;
	}

	public void setEngineStartingType(String engineStartingType) {
		this.engineStartingType = engineStartingType;
	}
}
