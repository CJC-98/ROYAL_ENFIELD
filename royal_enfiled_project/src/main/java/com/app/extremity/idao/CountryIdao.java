package com.app.extremity.idao;



import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Country;



public interface CountryIdao extends CrudRepository<Country, Integer>{

	Country findOne(int a);

}
