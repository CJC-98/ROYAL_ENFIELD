package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 * @author Individual User & Dealer;
 * This pojo class is used for address save purpose;
 * This pojo  reference is given to contact pojo;
 */
@Entity
public class Address 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String addressId;
	private String country;
	private String state;
	private String city;
	private String pincode;
	
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	
	

}
