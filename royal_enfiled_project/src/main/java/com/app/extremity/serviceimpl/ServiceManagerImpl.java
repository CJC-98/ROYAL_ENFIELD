package com.app.extremity.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AvailableServicingIDao;
import com.app.extremity.idao.BikeCustomizationIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.CustomizationBikeInfoIDao;
import com.app.extremity.idao.CustomizationChartIDao;
import com.app.extremity.idao.CustomizationInvoiceIDao;
import com.app.extremity.idao.ServcingBikeInfoIDao;
import com.app.extremity.idao.ServiceInvoiceIDao;
import com.app.extremity.idao.ServicingChartIDao;



import com.app.extremity.iservice.ServiceManagerInterface;

import com.app.extremity.model.AvailableServicing;

import com.app.extremity.model.BikeCustomization;


import com.app.extremity.model.BikeServicing;

import com.app.extremity.model.BikeServicing;


import com.app.extremity.model.Notfication;

import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;



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
	
    @Autowired
    BikeServicingIDao bikeServicingIDao;

	@Autowired
	ServiceInvoiceIDao serviceInvoiceIDao;
	
	@Autowired
	ServcingBikeInfoIDao servcingBikeInfoIDao;
	
	@Autowired
	ServicingChartIDao servicingChartIDao;
	  
	@Autowired
	AvailableServicingIDao availableServicingIDao;
  
	
	

	@Override
	public long getAllServiceCount() {
		return bikeServicingIDao.count();
	}

	@Override
	public long getAllServiceCountByServiceStatus(String serviceStatus) {
		return bikeServicingIDao.countByservcingStatus(serviceStatus);
	}


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
	public long getAllCustomizationCountByCustomizationStatus(String customizationStatus) {
		return bikeCustomizationIDao.countBycustomizationStatus(customizationStatus);
	
	}

	@Override
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing) {
		return bikeServicingIDao.save(bikeServicing);
	}

	@Override
	public String getNextBikeServicingId() {
		long totalCount = getAllServiceCount();
		return "BS"+(totalCount+1);
	}


	@Override
	public List<BikeServicing> getAllBikeServicingByServcingStatus(String serviceStatus) {
		return bikeServicingIDao.findAllBikeServicingByServcingStatus(serviceStatus);
	}

	@Override
	public AvailableServicing saveAvailableServicingIDao(AvailableServicing availableServicing) {
		return availableServicingIDao.save(availableServicing);
	}

	@Override
	public List<AvailableServicing> getAllAvailableServicing() {
		System.out.println(availableServicingIDao.findAll());
		return (List<AvailableServicing>)availableServicingIDao.findAll();
	}

	@Override
	public List<BikeServicing> getAllBikeServicing() {
		return (List<BikeServicing>) bikeServicingIDao.findAll();
	}

	@Override
	public BikeServicing getBikeServicingBiId(String serviceId) {
		return bikeServicingIDao.findBikeServicingByBikeServicingId(serviceId);
	}	

	@Override
	public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus) {
		return (List<BikeCustomization>)bikeCustomizationIDao.findAllBikeCustomizationBycustomizationStatus(customizationStatus);
	}




}


