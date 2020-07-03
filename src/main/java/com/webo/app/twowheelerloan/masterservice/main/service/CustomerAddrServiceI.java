package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerAddress;

public interface CustomerAddrServiceI {
	
	public void addCustomerAddress(CustomerAddress customerAddress);
	
	public List<CustomerAddress> readCustomerBankDetails();
	
	public Optional<CustomerAddress> getCustomerAddressDatabyId(int id);
	
	public void updateCustomerAddress(CustomerAddress addr);
	
	public void delete(int id);

}


