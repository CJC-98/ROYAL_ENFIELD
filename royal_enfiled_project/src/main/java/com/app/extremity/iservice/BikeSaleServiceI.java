package com.app.extremity.iservice;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.BikeModel;
import com.app.extremity.model.Color;
import com.app.extremity.model.EngineCapacity;

public interface BikeSaleServiceI 
{

	public void addNewBikeModel(BikeModel bikeModel,Color color,EngineCapacity engineCap, MultipartFile profilePic);
	
	public int getBikeModelCount();
	
	public int getEngineCapacityCount();
	
	public long getColorCount();
	public String getBikeColor();

}
