package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.BikeCustomizationIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.ServcingBikeInfoIDao;
import com.app.extremity.idao.ServiceInvoiceIDao;
import com.app.extremity.idao.ServicingChartIDao;
import com.app.extremity.iservice.ServiceManagerInterface;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;


@Service
public class ServiceManagerImpl implements ServiceManagerInterface{
	
	@Autowired
	BikeServicingIDao bikeServicingIDao;

	@Autowired
	ServiceInvoiceIDao serviceInvoiceIDao;
	
	@Autowired
	ServcingBikeInfoIDao servcingBikeInfoIDao;
	
	@Autowired
	ServicingChartIDao servicingChartIDao;
	
	
	

	
	
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

	@Override
	public BikeServicing saveBikeServicing(BikeServicing bikeServicing) {
		return bikeServicingIDao.save(bikeServicing);
	}
	 


	

}
