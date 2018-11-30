package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.ui.Model;

//to order accessories
@Entity
public class AccessoriesStock 
{
	@Id
	private String partId;
	private String partName;
	private String partPrice;
	private long partQuantity;
	@ManyToMany(cascade=CascadeType.ALL)
	private Model model;
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
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
}
