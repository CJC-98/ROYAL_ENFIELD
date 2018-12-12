package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
 public class Color
{
	@Id
private String colorId;
private String colorName;
public String getColorId() {
	return colorId;
}
public void setColorId(String colorId) {
	this.colorId = colorId;
}
public String getColorName() {
	return colorName;
}
public void setColorName(String colorName) {
	this.colorName = colorName;
}
}