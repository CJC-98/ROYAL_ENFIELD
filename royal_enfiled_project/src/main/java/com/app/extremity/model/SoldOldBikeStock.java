package com.app.extremity.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SoldOldBikeStock {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String soldOldBikeStockId;
	private String oldBikeModelName;
	private Date date;
	private String totalKmRun;
	private String bikeModelYear;
	private String bikePurchaseDate;
	private String mobileNumber;
	private String registrationNo;
	private String sellerName;
	private String bikeMileage;
	private String bikeImage;
	private String colors;
	private long price;
	private long newPrice;

	public String getOldBikeModelName() {
		return oldBikeModelName;
	}

	public void setOldBikeModelName(String oldBikeModelName) {
		this.oldBikeModelName = oldBikeModelName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTotalKmRun() {
		return totalKmRun;
	}

	public void setTotalKmRun(String totalKmRun) {
		this.totalKmRun = totalKmRun;
	}

	public String getBikeModelYear() {
		return bikeModelYear;
	}

	public void setBikeModelYear(String bikeModelYear) {
		this.bikeModelYear = bikeModelYear;
	}

	public String getBikePurchaseDate() {
		return bikePurchaseDate;
	}

	public void setBikePurchaseDate(String bikePurchaseDate) {
		this.bikePurchaseDate = bikePurchaseDate;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getBikeMileage() {
		return bikeMileage;
	}

	public void setBikeMileage(String bikeMileage) {
		this.bikeMileage = bikeMileage;
	}

	public String getBikeImage() {
		return bikeImage;
	}

	public void setBikeImage(String bikeImage) {
		this.bikeImage = bikeImage;
	}

	public String getColors() {
		return colors;
	}

	public void setColors(String colors) {
		this.colors = colors;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public long getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(long newPrice) {
		this.newPrice = newPrice;
	}

	public String getSoldOldBikeStockId() {
		return soldOldBikeStockId;
	}

	public void setSoldOldBikeStockId(String sldOldBikeStockId) {
		this.soldOldBikeStockId = sldOldBikeStockId;
	}

}
