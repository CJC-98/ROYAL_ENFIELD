package com.app.extremity.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.AvailableServicingIDao;
import com.app.extremity.idao.BikeCustomizationIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.CustomizationChartIDao;
import com.app.extremity.idao.FreeServicingCountIDao;
import com.app.extremity.idao.ServicingChartIDao;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.iservice.ServiceManagerInterface;

import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.CustomizationChart;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.ServicingChart;



@Service
public class ServiceManagerImpl implements ServiceManagerInterface{

	
	@Autowired
	BikeCustomizationIDao bikeCustomizationIDao;
	
    @Autowired
    BikeServicingIDao bikeServicingIDao;
	  
	@Autowired
	AvailableServicingIDao availableServicingIDao;
  
	@Autowired
	FreeServicingCountIDao freeServicingCountIDao;
	
	@Autowired
	ServicingChartIDao servicingChartIDao;
	
	@Autowired
	CustomizationChartIDao customizationChartIDao;
	
	@Autowired
	NotificationInterface notificationInterface;
	

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
		return (List<AvailableServicing>)availableServicingIDao.findAll();
	}

	@Override
	public List<BikeServicing> getAllBikeServicing() {
		return (List<BikeServicing>) bikeServicingIDao.findAll();
	}

	@Override
	public BikeServicing getBikeServicingById(String serviceId) {
		return bikeServicingIDao.findBikeServicingByBikeServicingId(serviceId);
	}	

	@Override
	public List<BikeCustomization> getAllBikeCustomizationByCustomizationStatus(String customizationStatus) {
		return (List<BikeCustomization>)bikeCustomizationIDao.findAllBikeCustomizationBycustomizationStatus(customizationStatus);
	}

	@Override
	public BikeCustomization getBikeCustomizationById(String customizationId) {
		return bikeCustomizationIDao.findBikeCustomizationByBikeCustomizationId(customizationId);
	}

	@Override
	public List<BikeCustomization> getAllBikeCustomization() {
		return (List<BikeCustomization>) bikeCustomizationIDao.findAll();
	}

	@Override
	public FreeServicingCount getFreeServicingCountByChassisNumber(String chassisNumber) {
		return freeServicingCountIDao.findFreeServicingCountByChassisNumber(chassisNumber);
	}

	@Override
	public ServicingChart updateServicingChart(ServicingChart servicingChart) {
		return servicingChartIDao.save(servicingChart);
	}

	@Override
	public CustomizationChart updateCustomizationChart(CustomizationChart customizationChart) {
		return customizationChartIDao.save(customizationChart);
	}

	@Override
	public ServicingChart getServicingChart(int id) {
		return servicingChartIDao.findById(id);
	}

	@Override
	public CustomizationChart getCustomizationChart(int id) {
		return customizationChartIDao.findById(id);
	}

	@Override
	public FreeServicingCount updateFreeServicingCount(FreeServicingCount freeServicingCount) {
		return freeServicingCountIDao.save(freeServicingCount);
	}

	@Override
	public BikeCustomization getBikeCustomizationByBikeCustomizationId(String customizationId) {
		return bikeCustomizationIDao.findBikeCustomizationByBikeCustomizationId(customizationId);
	}

	@Override
	public BikeServicing getBikeServicingByBikeServicingId(String servicingId) {
		return bikeServicingIDao.findBikeServicingByBikeServicingId(servicingId);
	}



}


