package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
//only for sale and admin..
@Entity
public class DeadStock
{
	@Id
	private String deadStockId;
	@OneToOne(cascade=CascadeType.ALL)
	private NewBikeStock deadBikeStock;
	public NewBikeStock getDeadBikeStock() {
		return deadBikeStock;
	}
	public void setDeadBikeStock(NewBikeStock deadBikeStock) {
		this.deadBikeStock = deadBikeStock;
	}
	public String getDeadStockId() {
		return deadStockId;
	}
	public void setDeadStockId(String deadStockId) {
		this.deadStockId = deadStockId;
	}
	
}