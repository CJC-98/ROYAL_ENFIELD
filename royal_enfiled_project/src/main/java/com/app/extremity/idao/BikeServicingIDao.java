package com.app.extremity.idao;



import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeServicing;

@Repository
public interface BikeServicingIDao extends CrudRepository<BikeServicing, String>{

	public long countByservcingStatus(String servcingStatus); 
	
	public List<BikeServicing> findAllBikeServicingByServcingStatus(String servcingStatus);
	
	public BikeServicing findBikeServicingByBikeServicingId(String serviceId);


}
