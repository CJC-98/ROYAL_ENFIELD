package com.app.extremity.idao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.EngineCapacity;

public interface BikeSaleIDaoEngineCapacity extends CrudRepository<EngineCapacity, String>
{
	//query for autogenerate string id
		@Query("select COUNT(ec) from EngineCapacity ec")
		public int getEngineCapcityCount();

}