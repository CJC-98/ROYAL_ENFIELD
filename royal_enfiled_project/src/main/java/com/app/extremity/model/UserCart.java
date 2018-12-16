package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserCart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userCartId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Product product;
	
	@OneToOne(cascade=CascadeType.ALL)
	private BikeCustomization bikecustomization;

	public int getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(int userCartId) {
		this.userCartId = userCartId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public BikeCustomization getBikecustomization() {
		return bikecustomization;
	}

	public void setBikecustomization(BikeCustomization bikecustomization) {
		this.bikecustomization = bikecustomization;
	}
	
}
