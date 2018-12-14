package com.app.extremity.idao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.CustomizationBikeInfo;

@Repository
public interface CustomizationBikeInfoIDao extends CrudRepository<CustomizationBikeInfo, Integer>{

	
}
