package com.webo.app.twowheelerloan.masterservice.main.service;


import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.Customer_Bank_Details;

public interface ServiceIForCustomerBankDetails {
	
	public void insertCustomerBankDetails(Customer_Bank_Details addr);
	public List<Customer_Bank_Details> readCustomerBankDetails();
	public void updateCustomerBankDetails(Customer_Bank_Details addr);
	public void deleteCustomerBankDetails(int id);
	public Optional<Customer_Bank_Details> getCustomerBankDetailsDatabyId(int id);


}
