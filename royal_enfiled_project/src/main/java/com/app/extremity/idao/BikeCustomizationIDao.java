package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.extremity.model.BikeCustomization;

@Repository
public interface BikeCustomizationIDao extends CrudRepository<BikeCustomization, String>{

}
