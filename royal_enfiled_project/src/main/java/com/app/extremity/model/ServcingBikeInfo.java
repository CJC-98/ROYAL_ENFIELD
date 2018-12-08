package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
  
@Entity
@Table(name="ServcingBikeInfoTable")
public class ServcingBikeInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int servcingBikeInfoId;
	
	private String chassisNumber;
	private String plateNumber;
	
	
	
	
	
	public int getServcingBikeInfoId() {
		return servcingBikeInfoId;
	}
	public void setServcingBikeInfoId(int servcingBikeInfoId) {
		this.servcingBikeInfoId = servcingBikeInfoId;
	}
	public String getChassisNumber() {
		return chassisNumber;
	}
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	
	
}
