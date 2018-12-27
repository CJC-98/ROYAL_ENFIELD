package com.app.extremity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;

<<<<<<< HEAD
=======


>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
@Controller
<<<<<<< HEAD
@RequestMapping(value = "/admin")

=======
/*@RequestMapping(value="/admin")*/
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
public class AdminController {

	@Autowired
	IAdminService adminService;

<<<<<<< HEAD
	/*
	 * this method is used to send Email to employee With Registration Link
=======
	@RequestMapping(value="/composeMail")
	public String toComposeMailPage() {
		return "Admin/composeMail";
	}
	/*this method is used to send Email to employee With Registration Link
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	 * 
<<<<<<< HEAD
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage emailmessage, @RequestParam("file") MultipartFile file) {

		adminService.sendEmail(emailmessage, file);
		return null;
=======
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/sendEmail",method=RequestMethod.POST)
	public String sendEmail(@ModelAttribute EmailMessage  emailmessage,@RequestParam("file") MultipartFile file) {
		System.out.println(emailmessage.getTo_address());
		System.out.println(emailmessage.getSubject());
		System.out.println(emailmessage.getBody());
		adminService.sendEmail(emailmessage,file);
		return "Admin/adminIndex";
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	}

	/*
	 * this method is used for Employee Registration Page
	 * 
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/employeeRegistration")
	public String toEmployeeRegistrationPage() {
		return "Admin/employeeRegistration";
	}

	/*
	 * this method is used to save Employee Details
	 * 
<<<<<<< HEAD
	 * author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String createEmployee(@ModelAttribute EmployeeDetails employeeDetails,
			@RequestParam("profilePic") MultipartFile profilePic, Model model) {

		adminService.saveEmployee(employeeDetails, profilePic);
		return "redirect:/loginPage";
=======
	 *  author: Nilesh Tammewar
	 * */
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String createEmployee(@ModelAttribute EmployeeDetails employeeDetails,@RequestParam("profilePic") MultipartFile profilePic,Model model) {
		
		adminService.saveEmployee(employeeDetails,profilePic);
		return "login";
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	}

}
