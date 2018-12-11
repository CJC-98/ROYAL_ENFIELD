package com.app.extremity.model;



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
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String registrationId;
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@OneToOne(cascade=CascadeType.ALL)	
	private Contact contact;
	
	private String date;
 
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;

	public String getRegistrationId() {
		return registrationId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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
