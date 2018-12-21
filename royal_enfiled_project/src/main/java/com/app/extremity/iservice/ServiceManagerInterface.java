package com.app.extremity.iservice;

import java.util.List;


import com.app.extremity.model.BikeCustomization;

import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.ServicingChart;



public interface ServiceManagerInterface {

	

	public long getAllServiceCount();
	public String getNextBikeServicingId();

	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);

	public List<BikeServicing> getAllBikeServicing();
	public List<BikeCustomization> getAllBikeCustomization();


	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus);
	

	public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing);
	public List<AvailableServicing> getAllAvailableServicing();
	
	//public List<Availablec>
	

	public long getAllCustomizationCount();
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);
	public String getNextBikeCustomizationId();
	public long getAllCustomizationCountByCustomizationStatus(String string);


	public BikeServicing getBikeServicingById(String serviceId);
	public BikeCustomization getBikeCustomizationById(String customizationId);




    public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus);
    
    public FreeServicingCount getFreeServicingCountByChassisNumber(String chassisNumber);
    
    public ServicingChart updateServicingChart(ServicingChart servicingChart);
    public CustomizationChart updateCustomizationChart(CustomizationChart customizationChart);
    
    public ServicingChart getServicingChart(int id); 
    public CustomizationChart getCustomizationChart(int id);
    
    public FreeServicingCount updateFreeServicingCount(FreeServicingCount freeServicingCount); 
    
    public BikeCustomization getBikeCustomizationByBikeCustomizationId(String customizationId);
    
    public BikeServicing getBikeServicingByBikeServicingId(String servicingId);
    

}
