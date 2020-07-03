package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.CustomerBankDetail;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.CustomerBankDetailServiceImpl;

@RestController
	public class CustomerBankDetailController {
		
	@Autowired CustomerBankDetailServiceImpl customerBankDetailServiceImpl ;
	
	 @RequestMapping(value="/customerBankDetail",method=RequestMethod.POST)
	 public void addCustomerBankDetail(@RequestBody CustomerBankDetail customerBankDetail ){
		 customerBankDetailServiceImpl.addCustomerBankDetailData(customerBankDetail);
	 }
	 
	 @RequestMapping(value="/customerBankDetail",method=RequestMethod.GET)
	 public List getCustomerBankDetailData(){
		return  customerBankDetailServiceImpl.getCustomerBankDetailData();
	 }
	 
	 @RequestMapping(value="/customerBankDetail/{id}",method=RequestMethod.GET)
	 public CustomerBankDetail getCustomerBankDetailDataById(@PathVariable("id") Integer id){
		 return customerBankDetailServiceImpl.getCustomerBankDetailDataById(id);
	 }
	 
	 @RequestMapping(value="customerBankDetail/{id}",method=RequestMethod.DELETE)
		 public void deleteCustomerBankDetailData(Integer id){
			 customerBankDetailServiceImpl.deleteCustomerBankDetailData(id);
		 
	 }
	 
	 @RequestMapping(value="customerBankDetail",method=RequestMethod.PUT)
	 public void updateCustomerBankDetailData(@RequestBody CustomerBankDetail customerBankDetail ){
		 customerBankDetailServiceImpl.updatecustomerBankDetailData(customerBankDetail);
	 }

		
	}	


