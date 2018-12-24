package com.app.extremity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.ui.Model;

//to order accessories
@Entity
public class AccessoriesStock 
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String partId;
	private String partName;
	private String partPrice;
	private long partQuantity;


	//@OneToOne(cascade=CascadeType.ALL)
	//private Model model;
	
	

	public String getPartId() {
		return partId;
	}
	

	public void setPartId(String partId) {
		this.partId = partId;
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
