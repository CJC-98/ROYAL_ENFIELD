package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FreeServicingCountTable")
public class FreeServicingCount{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int freeServicingCountId;
	
	private String chassisNumber;
	
	private int freeServicingCount;
	
	
	
	
	
	public int getFreeServicingCountId() {
		return freeServicingCountId;
	}
	public void setFreeServicingCountId(int freeServicingCountId) {
		this.freeServicingCountId = freeServicingCountId;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public int getFreeServicingCount() {
		return freeServicingCount;
	}
	public void setFreeServicingCount(int freeServicingCount) {
		this.freeServicingCount = freeServicingCount;
	}
	

}