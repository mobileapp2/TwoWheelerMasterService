package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private String stateName;
	private int StateCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Country stateCountry;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public int getStateCode() {
		return StateCode;
	}
	public void setStateCode(int stateCode) {
		StateCode = stateCode;
	}
	public Country getStateCountry() {
		return stateCountry;
	}
	public void setStateCountry(Country stateCountry) {
		this.stateCountry = stateCountry;
	}
	
	
}
