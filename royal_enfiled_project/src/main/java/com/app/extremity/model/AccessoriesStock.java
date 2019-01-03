package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.ui.Model;

//to order accessories
@Entity
public class AccessoriesStock {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String accessoriesStockId;
	private String partName;
	private String partPrice; 
	private long partQuantity;
	//@OneToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="bikeModelId")
	// private Model model;

	public String getAccessoriesStockId() {
		return accessoriesStockId;
	}

	public void setAccessoriesStockId(String accessoriesStockId) {
		this.accessoriesStockId = accessoriesStockId;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(String partPrice) {
		this.partPrice = partPrice;
	}

	public long getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(long partQuantity) {
		this.partQuantity = partQuantity;
	}

}
