package com.app.extremity.idao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Country;
import com.app.extremity.model.State;



public interface StateIdao extends CrudRepository<State, Integer>
{
	public List<State> findAllByCountry(Country country);
	public State findOneBySname(String b);
}
