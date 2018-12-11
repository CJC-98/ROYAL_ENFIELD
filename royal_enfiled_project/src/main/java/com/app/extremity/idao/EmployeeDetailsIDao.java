package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.EmployeeDetails;

public interface EmployeeDetailsIDao extends CrudRepository<EmployeeDetails	, String>{

	EmployeeDetails findOneByEmployeeEmailAndEmployeePassword(String email, String password);

}
