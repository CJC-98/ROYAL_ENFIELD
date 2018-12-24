package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.FreeServicingCount;

@Repository
public interface FreeServicingCountIDao extends CrudRepository<FreeServicingCount, Integer>{

	public FreeServicingCount findFreeServicingCountByChassisNumber(String chassisNumber);
	
}
