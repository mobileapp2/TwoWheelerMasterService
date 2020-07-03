package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import com.webo.app.twowheelerloan.masterservice.main.model.Country;



public interface CountryService {

	public void addCountry(Country country);

	public List<Country> getCountryList();

	public Country getCountryById(Integer id);

	public void deleteCountry(Integer id);
	
	public void updateCountry(Country country);
}
