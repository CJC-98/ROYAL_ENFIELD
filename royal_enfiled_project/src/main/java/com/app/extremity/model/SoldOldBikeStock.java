package com.app.extremity.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SoldOldBikeStock 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String oldBikeId;
	private String totalKmRun;
	private String bikeCondition;
	private String bikeMfgYear;
	private String bikePurchaseYear;
	private String bikeServiceStatus;//recently service or not
	private String mobileNumber;
	private String registrationNo;
	private String taxPaidDetails;
	private String taxRemaining;
	private String sellerDetails;
	private String bikeMileage;
	private String bikeImage;
	private Date soldbikedate;
	

	
	
	
	
	public Date getSoldbikedate() {
		return soldbikedate;
	}
	public void setSoldbikedate(Date soldbikedate) {
		this.soldbikedate = soldbikedate;
	}
	public String getOldBikeId() {
		return oldBikeId;
	}
	public void setOldBikeId(String oldBikeId) {
		this.oldBikeId = oldBikeId;
	}
	public String getTotalKmRun() {
		return totalKmRun;
	}
	public void setTotalKmRun(String totalKmRun) {
		this.totalKmRun = totalKmRun;
	}
	public String getBikeCondition() {
		return bikeCondition;
	}
	public void setBikeCondition(String bikeCondition) {
		this.bikeCondition = bikeCondition;
	}
	public String getBikeMfgYear() {
		return bikeMfgYear;
	}
	public void setBikeMfgYear(String bikeMfgYear) {
		this.bikeMfgYear = bikeMfgYear;
	}
	public String getBikePurchaseYear() {
		return bikePurchaseYear;
	}
	public void setBikePurchaseYear(String bikePurchaseYear) {
		this.bikePurchaseYear = bikePurchaseYear;
	}
	public String getBikeServiceStatus() {
		return bikeServiceStatus;
	}
	public void setBikeServiceStatus(String bikeServiceStatus) {
		this.bikeServiceStatus = bikeServiceStatus;
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
	public String getTaxPaidDetails() {
		return taxPaidDetails;
	}
	public void setTaxPaidDetails(String taxPaidDetails) {
		this.taxPaidDetails = taxPaidDetails;
	}
	public String getTaxRemaining() {
		return taxRemaining;
	}
	public void setTaxRemaining(String taxRemaining) {
		this.taxRemaining = taxRemaining;
	}
	public String getSellerDetails() {
		return sellerDetails;
	}
	public void setSellerDetails(String sellerDetails) {
		this.sellerDetails = sellerDetails;
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
	
	
}
