package com.app.extremity.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AvailableServicingTable")
public class AvailableServicing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int availableServicingId;
	
	private String serviceName;
	
	private long cost;
	
	public int getAvailableServicingId() {
		return availableServicingId;
	}

	public void setAvailableServicingId(int availableServicingId) {
		this.availableServicingId = availableServicingId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}
		
}
