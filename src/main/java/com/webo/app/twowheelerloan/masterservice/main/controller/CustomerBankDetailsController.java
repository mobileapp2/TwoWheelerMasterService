package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.CustomerBankDetailsServiceImpl;

@RestController
@CrossOrigin("*")
public class CustomerBankDetailsController {
	
	@Autowired
	CustomerBankDetailsServiceImpl s ;
	
	@PostMapping(value = "/customerbank")
	public void addData(@RequestBody CustomerBankDetails CustomerBankDetails) {
		s.insertCustomerBankDetails(CustomerBankDetails);
		
	}
	
	@GetMapping(value = "/customerbank")
	public List<CustomerBankDetails> getData(){
		List<CustomerBankDetails> list = s.readCustomerBankDetails();
		return list;
	}
	
	@GetMapping(value = "/customerbank/{id}")
	public Optional<CustomerBankDetails> getDatabyId(@PathVariable("id") int id) {
		Optional<CustomerBankDetails> CustomerBankDetails=s.getCustomerBankDetailsDatabyId(id);
		return CustomerBankDetails;
	}
	
	@PutMapping(value = "/customerbank")
	public void updateData(@RequestBody CustomerBankDetails CustomerBankDetails) {
		
		s.updateCustomerBankDetails(CustomerBankDetails);
		
	}
	
	@DeleteMapping(value = "/customerbank/{id}")
	public void delete(@PathVariable("id") int id) {
		
		s.deleteCustomerBankDetails(id);
	}
	
	

	

}
