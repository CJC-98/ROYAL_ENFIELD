package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AccessoriesDeadStock {
	@Id
// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String accessoriesDeadStockId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "partId")
	private AccessoriesStock acd;

	public String getAccessoriesDeadStockID() {
		return accessoriesDeadStockId;
	}

	public void setAccessoriesDeadStockID(String accessoriesDeadStockID) {
		this.accessoriesDeadStockId = accessoriesDeadStockID;
	}

	public AccessoriesStock getAcd() {
		return acd;
	}

	public void setAcd(AccessoriesStock acd) {
		this.acd = acd;
	}
}