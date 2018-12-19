package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class BikeSaleForUser {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bikeSaleForUserId;
	

	public String getBikeSaleForUserId() {
		return bikeSaleForUserId;
	}

	public void setBikeSaleForUserId(String bikeSaleForUserId) {
		this.bikeSaleForUserId = bikeSaleForUserId;
	}

	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bikeModelId")
	private BikeModel bikemodel;
	private Date date;
	private String mileage;
	private String tyreType;
	private String noOfGears;
	public Date getDate() {
		return date;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String mileage) {
		this.mileage = mileage;
	}

	public String getTyreType() {
		return tyreType;
	}

	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}

	public String getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(String noOfGears) {
		this.noOfGears = noOfGears;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	private String bikewheel;
	private double showroomPrice;
	private double bikeOnRoadPrice;// with gst
	private String engineStartingType;// with kick or selfStart
	private String quantity;

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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

	public double getShowroomPrice() {
		return showroomPrice;
	}

	public void setShowroomPrice(double showroomPrice) {
		this.showroomPrice = showroomPrice;
	}

	public double getBikeOnRoadPrice() {
		return bikeOnRoadPrice;
	}

	public void setBikeOnRoadPrice(double bikeOnRoadPrice) {
		this.bikeOnRoadPrice = bikeOnRoadPrice;
	}

	public String getEngineStartingType() {
		return engineStartingType;
	}

	public void setEngineStartingType(String engineStartingType) {
		this.engineStartingType = engineStartingType;
	}
}