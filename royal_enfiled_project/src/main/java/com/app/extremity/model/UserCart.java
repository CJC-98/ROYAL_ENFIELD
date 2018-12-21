package com.app.extremity.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserCart {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userCartId;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Registration registration;
	
	@OneToOne(cascade=CascadeType.ALL)
	private CartInvoice cartInvoice;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<BikeCustomization> bikeCustomization = new ArrayList();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<BikeServicing> bikeServicing = new ArrayList();
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<BikeSaleForUser> bikeSaleForUser = new ArrayList();

	@OneToMany(cascade=CascadeType.ALL)
	private List<AccessoriesStock> accessoriesStock = new ArrayList();

	
	
	public int getUserCartId() {
		return userCartId;
	}

	public void setUserCartId(int userCartId) {
		this.userCartId = userCartId;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public CartInvoice getCartInvoice() {
		return cartInvoice;
	}

	public void setCartInvoice(CartInvoice cartInvoice) {
		this.cartInvoice = cartInvoice;
	}

	public List<BikeCustomization> getBikeCustomization() {
		return bikeCustomization;
	}

	public void setBikeCustomization(List<BikeCustomization> bikeCustomization) {
		this.bikeCustomization = bikeCustomization;
	}

	public List<BikeServicing> getBikeServicing() {
		return bikeServicing;
	}

	public void setBikeServicing(List<BikeServicing> bikeServicing) {
		this.bikeServicing = bikeServicing;
	}

	public List<BikeSaleForUser> getBikeSaleForUser() {
		return bikeSaleForUser;
	}

	public void setBikeSaleForUser(List<BikeSaleForUser> bikeSaleForUser) {
		this.bikeSaleForUser = bikeSaleForUser;
	}

	public List<AccessoriesStock> getAccessoriesStock() {
		return accessoriesStock;
	}

	public void setAccessoriesStock(List<AccessoriesStock> accessoriesStock) {
		this.accessoriesStock = accessoriesStock;
	}


	
}
