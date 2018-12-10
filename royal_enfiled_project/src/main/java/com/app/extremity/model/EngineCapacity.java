package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EngineCapacity
{
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String engineCapacityId;
	private String engineType;
	
	public String getEngineCapacityId() {
		return engineCapacityId;
	}

	public void setEngineCapacityId(String engineCapacityId) {
		this.engineCapacityId = engineCapacityId;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}	