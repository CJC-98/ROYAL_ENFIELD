package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ServicingChartTable")
public class ServicingChart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int servicingChartId;
	
	private String work;
	
	private long cost;
	
	private String Status = "pending";  //OR done
	


	   

	public int getServicingChartId() {
		return servicingChartId;
	}

	public void setServicingChartId(int servicingChartId) {
		this.servicingChartId = servicingChartId;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
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

	public void setBikeServicing(BikeServicing bs1) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
