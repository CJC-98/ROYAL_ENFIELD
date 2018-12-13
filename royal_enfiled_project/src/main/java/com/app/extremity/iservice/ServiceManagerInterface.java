package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.idao.NotficationIDao;

import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	public String getNextBikeServicingId();
	

	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus);
	
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);

	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);

	public long getApprovedServiceCount();
	public long getInProgressCount();
	public long getCompletedServiceCount();
	long getAllServiceCount();
	long getAllCustomizationCount();

}
