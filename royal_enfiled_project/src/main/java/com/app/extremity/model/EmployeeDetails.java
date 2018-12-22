package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails 
{
	@Id
	private String employeeId;
	private String employeeName;
	private String profilePictureUrl;
	private String employeeMobileNumber;
	private String employeeDateOfBirth;
	private String employeeEmail;
	private String employeeSalary;
	private String employeeDesignation;
	private String employeePassword;
	private String employeeJoiningDate;
	private String employeeLastWorkingDate;
	private String employeeAreaName;
	private String employeeCityName;
	private String employeeStateName;
	private String employeeCountryName;
	private String employeePincode;
	private String employeeGender;

	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}
	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}
	public String getEmployeeMobileNumber() {
		return employeeMobileNumber;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		this.employeeMobileNumber = employeeMobileNumber;
	}
	
	public String getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}
	public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	public String getEmployeePassword() {
		return employeePassword;
	}
	public void setEmployeePassword(String employeePassword) {
		this.employeePassword = employeePassword;
	}
	public String getEmployeeJoiningDate() {
		return employeeJoiningDate;
	}
	public void setEmployeeJoiningDate(String employeeJoiningDate) {
		this.employeeJoiningDate = employeeJoiningDate;
	}
	public String getEmployeeLastWorkingDate() {
		return employeeLastWorkingDate;
	}
	public void setEmployeeLastWorkingDate(String employeeLastWorkingDate) {
		this.employeeLastWorkingDate = employeeLastWorkingDate;
	}
	public String getEmployeeAreaName() {
		return employeeAreaName;
	}
	public void setEmployeeAreaName(String employeeAreaName) {
		this.employeeAreaName = employeeAreaName;
	}
	public String getEmployeeCityName() {
		return employeeCityName;
	}
	public void setEmployeeCityName(String employeeCityName) {
		this.employeeCityName = employeeCityName;
	}
	public String getEmployeeStateName() {
		return employeeStateName;
	}
	public void setEmployeeStateName(String employeeStateName) {
		this.employeeStateName = employeeStateName;
	}
	public String getEmployeeCountryName() {
		return employeeCountryName;
	}
	public void setEmployeeCountryName(String employeeCountryName) {
		this.employeeCountryName = employeeCountryName;
	}
	public String getEmployeePincode() {
		return employeePincode;
	}
	public void setEmployeePincode(String employeePincode) {
		this.employeePincode = employeePincode;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	
	
	
}

