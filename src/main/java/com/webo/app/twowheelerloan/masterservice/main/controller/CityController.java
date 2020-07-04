package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.webo.app.twowheelerloan.masterservice.main.model.City;
import com.webo.app.twowheelerloan.masterservice.main.service.CityServiceI;

@RestController
public class CityController {

	@Autowired
	private CityServiceI cityService;

	@PostMapping(value = "/city")
	public void insertCityData(@RequestBody City city) {
		cityService.insertCityData(city);
	}

	@GetMapping(value = "/city")
	public List<City> getCityData() {
		return cityService.getCityData();
	}

	@GetMapping(value = "/city/{id}")
	public City getcityDatabyId(@PathVariable("id") int id) {
		return cityService.getcityDatabyId(id);
	}

	@PutMapping(value = "/city")
	public void updateCityDetails(@RequestBody City city) {
		cityService.updateCityDetails(city);
	}

	@DeleteMapping(value = "/city/{id}")
	public void deleteCity(@PathVariable("id") int id) {
		cityService.deleteCity(id);
	}

}

