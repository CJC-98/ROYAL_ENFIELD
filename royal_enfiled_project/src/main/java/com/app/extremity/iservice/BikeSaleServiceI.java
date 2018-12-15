package com.app.extremity.iservice;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.AddAccessories;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.Color;
import com.app.extremity.model.EngineCapacity;

public interface BikeSaleServiceI 
{

	public void addNewBikeModel(BikeModel bikeModel,Color color,EngineCapacity engineCap, MultipartFile profilePic);
	public void addAccessories(AddAccessories addAccessories);
	public int getBikeModelCount();
	
	public int getEngineCapacityCount();
	
	//for autogeneration of String Id in color 
	public long getColorCount();
	public String getBikeColor();
	
	//for autogeneration of String Id in add Accessories
	public String getAddAccessoriesId();
	

}
