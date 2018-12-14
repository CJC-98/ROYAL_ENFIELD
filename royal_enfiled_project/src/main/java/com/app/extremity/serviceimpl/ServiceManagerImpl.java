package com.app.extremity.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.app.extremity.idao.BikeCustomizationIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.CustomizationBikeInfoIDao;
import com.app.extremity.idao.CustomizationChartIDao;
import com.app.extremity.idao.CustomizationInvoiceIDao;
import com.app.extremity.idao.ServcingBikeInfoIDao;
import com.app.extremity.idao.ServiceInvoiceIDao;
import com.app.extremity.idao.ServicingChartIDao;

import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;


@Service
public class ServiceManagerImpl implements ServiceManagerInterface{

	
	@Autowired
	BikeCustomizationIDao bikeCustomizationIDao;
	
	@Autowired
	CustomizationInvoiceIDao customizationInvoiceIDao;
	 
	@Autowired
	CustomizationBikeInfoIDao customizationBikeInfoIDao;
	

	@Autowired
	CustomizationChartIDao customizationChartIDao;
	


	@Override
	public String getNextBikeCustomizationId() {
		long totalCount = getAllCustomizationCount();
		return "BC"+(totalCount+1);
	}
	
	@Override

	public long getAllCustomizationCount() {

		return bikeCustomizationIDao.count();
	}

	@Override
	public BikeCustomization saveBikeCustomization(BikeCustomization bikeCustomization) {
		
		return bikeCustomizationIDao.save(bikeCustomization);
	}

	@Override
	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus) 
	{
		return bikeCustomizationIDao.countBycustomizationStatus(customizationStatus);
	
	}
	
}

