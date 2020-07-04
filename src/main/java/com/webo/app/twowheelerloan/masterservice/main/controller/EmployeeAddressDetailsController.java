package com.webo.app.twowheelerloan.masterservice.main.controller;


import java.util.List;
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

	@Autowired 
	private EmployeeAddressDetailsServiceI empAddService;
	
	
	@PostMapping(value = "/employeeaddress")
	public void insertEmployeeAddressDetails(@RequestBody EmployeeAddressDetails employeeAddressDetails) {
	empAddService.insertEmployeeAddressDetails(employeeAddressDetails);

	}

	@GetMapping(value = "/employeeaddress")
	public List<EmployeeAddressDetails> getEmployeeAddressDetails(){
	List<EmployeeAddressDetails> list = empAddService.getEmployeeAddressDetails();

	return list;
	}

	@GetMapping(value = "/employeeaddress/{id}")
	public EmployeeAddressDetails getEmployeeAddressDetailsDatabyId(@PathVariable("id") int id) {
	EmployeeAddressDetails empdata=empAddService.getEmployeeAddressDetailsDatabyId(id);
	return empdata;
	}
	
	@PutMapping(value = "/employeeaddress")
	public void updategetEmployeeAddressDetails(@RequestBody EmployeeAddressDetails employeeAddressDetails) {

	empAddService.updategetEmployeeAddressDetails(employeeAddressDetails);

	}

	@DeleteMapping(value = "/employeeaddress/{id}")
	public void deleteEmployeeAddressDetails(@PathVariable("id") int id) {

		empAddService.deleteEmployeeAddressDetails(id);
	}

	
}
