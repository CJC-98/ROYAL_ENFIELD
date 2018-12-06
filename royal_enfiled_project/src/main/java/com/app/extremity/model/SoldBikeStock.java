package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SoldBikeStock {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String soldBikeStockId;

	public String getSoldBikeStockId() {
		return soldBikeStockId;
	}

	public void setSoldBikeStockId(String soldBikeStockId) {
		this.soldBikeStockId = soldBikeStockId;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "modelId")
	private BikeModel bikeModel; // model name (Classic, Electra, Thunderbird,
									// Himalyan, Continental, Interceptor)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engineId")
	private EngineCapacity bikeEngineCapacity; // 350cc or 500cc
	private String chasisNumber;
	private String bikewheel;// alloy wheel,spoke
	private String bikeOnRoadPrice;
	private String engineStartingType;// kick or Self Start
	private String invoice;// bill genertion
	// @ManyToOne(cascade=CascadeType.ALL)
	// private User user;

	public BikeModel getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(BikeModel bikeModel) {
		this.bikeModel = bikeModel;
	}

	public EngineCapacity getBikeEngineCapacity() {
		return bikeEngineCapacity;
	}

	public void setBikeEngineCapacity(EngineCapacity bikeEngineCapacity) {
		this.bikeEngineCapacity = bikeEngineCapacity;
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public String getBikewheel() {
		return bikewheel;
	}

	public void setBikewheel(String bikewheel) {
		this.bikewheel = bikewheel;
	}

	public String getBikeOnRoadPrice() {
		return bikeOnRoadPrice;
	}

	public void setBikeOnRoadPrice(String bikeOnRoadPrice) {
		this.bikeOnRoadPrice = bikeOnRoadPrice;
	}

	public String getEngineStartingType() {
		return engineStartingType;
	}

	public void setEngineStartingType(String engineStartingType) {
		this.engineStartingType = engineStartingType;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

}
