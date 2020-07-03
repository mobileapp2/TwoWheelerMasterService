package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.ServiceImplForDealerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.model.Dealer_Bank_Details;

@RestController
@CrossOrigin("*")
public class Dealer_Bank_DetailsController {
	
	@Autowired
	ServiceImplForDealerBankDetails s ;
	
	@PostMapping(value = "/dealerbank")
	public void addData(@RequestBody Dealer_Bank_Details DealerBankDetails) {
		s.insertDealerBankDetails(DealerBankDetails);;
		
	}
	
	@GetMapping(value = "/dealerbank")
	public List<Dealer_Bank_Details> getData(){
		List<Dealer_Bank_Details> list = s.readDealerBankDetails();
		
		return list;
	}
	
	@GetMapping(value = "/dealerbank/{id}")
	public Optional<Dealer_Bank_Details> getDatabyId(@PathVariable("id") int id) {
		Optional<Dealer_Bank_Details> city=s.getDealerBankDetailsDatabyId(id);
		return city;
	}
	
	public void updateData(@RequestBody Dealer_Bank_Details Dealer_Bank_Details) {
		
		s.updateDealerBankDetails(Dealer_Bank_Details);
		
	}
	
	@DeleteMapping(value = "/dealerbank/{id}")
	public void delete(@PathVariable("id") int id) {
		
		s.deleteDealerBankDetails(id);
	}
	
	

	

}
