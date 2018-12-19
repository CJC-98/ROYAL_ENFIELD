package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	public String getNextBikeCustomizationId();
	

	public long getAllServiceCount();
	public long getAllCustomizationCount();
	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);
	public List<BikeServicing> getAllBikeServicing();

	public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing);
	public List<AvailableServicing> getAllAvailableServicing();

	public long getAllCustomizationCountByCustomizationStatus(String Waiting);

	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus);
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);


	public String getNextBikeServicingId();


}
