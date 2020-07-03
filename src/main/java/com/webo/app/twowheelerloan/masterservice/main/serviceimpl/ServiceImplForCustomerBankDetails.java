package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Customer_Bank_Details;
import com.webo.app.twowheelerloan.masterservice.main.repository.RepoForCustomerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.ServiceIForCustomerBankDetails;

@Service
public class ServiceImplForCustomerBankDetails implements ServiceIForCustomerBankDetails {

	@Autowired
	RepoForCustomerBankDetails repo;

	public void insertCustomerBankDetails(Customer_Bank_Details CustomerBankDetails) {

		repo.save(CustomerBankDetails);
	}

	public Optional<Customer_Bank_Details> getCustomerBankDetailsDatabyId(int id) {

		return repo.findById(id);
	}

	public List<Customer_Bank_Details> readCustomerBankDetails() {

		return repo.findAll();
	}

	public void updateCustomerBankDetails(Customer_Bank_Details addr) {

		repo.save(addr);

	}

	public void deleteCustomerBankDetails(int id) {

		repo.deleteById(id);
	}


}
