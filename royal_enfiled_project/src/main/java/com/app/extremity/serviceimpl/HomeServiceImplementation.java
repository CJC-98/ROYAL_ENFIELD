package com.app.extremity.serviceimpl;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.idao.LoginIDao;
import com.app.extremity.idao.RegistrationIDao;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Login;
import com.app.extremity.model.Registration;

	/*this service class is for common services
	 * 
	 * */

@Service
public class HomeServiceImplementation implements IHomeService {
	
	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;

	@Autowired
	LoginIDao loginIDao;
	@Autowired
	RegistrationIDao registrationIDao;
	
	
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
		else {
			
			Login userLogin=loginIDao.findOneByEmailAndPassword(email,password);
			Registration userRegistration=registrationIDao.findOneByLogin(userLogin);
			if (userLogin != null) {
				session.setAttribute("currentUserName", userRegistration.getContact().getName());
				//add rolename value in place of Role name and remove this comment
				if(userLogin.getRole().getRoleName().equals("Rolename")) {
					return 5;
				}else if(userLogin.getRole().getRoleName().equals("Rolenam")) {
					return 6;
				}
			}
			
		}
		return 0;
	}

	
}
