package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;
public interface RegistrationIDao extends CrudRepository<Registration, String> {

	Registration findOneByLogin(Login userLogin);

}
