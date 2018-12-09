package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.BikeCustomizationIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.iservice.ServiceManagerInterface;


@Service
public class ServiceManagerImpl implements ServiceManagerInterface{
	
	@Autowired
	BikeServicingIDao bikeServicingIDao;
	
	@Autowired
	BikeCustomizationIDao bikeCustomizationIDao;

	@Override
	public long getAllServiceCount() {
		System.out.println(bikeServicingIDao.count());
		return 0;
	}

	@Override
	public long getAllServiceCountByServiceStatus() {
		System.out.println(bikeServicingIDao.countByservcingStatus("waiting"));
		return 0;
	}

	@Override
	public String getNextBikeCustomizationId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNextBikeServicingId() {
		// TODO Auto-generated method stub
		return null;
	}
	 

	

}
