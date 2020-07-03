package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerAddress;
import com.webo.app.twowheelerloan.masterservice.main.repository.CustomerAddrRepository;
import com.webo.app.twowheelerloan.masterservice.main.service.CustomerAddrServiceI;


@Service
public class CustomerAddrServiceImpl implements CustomerAddrServiceI{
	
	@Autowired
	private CustomerAddrRepository customerAddrRepository;

	@Override
	public void addCustomerAddress(CustomerAddress customerAddress) {
		// TODO Auto-generated method stub
		customerAddrRepository.save(customerAddress);
	}

	@Override
	public List<CustomerAddress> readCustomerBankDetails() {
		// TODO Auto-generated method stub
		return (List<CustomerAddress>) customerAddrRepository.findAll();
	}

	@Override
	public Optional<CustomerAddress> getCustomerAddressDatabyId(int id) {
		// TODO Auto-generated method stub
		return customerAddrRepository.findById(id);
	}

	

	@Override
	public void updateCustomerAddress(CustomerAddress addr) {

		customerAddrRepository.save(addr);

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		customerAddrRepository.deleteById(id);
	}

	


}
