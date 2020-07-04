package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.City;

@Service
public interface CityServiceI {

	public void insertCityData(City city);
	public List<City> getCityData();
	public City getcityDatabyId(int id);
	public void updateCityDetails(City city);
	public void deleteCity(int id);




}
