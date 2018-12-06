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
public class BikeModel
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String modelId;
	private String modelName;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="engineid")
	private EngineCapacity enginecapacity;
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Color>colors=new HashSet<>();
	private String image;
	public String getImage(){
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
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
	public Set<Color> getColors() {
		return colors;
	}
	public void setColors(Set<Color> colors) {
		this.colors = colors;
	}
	
	
}