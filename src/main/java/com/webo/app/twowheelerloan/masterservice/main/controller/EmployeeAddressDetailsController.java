package com.webo.app.twowheelerloan.masterservice.main.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.EmployeeAddressDetailsServiceI;



@RestController
public class EmployeeAddressDetailsController {

	@Autowired EmployeeAddressDetailsServiceI EmpAddService;
		@PostMapping(value = "/employeeaddresses")
	public void insertEmployeeAddressDetails(@RequestBody EmployeeAddressDetails DealerBankDetails) {
	EmpAddService.insertEmployeeAddressDetails(DealerBankDetails);

	}

	@GetMapping(value = "/employeeaddress")
	public List<EmployeeAddressDetails> getEmployeeAddressDetails(){
	List<EmployeeAddressDetails> list = EmpAddService.getEmployeeAddressDetails();

	return list;
	}

	@GetMapping(value = "/employeeaddress/{empAddId}")
	public EmployeeAddressDetails getEmployeeAddressDetailsDatabyId(@PathVariable("empAddId") int id) {
	EmployeeAddressDetails empdata=EmpAddService.getEmployeeAddressDetailsDatabyId(id);
	return empdata;
	}
	
@PutMapping(value = "/employeeaddress/{empAddId}")
	public void updategetEmployeeAddressDetails(@RequestBody EmployeeAddressDetails Dealer_Bank_Details) {

	EmpAddService.updategetEmployeeAddressDetails(Dealer_Bank_Details);

	}

	@DeleteMapping(value = "/employeeaddress/{empAddId}")
	public void deleteEmployeeAddressDetails(@PathVariable("empAddId") int id) {

		EmpAddService.deleteEmployeeAddressDetails(id);
	}

	
}
