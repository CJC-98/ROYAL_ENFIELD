package com.app.extremity.serviceimpl;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.CityIdao;
import com.app.extremity.idao.CountryIdao;
import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.idao.RegistrationIdao;
import com.app.extremity.idao.StateIdao;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.model.City;
import com.app.extremity.model.Country;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.Registration;
import com.app.extremity.model.State;


@Service
public class HomeServiceImplementation implements IHomeService{
	


	@Autowired
	RegistrationIdao registrationIdao;

	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;
	@Override
	public int checkLoginCredentials(String email, String password,HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
	
		System.out.println("in home service");
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
			System.out.println("in dealer else");
			Registration login1= registrationIdao.findOneByEmailAndPassword(email, password);
			System.out.println("registration"+login1);
			System.out.println("email serviceimpl"+login1.getEmail());
			if(login1!=null){
				session.setAttribute("reg", login1);
				session.setAttribute("id", login1.getRegistrationId());
				session.setAttribute("email", login1.getEmail());
				session.setAttribute("password", login1.getPassword());
				System.out.println(email+" "+password);
				
		
				
				System.out.println(login1.getRole().getRoleName());
				if(login1.getRole().getRoleName().equals("DEALER")) {
					return 5;
				}else if(login1.getRole().getRoleName().equals("USER")) {
					return 6;
				}
			}
			
		}
		
		return 0;
	}

	
	
}

