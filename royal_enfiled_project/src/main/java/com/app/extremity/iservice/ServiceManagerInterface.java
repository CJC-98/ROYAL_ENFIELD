package com.app.extremity.iservice;

import java.util.List;





import com.app.extremity.model.BikeCustomization;
import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.ServicingInvoice;



public interface ServiceManagerInterface {

	

	public long getAllServiceCount();
	public String getNextBikeServicingId();


	public long getAllServiceCountByServiceStatus(String serviceStatus);
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing);

	public List<BikeServicing> getAllBikeServicing();

	public List<BikeCustomization> getAllBikeCustomization();


	
	
    public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing);
	public List<AvailableServicing> getAllAvailableServicing();

	
	public List<ServicingInvoice>getAllServicingInvoice(); 

	public long getAllCustomizationCount();
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization);
	public String getNextBikeCustomizationId();
	public long getAllCustomizationCountByCustomizationStatus(String string);


	public BikeServicing getBikeServicingById(String serviceId);
	public BikeCustomization getBikeCustomizationById(String customizationId);


	public BikeServicing getBikeServicingBiId(String serviceId);


    
	
    public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus);
	public List<CustomizationInvoice> getAllCustomizationInvoice();
	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus);


}
