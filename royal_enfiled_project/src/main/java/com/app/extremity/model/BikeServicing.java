package com.app.extremity.model;

import java.util.ArrayList;
import java.util.Date;
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
	
	private Date appointmentDate;
	
	private String bikeReleaseStatus = "on-hold";  //OR released
	
	@OneToOne(cascade=CascadeType.ALL)
	private ServcingBikeInfo servcingBikeInfo; 

	@OneToOne(cascade=CascadeType.ALL)
	private ServicingInvoice servicingInvoice;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<ServicingChart> servicingChart = new ArrayList();






	public void setBikeServicingId(String bikeServicingId) {
		this.bikeServicingId = bikeServicingId;
	}



	public String getBikeServicingId() {
		return bikeServicingId;
	}



	public String getServcingStatus() {
		return servcingStatus;
	}


	public void setServcingStatus(String servcingStatus) {
		this.servcingStatus = servcingStatus;
	}



	public Date getAppointmentDate() {
		return appointmentDate;
	}



	public void setAppointmentDate(Date appointmentDate) {
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

	public List<ServicingChart> getServicingChart() {
		return servicingChart;
	}

	public void setServicingChart(List<ServicingChart> servicingChart) {
		this.servicingChart = servicingChart;
	}



	public ServicingInvoice getServicingInvoice() {
		return servicingInvoice;
	}



	public void setServicingInvoice(ServicingInvoice servicingInvoice) {
		this.servicingInvoice = servicingInvoice;
	}

	

	
	
	
}
