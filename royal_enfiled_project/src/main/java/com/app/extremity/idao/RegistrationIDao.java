package com.app.extremity.idao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;
import com.app.extremity.model.Role;
public interface RegistrationIDao extends CrudRepository<Registration, String> {


	List<EmployeeDetails> findAllByRole(Role role);

}
