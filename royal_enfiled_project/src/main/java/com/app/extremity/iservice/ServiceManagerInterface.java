package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.idao.NotficationIDao;

import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	
	

	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus);
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);

	long getAllCustomizationCount();




}
