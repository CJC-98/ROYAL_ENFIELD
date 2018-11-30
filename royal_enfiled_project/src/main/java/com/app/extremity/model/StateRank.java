package com.app.extremity.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @author Individual User ;
 * This pojo is helpful for evaluate the rank of bike according to the StateWise;
 */


@Entity
public class StateRank {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int stateRankId;
private String stateName;
private int stateRank;
public int getStateRankId() {
	return stateRankId;
}
public void setStateRankId(int stateRankId) {
	this.stateRankId = stateRankId;
}
public String getStateName() {
	return stateName;
}
public void setStateName(String stateName) {
	this.stateName = stateName;
}
public int getStateRank() {
	return stateRank;
}
public void setStateRank(int stateRank) {
	this.stateRank = stateRank;
}


}
