package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	public String getNextBikeServicingId();
	
	public long getAllServiceCount();
	public long getAllCustomizationCount();
	
	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus);
	
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);
	
		
}
