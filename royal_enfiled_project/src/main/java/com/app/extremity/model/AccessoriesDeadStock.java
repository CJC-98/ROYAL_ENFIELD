package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

<<<<<<< HEAD
@Entity
public class AccessoriesDeadStock {
=======
@Entity

public class AccessoriesDeadStock
{     


>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
	@Id
// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String accessoriesDeadStockId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "partId")
	private AccessoriesStock acd;

	public String getAccessoriesDeadStockID() {
<<<<<<< HEAD
		return accessoriesDeadStockId;
	}

=======
		return accessoriesDeadStockID;
	} 
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
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