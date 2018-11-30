package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Individual User ;
 * This pojo is helpful for evaluate the rank of bike according to the km run;
 */


@Entity
public class KmRank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int kmId;
	private long km;
	private int kmRank;
	public int getKmId() {
		return kmId;
	}
	public void setKmId(int kmId) {
		this.kmId = kmId;
	}
	public long getKm() {
		return km;
	}
	public void setKm(long km) {
		this.km = km;
	}
	public int getKmRank() {
		return kmRank;
	}
	public void setKmRank(int kmRank) {
		this.kmRank = kmRank;
	}
	
	
}
