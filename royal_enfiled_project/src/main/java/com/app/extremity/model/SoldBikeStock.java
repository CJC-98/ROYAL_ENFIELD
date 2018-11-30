package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SoldBikeStock
 {
	@Id
private String stockId;
private String bikeModel; //model name (Classic, Electra, Thunderbird, Himalyan, Continental, Interceptor)
private String bikeEngineType; //350cc or 500cc
private String chasisNumber;
private String bikewheel;//alloy wheel,spoke
private String bikeOnRoadPrice;
private String engineStartingType;//kick or Self Start
private String invoice;//bill genertion
//@ManyToOne(cascade=CascadeType.ALL)
//private User user;
public String getStockId() {
	return stockId;
}
public void setStockId(String stockId) {
	this.stockId = stockId;
}
public String getBikeModel() {
	return bikeModel;
}
public void setBikeModel(String bikeModel) {
	this.bikeModel = bikeModel;
}
public String getBikeEngineType() {
	return bikeEngineType;
}
public void setBikeEngineType(String bikeEngineType) {
	this.bikeEngineType = bikeEngineType;
}
public String getChasisNumber() {
	return chasisNumber;
}
public void setChasisNumber(String chasisNumber) {
	this.chasisNumber = chasisNumber;
}
public String getBikewheel() {
	return bikewheel;
}
public void setBikewheel(String bikewheel) {
	this.bikewheel = bikewheel;
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
public String getInvoice() {
	return invoice;
}
public void setInvoice(String invoice) {
	this.invoice = invoice;
}
//public User getUser() {
//	return user;
//}
//public void setUser(User user) {
//	this.user = user;
//}
}
