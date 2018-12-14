package com.app.extremity.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Individual User ;
 * This pojo is helpful for evaluate the rank of bike according to the Model and its price;
 */

@Entity
public class ModelRank {
@Id
private int modelRankId;
private String modelName;
private long price;
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
private int modelRank;
public int getModelRankId() {
	return modelRankId;
}
public void setModelRankId(int modelRankId) {
	this.modelRankId = modelRankId;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
public int getModelRank() {
	return modelRank;
}
public void setModelRank(int modelRank) {
	this.modelRank = modelRank;
}

}

