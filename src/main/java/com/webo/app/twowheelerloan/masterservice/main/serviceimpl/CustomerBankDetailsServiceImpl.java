package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.CustomerBankDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.CustomerBankDetailsServiceI;

@Service
public class CustomerBankDetailsServiceImpl implements CustomerBankDetailsServiceI {

	@Autowired
	CustomerBankDetailsRepo repo;

	public void insertCustomerBankDetails(CustomerBankDetails CustomerBankDetails) {

		repo.save(CustomerBankDetails);
	}

	public Optional<CustomerBankDetails> getCustomerBankDetailsDatabyId(int id) {

		return repo.findById(id);
	}

	public List<CustomerBankDetails> readCustomerBankDetails() {

		return repo.findAll();
	}

	public void updateCustomerBankDetails(CustomerBankDetails addr) {

		repo.save(addr);

	}

	public void deleteCustomerBankDetails(int id) {

		repo.deleteById(id);
	}


}
