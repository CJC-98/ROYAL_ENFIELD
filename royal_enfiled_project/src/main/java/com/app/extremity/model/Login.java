package com.app.extremity.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
/**
 * @author Individual User & Dealer;
 * This pojo class is used for Login purpose;
 * Role reference is given in this pojo;
 * 
 */



@Entity
public class Login 
{	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int loginId;
	
	private String email;
	
	private String password;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Role role;
	
	
	
	
	
	public int getLoginId() {
		return loginId;
	}
	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}