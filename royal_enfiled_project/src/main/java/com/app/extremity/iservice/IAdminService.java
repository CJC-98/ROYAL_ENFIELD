package com.app.extremity.iservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.SoldOldBikeStock;

public interface IAdminService {

	void saveEmployee(EmployeeDetails employeeDetails, MultipartFile profilePic);

	void sendEmail(EmailMessage emailmessage, MultipartFile file);

	EmployeeDetails getEmployeeDetailsByName(String employeeName);


}
