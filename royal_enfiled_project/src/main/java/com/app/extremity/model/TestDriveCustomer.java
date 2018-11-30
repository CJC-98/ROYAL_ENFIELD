package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//user and sale ..
@Entity
public class TestDriveCustomer
{
	@Id
private String testId;
//	@OneToOne(cascade=CascadeType.ALL)
//private User user;
private String bikeName;
private String visitingDate;
private String testDriveDate;
//@OneToOne(cascade=CascadeType.ALL)
//private Employee employee;
public String getTestId() {
	return testId;
}
public void setTestId(String testId) {
	this.testId = testId;
}
//public User getUser() {
//	return user;
//}
//public void setUser(User user) {
//	this.user = user;
//}
public String getBikeName() {
	return bikeName;
}
public void setBikeName(String bikeName) {
	this.bikeName = bikeName;
}
public String getVisitingDate() {
	return visitingDate;
}
public void setVisitingDate(String visitingDate) {
	this.visitingDate = visitingDate;
}
public String getTestDriveDate() {
	return testDriveDate;
}
public void setTestDriveDate(String testDriveDate) {
	this.testDriveDate = testDriveDate;
}
//public Employee getEmployee() {
//	return employee;
//}
//public void setEmployee(Employee employee) {
//	this.employee = employee;
//}
}