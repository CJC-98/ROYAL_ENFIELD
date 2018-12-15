package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.idao.NotficationIDao;

import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	

	public long getAllServiceCount();
	public long getAllCustomizationCount();
	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);

		

	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus);
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);

}
