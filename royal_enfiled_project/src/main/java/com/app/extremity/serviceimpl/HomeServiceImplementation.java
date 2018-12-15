package com.app.extremity.serviceimpl;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
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
	public int checkLoginCredentials(String email, String password,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		EmployeeDetails employeeDetails=employeeDetailsDao.findOneByEmployeeEmailAndEmployeePassword(email, password);
		if(employeeDetails!=null) {
			
			
			//setting session object
			session.setAttribute("currentUserName", employeeDetails.getEmployeeName());
			session.setAttribute("currentUserPost", employeeDetails.getEmployeeDesignation());
			session.setAttribute("currentUserImg", employeeDetails.getProfilePictureUrl());
						
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
