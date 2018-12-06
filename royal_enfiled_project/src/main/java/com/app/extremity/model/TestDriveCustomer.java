package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

//user and sale,admin
@Entity
public class TestDriveCustomer {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String testDriveCustomerId;
	// @OneToOne(cascade=CascadeType.ALL)
	// private User user;
	private String bikeName;
	private String visitingDate;
	private String testDriveDate;
	// @OneToOne(cascade=CascadeType.ALL)
	// private Employee employee;

	public String getBikeName() {
		return bikeName;
	}

	public String getTestDriveCustomerId() {
		return testDriveCustomerId;
	}

	public void setTestDriveCustomerId(String testDriveCustomerId) {
		this.testDriveCustomerId = testDriveCustomerId;
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

}