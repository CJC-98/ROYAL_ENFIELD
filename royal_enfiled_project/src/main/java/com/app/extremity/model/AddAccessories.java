package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AddAccessories 
{
	@Id
	private String accId;
	private String bikeModelName;
	private String accType;
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getBikeModelName() {
		return bikeModelName;
	}
	public void setBikeModelName(String bikeModelName) {
		this.bikeModelName = bikeModelName;
	}
	
	
}
