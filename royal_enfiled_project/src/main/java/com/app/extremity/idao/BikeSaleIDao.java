package com.app.extremity.idao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.BikeModel;

//for Bike Model 
public interface BikeSaleIDao extends CrudRepository<BikeModel, String>
{
	//query for autogenerate string id
	@Query("select COUNT(bm) from BikeModel bm")
	public int getBikeModelCount();


	public BikeModel findBikeModelByBikeModelId(String bid);

}