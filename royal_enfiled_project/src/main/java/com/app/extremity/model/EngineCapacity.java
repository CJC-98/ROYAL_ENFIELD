package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EngineCapacity
{
	@Id
	private String engineId;
	private String engineType;
	public String getEngineId() {
		return engineId;
	}
	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
}	