package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerAddress;
import com.webo.app.twowheelerloan.masterservice.main.service.CustomerAddrServiceI;

@RestController
public class CustomerAddressController {

	@Autowired
	private CustomerAddrServiceI s;

	@RequestMapping(value = "/addCustomerAddressDetail", method = RequestMethod.POST)
	public void addCustomerAddress(@RequestBody CustomerAddress customerAddress) {
		s.addCustomerAddress(customerAddress);
		System.out.println("Data Succeccfully Added");
	}

	@RequestMapping(value = "/getCustomerAddressData", method = RequestMethod.GET)
	public List<CustomerAddress> getAllData() {
		List<CustomerAddress> list = s.readCustomerBankDetails();
		return list;

	}

	
	@GetMapping(value = "/getCustomerAddressById/{id}")
	  public Optional<CustomerAddress> getDataById(@PathVariable("id") int id) 
	  {
		
		   Optional<CustomerAddress> cuOptional =s.getCustomerAddressDatabyId(id);
	       return cuOptional;
	  }
	
	
	@PostMapping(path = "/updateCustomerAddressData")
	public void updateData(@RequestBody CustomerAddress customerAddress) {
		s.updateCustomerAddress(customerAddress);
	}

	@RequestMapping(value = "/deleteCustomerData/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") int id) {
		s.delete(id);
	}

}
