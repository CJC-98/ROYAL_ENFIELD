package com.app.extremity.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class BikeModel
{
	@Id
	private String modelId;
	private String modelName;
	@OneToOne(cascade=CascadeType.ALL)
	private EngineCapacity enginecapacity;
	@OneToMany(cascade=CascadeType.ALL)
	private Color color;
	public String getModelId() {
		return modelId;
	}
	public void setModelId(String modelId) {
		this.modelId = modelId;
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
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
}