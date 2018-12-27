package com.app.extremity.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BikeModel {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String bikeModelId;

	public String getBikeModelId() {
		return bikeModelId;
	}

	public void setBikeModelId(String bikeModelId) {
		this.bikeModelId = bikeModelId;
	}

	private String modelName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "engineCapacityId")
	private EngineCapacity enginecapacity;


	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Color>colors=new HashSet<Color>();

	private String image;
<<<<<<< HEAD

	public String getImage() {
=======
	
	
	public String getImage(){
>>>>>>> branch 'master' of https://github.com/CJC-98/ROYAL_ENFIELD.git
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public EngineCapacity getEnginecapacity() {
		return enginecapacity;
	}

	public void setEnginecapacity(EngineCapacity enginecapacity) {
		this.enginecapacity = enginecapacity;
	}

	public Set<Color> getColors() {
		return getColors();
	}

}