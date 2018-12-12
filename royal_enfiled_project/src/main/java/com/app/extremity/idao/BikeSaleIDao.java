package com.app.extremity.idao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.BikeModel;

public interface BikeSaleIDao extends CrudRepository<BikeModel,String> {

	
	@Query("select COUNT(bm) from BikeModel bm")
	public int getBikeCount();
	
	
}
