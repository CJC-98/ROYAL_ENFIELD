package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.BikeServicing;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	public String getNextBikeServicingId();
	
	public long getAllServiceCount();
	public long getAllServiceCountByServiceStatus();
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);
	
		
}
