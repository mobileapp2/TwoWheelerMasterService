package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.Country;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.CountryServiceImpl;

@RestController
public class CountryContoller {
	@Autowired 
	private CountryServiceImpl countryServiceImpl;

	@RequestMapping(value="/country", method=RequestMethod.POST)
	public void addCountry(@RequestBody Country country){
		countryServiceImpl.addCountry(country);
	}

	@RequestMapping(value="/country",method=RequestMethod.GET)
	public List<Country> getCountryList(){
		return countryServiceImpl.getCountryList();
	}

	@RequestMapping(value="/country/{id}",method=RequestMethod.GET)
	public Country getCountryById(@PathVariable Integer id){
		return countryServiceImpl.getCountryById(id);
	}

	@RequestMapping(value="/country/{id}",method=RequestMethod.DELETE)
	public void deleteCountry(@PathVariable Integer id){
		countryServiceImpl.deleteCountry(id);
	}
	
	@RequestMapping(value="/country",method=RequestMethod.PUT)
	public void updateCountry(@RequestBody Country country){
		countryServiceImpl.updateCountry(country);
	}
}
