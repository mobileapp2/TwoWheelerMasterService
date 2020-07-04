package com.webo.app.twowheelerloan.masterservice.main.service;


import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetails;

public interface CustomerBankDetailsServiceI {
	
	public void insertCustomerBankDetails(CustomerBankDetails addr);
	public List<CustomerBankDetails> readCustomerBankDetails();
	public void updateCustomerBankDetails(CustomerBankDetails addr);
	public void deleteCustomerBankDetails(int id);
	public Optional<CustomerBankDetails> getCustomerBankDetailsDatabyId(int id);


}
