package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	public String getNextBikeServicingId();
	

	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);


	public long getAllServiceCount();
		
}
