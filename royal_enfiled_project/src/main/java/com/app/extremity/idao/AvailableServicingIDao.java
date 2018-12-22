package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.AvailableServicing;


public interface AvailableServicingIDao extends CrudRepository<AvailableServicing, Integer>{

	
}
