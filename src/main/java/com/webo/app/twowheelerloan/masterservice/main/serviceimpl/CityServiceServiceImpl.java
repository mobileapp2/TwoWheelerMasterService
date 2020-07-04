package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.City;
import com.webo.app.twowheelerloan.masterservice.main.repository.CityRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.CityServiceI;

@Service
//@Transactional
public class CityServiceServiceImpl implements CityServiceI {

	@Autowired
	CityRepo cityRepo;

	@Override
	public void insertCityData(City city) {
		cityRepo.save(city);
	}

	@Override
	public List<City> getCityData() {
		return cityRepo.findAll();
	}

	@Override
	public City getcityDatabyId(int cityId) {
		return cityRepo.findById(cityId).get();
	}

	@Override
	public void updateCityDetails(City city) {
		cityRepo.save(city);
	}

	@Override
	public void deleteCity(int cityId) {
		cityRepo.deleteById(cityId);
	}

}
