package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomizationChartTable")
public class CustomizationChart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customizationChartId;
	
	private String part;
	
	private long cost;
	
	private String status = "pending";  //OR done

	
	
	
	

	
	public int getCustomizationChartId() {
		return customizationChartId;
	}
	public void setCustomizationChartId(int customizationChartId) {
		this.customizationChartId = customizationChartId;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
