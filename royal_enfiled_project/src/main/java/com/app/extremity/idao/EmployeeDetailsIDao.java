package com.app.extremity.idao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.EmployeeDetails;

public interface EmployeeDetailsIDao extends CrudRepository<EmployeeDetails	, String>{

	EmployeeDetails findOneByEmployeeEmailAndEmployeePassword(String email, String password);

	
	EmployeeDetails findOneByEmployeeName(String employeeName);
	
	EmployeeDetails findOneByEmployeeEmail(String employeeEmail);
	
	EmployeeDetails findOneByEmployeeId(String employeeId);


	EmployeeDetails findOneByEmployeeDesignation(String string);


	List<EmployeeDetails> findAllByEmployeeDesignation(String employeeDesignation);


	

}
