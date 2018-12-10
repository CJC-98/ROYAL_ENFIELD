package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
//only for sale and admin..
@Entity
public class DeadStock
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String deadStockId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="newBikeStockId")
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