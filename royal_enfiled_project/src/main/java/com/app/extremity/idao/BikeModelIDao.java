package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.BikeModel;


public interface BikeModelIDao extends CrudRepository<BikeModel, String>{
	public BikeModel findAllBymodelId(String id);

}
