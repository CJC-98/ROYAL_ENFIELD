package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Individual User ;
 * This pojo is helpful for evaluate the rank of bike according to the Year of Manufacturing;
 */

@Entity
public class YearOfManufacturingRank {
@Id
private int yearRankId;
private String year;
private int yearRank;
public int getYearRankId() {
	return yearRankId;
}
public void setYearRankId(int yearRankId) {
	this.yearRankId = yearRankId;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public int getYearRank() {
	return yearRank;
}
public void setYearRank(int yearRank) {
	this.yearRank = yearRank;
}


}
