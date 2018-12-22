package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CustomizationBikeInfoTable")
public class CustomizationBikeInfo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customizationBikeInfoId;
	
	public int getCustomizationBikeInfoId() {
		return customizationBikeInfoId;
	}
	public void setCustomizationBikeInfoId(int customizationBikeInfoId) {
		this.customizationBikeInfoId = customizationBikeInfoId;
	}
	private String modelName;
	private String chasisNumber;
	private String plateNumber;

	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
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
