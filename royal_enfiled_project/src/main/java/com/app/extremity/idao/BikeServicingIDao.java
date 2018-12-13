package com.app.extremity.idao;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeServicing;

@Repository
public interface BikeServicingIDao extends CrudRepository<BikeServicing, String>{
	
	public long countByservcingStatus(String servcingStatus); 
	
	
	// Counting Approved Services i.e. service status=waiting
	@Query("Select COUNT(ss) from BikeServicing ss where ss.servcingStatus='waiting'")

	public long getApprovedServiceCount();
	
	// Counting In progress Services i.e. service status=in-progress
	@Query("Select COUNT(ss) from BikeServicing ss where ss.servcingStatus='in-progress'")

	public long getInProgressCount();

	// Counting Completed Services i.e. service status=done
	@Query("Select COUNT(ss) from BikeServicing ss where ss.servcingStatus='done'")

	public long getCompletedServiceCount();
	
	
	
	
}
