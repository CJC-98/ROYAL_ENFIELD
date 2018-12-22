package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class DealerBikes {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private float bikeShowroomPrize;
	private String bikeModelName;
	private String imgName;

	
	public float getBikeShowroomPrize() {
		return bikeShowroomPrize;
	}
	public void setBikeShowroomPrize(float bikeShowroomPrize) {
		this.bikeShowroomPrize = bikeShowroomPrize;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBikeModelName() {
		return bikeModelName;
	}
	public void setBikeModelName(String bikeModelName) {
		this.bikeModelName = bikeModelName;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	}
