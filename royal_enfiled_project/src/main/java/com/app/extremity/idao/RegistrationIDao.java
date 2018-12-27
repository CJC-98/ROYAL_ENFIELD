package com.app.extremity.idao;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Registration;

public interface RegistrationIDao extends CrudRepository<Registration, String> {


	public Registration findRegistrationByRegistrationId(String id);
	
}
