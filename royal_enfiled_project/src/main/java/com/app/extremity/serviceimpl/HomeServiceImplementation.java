package com.app.extremity.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.model.EmployeeDetails;

	/*this service class is for common services
	 * 
	 * */

@Service
public class HomeServiceImplementation implements IHomeService {
	
	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;


	@Override
	public int checkLoginCredentials(String email, String password) {
		
		EmployeeDetails employeeDetails=employeeDetailsDao.findOneByEmployeeEmailAndEmployeePassword(email, password);
		if(employeeDetails!=null) {
			
			if(employeeDetails.getEmployeeDesignation().equals("Admin")) {
				return 1;
			}else if(employeeDetails.getEmployeeDesignation().equals("SalesManager")) {
				return 2;
			}else if(employeeDetails.getEmployeeDesignation().equals("ServiceManager")) {
				return 3;
			}else if(employeeDetails.getEmployeeDesignation().equals("AccountManager")) {
				return 4;
			}
		}
		return 0;
	}

	
}
