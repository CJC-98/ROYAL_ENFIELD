package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetails 
{
	@Id
	private String employeeId;
	private String employeeName;
	private String EmployeeMobileNumber;
	private String employeeEmail;
	private String employeePassword;
	private String employeeSalary;
	private String employeeDesignation;
	private String employeeJoiningDate;
	private String employeeLastWorkingDate;
	
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
	public String getEmployeeMobileNumber() {
		return EmployeeMobileNumber;
	}
	public void setEmployeeMobileNumber(String employeeMobileNumber) {
		EmployeeMobileNumber = employeeMobileNumber;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
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
	public String getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
