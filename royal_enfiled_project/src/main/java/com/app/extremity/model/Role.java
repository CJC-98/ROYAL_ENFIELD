package com.app.extremity.model;

import javax.persistence.Entity;


import javax.persistence.Id;
/**
 * @author Individual User & Dealer;
 * This pojo class is used for Role purpose;
 * Role reference is given in Login pojo
 */



@Entity
public class Role 
{	@Id
	private String roleId;
	private String roleName;
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
