package com.app.extremity.iservice;

import java.util.List;

import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.ServicingChart;


public interface ServiceManagerInterface {

	

	public long getAllServiceCount();
	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public String getNextBikeServicingId();	
	public BikeServicing getBikeServicingById(String serviceId);
	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);
	public List<BikeServicing> getAllBikeServicing();

		
	public long getAllCustomizationCount();
	public long getAllCustomizationCountByCustomizationStatus(String string);	
	public String getNextBikeCustomizationId();
	public BikeCustomization getBikeCustomizationById(String customizationId);
	public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus);
	public List<BikeCustomization> getAllBikeCustomization();
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);
	
	
    public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing);
	public List<AvailableServicing> getAllAvailableServicing();

	
    public FreeServicingCount getFreeServicingCountByChassisNumber(String chassisNumber);
    public FreeServicingCount updateFreeServicingCount(FreeServicingCount freeServicingCount);
    
    
    public ServicingChart updateServicingChart(ServicingChart servicingChart);
    public CustomizationChart updateCustomizationChart(CustomizationChart customizationChart);
    
    
    public ServicingChart getServicingChart(int id); 
    public CustomizationChart getCustomizationChart(int id);

    
    public List<AccessoriesStock> getAllAccessoriesStock();
    
 


}
