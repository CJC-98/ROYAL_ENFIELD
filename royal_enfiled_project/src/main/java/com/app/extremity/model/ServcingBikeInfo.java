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
	private int ServcingBikeInfoId;
	
	private String chasisNumber;
	private String plateNumber;
	
	
	
	
	public int getServcingBikeInfoId() {
		return ServcingBikeInfoId;
	}
	public void setServcingBikeInfoId(int servcingBikeInfoId) {
		ServcingBikeInfoId = servcingBikeInfoId;
	}
	public String getChasisNumber() {
		return chasisNumber;
	}
	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	
	
	
}
