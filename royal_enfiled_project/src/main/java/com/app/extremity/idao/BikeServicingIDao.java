package com.app.extremity.idao;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeServicing;

@Repository
public interface BikeServicingIDao extends CrudRepository<BikeServicing, String>{

	public long countByservcingStatus(String servcingStatus);  

}
