package com.app.extremity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.BikeSaleIDao;
import com.app.extremity.idao.BikeSaleIDaoColor;
import com.app.extremity.idao.BikeSaleIDaoEngineCapacity;
import com.app.extremity.iservice.BikeSaleServiceI;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.EngineCapacity;

@Service
public class BikeSaleServiceImpl  implements BikeSaleServiceI{
	
	@Autowired
	BikeSaleIDao bikedao;
	
	@Autowired
	BikeSaleIDaoEngineCapacity bikeEngineDao;
	
	@Autowired
   BikeSaleIDaoColor bikeColor;
	
	public int getbikeCount() {
		
		System.out.println("In getCount() of serviceImpl ");
		return bikedao.getBikeCount();
	
	}
	
public int getbikeEngineCount() {
		
		System.out.println("In getCount() of serviceImpl ");
		return bikeEngineDao.getBikeEngineCount();
	
	}
	
	
	public BikeModel saveDataBike(BikeModel bkm)

	{
		System.out.println("bike model save");
		return bikedao.save(bkm);
		
	}
	
	
	
	public long getColorCount()
	{
		
		System.out.println("color");
		return bikeColor.count();
	}
	
	public String getBikecolor()
	{
		
		long colorcount=getColorCount();
		return "BCLRID"+(colorcount);
		
	}
	
	
}
