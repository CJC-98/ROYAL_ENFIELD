package com.app.extremity.iservice;

import com.app.extremity.model.BikeModel;

public interface BikeSaleServiceI {
	
	
	public int getbikeCount();
	public BikeModel saveDataBike(BikeModel bkm);
	public int getbikeEngineCount();
	public String getBikecolor();

}
