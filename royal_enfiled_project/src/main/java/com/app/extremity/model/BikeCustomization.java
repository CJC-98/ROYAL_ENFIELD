package com.app.extremity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BikeCustomizationTable")
public class BikeCustomization {
	   
	@Id
	private String bikeCustomizationId;
	
	private String customizationStatus = "waiting";  //OR in-progress  OR  done
	
	private String appointmentDate;
	
	private String bikeReleaseStatus = "on-hold";   //OR released
	
	private int customizationProgressPercent = 0;  // 0-100 %
	
	@OneToOne(cascade=CascadeType.ALL)
	private CustomizationBikeInfo customizationBikeInfo; 
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<CustomizationChart> customizationChart = new ArrayList<CustomizationChart>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private CustomizationInvoice customizationInvoice;
	

	
	
	

	public int getCustomizationProgressPercent() {
		return customizationProgressPercent;
	}

	public void setCustomizationProgressPercent(int customizationProgressPercent) {
		this.customizationProgressPercent = customizationProgressPercent;
	}

	public String getBikeCustomizationId() {
		return bikeCustomizationId;
	}

	public void setBikeCustomizationId(String bikeCustomizationId) {
		this.bikeCustomizationId = bikeCustomizationId;
	}

	public String getCustomizationStatus() {
		return customizationStatus;
	}

	public void setCustomizationStatus(String customizationStatus) {
		this.customizationStatus = customizationStatus;
	}


	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String string) {
		this.appointmentDate = string;
	}

	public String getBikeReleaseStatus() {
		return bikeReleaseStatus;
	}

	public void setBikeReleaseStatus(String bikeReleaseStatus) {
		this.bikeReleaseStatus = bikeReleaseStatus;
	}

	public CustomizationBikeInfo getCustomizationBikeInfo() {
		return customizationBikeInfo;
	}

	public void setCustomizationBikeInfo(CustomizationBikeInfo customizationBikeInfo) {
		this.customizationBikeInfo = customizationBikeInfo;
	}

	public List<CustomizationChart> getCustomizationChart() {
		return customizationChart;
	}

	public void setCustomizationChart(List<CustomizationChart> customizationChart) {
		this.customizationChart = customizationChart;
	}

	public CustomizationInvoice getCustomizationInvoice() {
		return customizationInvoice;
	}

	public void setCustomizationInvoice(CustomizationInvoice customizationInvoice) {
		this.customizationInvoice = customizationInvoice;
	}
	
	

	


	
	
	
}
