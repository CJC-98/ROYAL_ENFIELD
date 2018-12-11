package com.app.extremity.idao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.City;
import com.app.extremity.model.State;


public interface CityIdao extends CrudRepository<City, Integer>{
	public List<City> findAllCityByState(State state) ;
}
