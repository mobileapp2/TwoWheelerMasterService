package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeDetails;

public interface EmployeeServiceInter 
{

	public EmployeeDetails addEmployeeDetailsData(EmployeeDetails employeeDetails);
	
	public List<EmployeeDetails> getEmployeeDetails();
	
	public Optional<EmployeeDetails> getEmployeeDetailsById(int id);
	
	public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails);
	
	public void deleteEmployeeDetails(int id);
}
