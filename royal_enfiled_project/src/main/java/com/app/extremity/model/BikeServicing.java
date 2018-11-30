package com.app.extremity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BikeServicingTable")
public class BikeServicing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String ServcingStatus = "waiting";
	
	private String appointmentDate;
	
	private String releaseStatus = "on-hold";
	
	@OneToOne
	private ServcingBikeInfo servcingBikeInfo; 
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="bikeServicing")
	private List<ServicingChart> servicingChart = new ArrayList();
	
	@OneToOne
	private ServiceInvoice invoice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServcingStatus() {
		return ServcingStatus;
	}

	public void setServcingStatus(String servcingStatus) {
		ServcingStatus = servcingStatus;
	}

	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getReleaseStatus() {
		return releaseStatus;
	}

	public void setReleaseStatus(String releaseStatus) {
		this.releaseStatus = releaseStatus;
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

	public ServiceInvoice getInvoice() {
		return invoice;
	}

	public void setInvoice(ServiceInvoice invoice) {
		this.invoice = invoice;
	}
	
	
}
