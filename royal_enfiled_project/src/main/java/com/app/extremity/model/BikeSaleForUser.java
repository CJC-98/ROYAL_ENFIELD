package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//admin,sale,user..
@Entity
public class BikeSaleForUser
 {
	@Id
private String stockId;
private String Brand;
@OneToOne(cascade=CascadeType.ALL)
private BikeModel bikemodel;
private String bikewheel;
private String showroomPrice;
private String bikeOnRoadPrice;//with gst
private String engineStartingType;
public String getStockId() {
	return stockId;
}
public void setStockId(String stockId) {
	this.stockId = stockId;
}
public String getBrand() {
	return Brand;
}
public void setBrand(String brand) {
	Brand = brand;
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
