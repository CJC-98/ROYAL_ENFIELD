package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class AccessoriesDeadStock
{
	@Id
private String accessoriesDeadStockID;
	@OneToOne(cascade=CascadeType.ALL)
private AccessoriesStock acd;
	public String getAccessoriesDeadStockID() {
		return accessoriesDeadStockID;
	}
	public void setAccessoriesDeadStockID(String accessoriesDeadStockID) {
		this.accessoriesDeadStockID = accessoriesDeadStockID;
	}
	public AccessoriesStock getAcd() {
		return acd;
	}
	public void setAcd(AccessoriesStock acd) {
		this.acd = acd;
	}
}