package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetail;

public interface CustomerBankDetailServiceI {

	public void addCustomerBankDetailData(CustomerBankDetail CustomerBankDetail);

	public List<CustomerBankDetail> getCustomerBankDetailData();

	public CustomerBankDetail getCustomerBankDetailDataById(Integer id);

	public void deleteCustomerBankDetailData(Integer id);
	
	public void updatecustomerBankDetailData(CustomerBankDetail customerBankDetail );

}
