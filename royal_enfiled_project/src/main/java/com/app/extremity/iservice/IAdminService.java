package com.app.extremity.iservice;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;

public interface IAdminService {

	void saveEmployee(EmployeeDetails employeeDetails, MultipartFile profilePic);

	void sendEmail(EmailMessage emailmessage, MultipartFile file);

	EmployeeDetails getEmployeeDetailsByName(String employeeName);

}
