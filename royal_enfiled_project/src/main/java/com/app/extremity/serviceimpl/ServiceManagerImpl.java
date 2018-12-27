package com.app.extremity.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.iservice.ServiceManagerInterface;


@Service
public class ServiceManagerImpl implements ServiceManagerInterface{
	
	@Autowired
	EmployeeDetailsIDao employeeDetailsIDao;

	

}
