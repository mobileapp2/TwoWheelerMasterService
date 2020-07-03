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

import com.webo.app.twowheelerloan.masterservice.main.model.Customer_Bank_Details;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.ServiceImplForCustomerBankDetails;

@RestController
@CrossOrigin("*")
public class Customer_Bank_DetailsController {
	
	@Autowired
	ServiceImplForCustomerBankDetails s ;
	
	@PostMapping(value = "/customerbank")
	public void addData(@RequestBody Customer_Bank_Details CustomerBankDetails) {
		s.insertCustomerBankDetails(CustomerBankDetails);
		
	}
	
	@GetMapping(value = "/customerbank")
	public List<Customer_Bank_Details> getData(){
		List<Customer_Bank_Details> list = s.readCustomerBankDetails();
		return list;
	}
	
	@GetMapping(value = "/customerbank/{id}")
	public Optional<Customer_Bank_Details> getDatabyId(@PathVariable("id") int id) {
		Optional<Customer_Bank_Details> CustomerBankDetails=s.getCustomerBankDetailsDatabyId(id);
		return CustomerBankDetails;
	}
	
	@PutMapping(value = "/customerbank")
	public void updateData(@RequestBody Customer_Bank_Details CustomerBankDetails) {
		
		s.updateCustomerBankDetails(CustomerBankDetails);
		
	}
	
	@DeleteMapping(value = "/customerbank/{id}")
	public void delete(@PathVariable("id") int id) {
		
		s.deleteCustomerBankDetails(id);
	}
	
	

	

}
