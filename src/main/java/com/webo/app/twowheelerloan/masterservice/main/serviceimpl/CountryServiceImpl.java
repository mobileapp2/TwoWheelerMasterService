package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Country;
import com.webo.app.twowheelerloan.masterservice.main.repository.CountryRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	@Autowired CountryRepo countryRepo;

	@Override
	public void addCountry(Country country) {
		countryRepo.save(country);
	}

	@Override
	public List<Country> getCountryList() {
		return countryRepo.findAll();
	}

	@Override
	public Country getCountryById(Integer id) {
		return countryRepo.findById(id).get();
	}

	@Override
	public void deleteCountry(Integer id) {
		countryRepo.deleteById(id);
	}

	@Override
	public void updateCountry(Country country) {
		countryRepo.save(country);
	}

}
