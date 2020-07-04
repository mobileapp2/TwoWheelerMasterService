package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeAddressDetails;

@Service
public interface EmployeeAddressDetailsServiceI {

	void insertEmployeeAddressDetails(EmployeeAddressDetails dealerBankDetails);

	List<EmployeeAddressDetails> getEmployeeAddressDetails();

	EmployeeAddressDetails getEmployeeAddressDetailsDatabyId(int id);

	void updategetEmployeeAddressDetails(EmployeeAddressDetails dealer_Bank_Details);

	void deleteEmployeeAddressDetails(int id);


	
	
	

}
