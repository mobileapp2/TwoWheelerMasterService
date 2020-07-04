package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class City {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Integer cityId;
	private String cityName;
	private int cityCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private State citystate;
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getCityCode() {
		return cityCode;
	}
	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}
	public State getCitystate() {
		return citystate;
	}
	public void setCitystate(State citystate) {
		this.citystate = citystate;
	}


}
