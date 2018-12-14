package com.app.extremity.model;





import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * @author Individual User & Dealer;
 * This pojo class is used for contactDetails save purpose;
 * this pojo reference is given to registration  pojo
 */
  

@Entity
public class Contact 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int contactId;
	
	private String name;
	
	private String mobile;
	
	private String showroomName;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Address address;
	
	
	
	
	
	public String getShowroomName() {
		return showroomName;
	}
	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
