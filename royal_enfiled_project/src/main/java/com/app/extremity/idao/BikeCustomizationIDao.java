package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeCustomization;
import com.app.extremity.model.CustomizationBikeInfo;

@Repository
public interface BikeCustomizationIDao extends CrudRepository<BikeCustomization, String>{

	public long countBycustomizationStatus(String customizationStatus); 
	

}
