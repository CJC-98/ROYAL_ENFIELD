package com.app.extremity.model;

import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//for Admin and sale..only..
@Entity
public class NewBikeStock 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bikeId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="modelId")
	private BikeModel bikeModel;
	private String chasisNumber;
	private String wheelType;
	private String engineStartingType;
	private String bikePrice;
	private String bikeMfgDate;
	
	private Date arrivalDate;
	
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getBikeId() {
		return bikeId;
	}
	public void setBikeId(String bikeId) {
		this.bikeId = bikeId;
	}
	public BikeModel getBikeModel() {
		return bikeModel;
	}
	public void setBikeModel(BikeModel bikeModel) {
		this.bikeModel = bikeModel;
	}
	public String getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	public String getWheelType() {
		return wheelType;
	}
	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}
	public String getEngineStartingType() {
		return engineStartingType;
	}
	public void setEngineStartingType(String engineStartingType) {
		this.engineStartingType = engineStartingType;
	}
	public String getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(String bikePrice) {
		this.bikePrice = bikePrice;
	}
	public String getBikeMfgDate() {
		return bikeMfgDate;
	}
	public void setBikeMfgDate(String bikeMfgDate) {
		this.bikeMfgDate = bikeMfgDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
}
