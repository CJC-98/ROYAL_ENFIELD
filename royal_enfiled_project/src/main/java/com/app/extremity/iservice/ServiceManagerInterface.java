package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Notfication;



public interface ServiceManagerInterface {

	

	public long getAllServiceCount();
	public String getNextBikeServicingId();

	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);

	public List<BikeServicing> getAllBikeServicing();


	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus);
	

	public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing);
	public List<AvailableServicing> getAllAvailableServicing();



	public long getAllCustomizationCount();
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);
	public String getNextBikeCustomizationId();
	public long getAllCustomizationCountByCustomizationStatus(String string);


	public BikeServicing getBikeServicingById(String serviceId);
	public BikeCustomization getBikeCustomizationById(String customizationId);




    public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus);

}
