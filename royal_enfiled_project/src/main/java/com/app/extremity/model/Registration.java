package com.app.extremity.model;





import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * @author Individual User & Dealer;
 * This pojo class is having References of contact and Login pojo class
 * If any role needs registration details then that role can have accsess by using this pojo.
 * address reference is given to contact pojo
 */

@Entity
public class Registration {
	
	@Id
	private String registrationId;
	
	private Date registrationDate;;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;
	
	@OneToOne(cascade=CascadeType.ALL)	
	private Contact contact;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	
	
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	


}
