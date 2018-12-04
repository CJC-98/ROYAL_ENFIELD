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
	private int id;
	
	private String part;
	
	private long cost;
	
	private String Status = "pending";  //OR in-progress OR done
	
	@ManyToOne
	private BikeCustomization bikeCustomization;
	
	
	
	
	
	public BikeCustomization getBikeCustomization() {
		return bikeCustomization;
	}
	public void setBikeCustomization(BikeCustomization bikeCustomization) {
		this.bikeCustomization = bikeCustomization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
}
