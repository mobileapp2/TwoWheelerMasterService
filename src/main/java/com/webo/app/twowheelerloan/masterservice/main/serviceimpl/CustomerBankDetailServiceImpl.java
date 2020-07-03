package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetail;
import com.webo.app.twowheelerloan.masterservice.main.repository.CustomerBankDetailRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.CustomerBankDetailService;

@Service
public class CustomerBankDetailServiceImpl implements CustomerBankDetailService {

	@Autowired 
	CustomerBankDetailRepo customerBankDetailRepo;
	
	@Override
	public void addCustomerBankDetailData(CustomerBankDetail customerBankDetail) {
		
		customerBankDetailRepo.save(customerBankDetail);
	}

	@Override
	public List<CustomerBankDetail> getCustomerBankDetailData() {
		
			List<CustomerBankDetail> list=customerBankDetailRepo.findAll();
			return list;
		
		
	}

	@Override
	public CustomerBankDetail getCustomerBankDetailDataById(Integer id) {
		CustomerBankDetail customer =customerBankDetailRepo.findById(id).get();
		return customer;
	}
	

	@Override
	public void deleteCustomerBankDetailData(Integer id) {
		// TODO Auto-generated method stub
		customerBankDetailRepo.deleteById(id);
	}

	@Override
	public void updatecustomerBankDetailData(CustomerBankDetail customerBankDetail) {
		customerBankDetailRepo.save(customerBankDetail);
	}

	

}
