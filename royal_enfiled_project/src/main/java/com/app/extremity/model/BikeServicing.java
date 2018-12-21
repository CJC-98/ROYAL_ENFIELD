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
@Table(name="BikeServicingTable")
public class BikeServicing {
	      
	@Id
	private String bikeServicingId;
	
	private String servcingStatus = "waiting";   //OR in-progress  OR  done
	
	private String appointmentDate;
	
	private String bikeReleaseStatus = "on-hold";  //OR released
	
	private int serviceProgressPercent = 0;  // 0-100 %  
	
	@OneToOne(cascade=CascadeType.ALL)
	private ServcingBikeInfo servcingBikeInfo; 

	@OneToOne(cascade=CascadeType.ALL)
	private ServicingInvoice servicingInvoice;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<ServicingChart> servicingChart = new ArrayList();



	public String getBikeServicingId() {
		return bikeServicingId;
	}



	public int getServiceProgressPercent() {
		return serviceProgressPercent;
	}



	public void setServiceProgressPercent(int serviceProgressPercent) {
		this.serviceProgressPercent = serviceProgressPercent;
	}



	public void setBikeServicingId(String bikeServicingId) {
		this.bikeServicingId = bikeServicingId;
	}



	public String getServcingStatus() {
		return servcingStatus;
	}



	public void setServcingStatus(String servcingStatus) {
		this.servcingStatus = servcingStatus;
	}



	public String getAppointmentDate() {
		return appointmentDate;
	}



	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}



	public String getBikeReleaseStatus() {
		return bikeReleaseStatus;
	}



	public void setBikeReleaseStatus(String bikeReleaseStatus) {
		this.bikeReleaseStatus = bikeReleaseStatus;
	}



	public ServcingBikeInfo getServcingBikeInfo() {
		return servcingBikeInfo;
	}



	public void setServcingBikeInfo(ServcingBikeInfo servcingBikeInfo) {
		this.servcingBikeInfo = servcingBikeInfo;
	}



	public ServicingInvoice getServicingInvoice() {
		return servicingInvoice;
	}



	public void setServicingInvoice(ServicingInvoice servicingInvoice) {
		this.servicingInvoice = servicingInvoice;
	}



	public List<ServicingChart> getServicingChart() {
		return servicingChart;
	}



	public void setServicingChart(List<ServicingChart> servicingChart) {
		this.servicingChart = servicingChart;
	}



	






}
