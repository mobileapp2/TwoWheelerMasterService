package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.EmployeeServiceI;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeServiceI employeeServiceInter;
	
	@RequestMapping(value = "/employeeDetail",method = RequestMethod.POST)
	public void addData(@RequestBody EmployeeDetails employeeDetails)
	{
		employeeServiceInter.addEmployeeDetailsData(employeeDetails);
	}
	
	@RequestMapping(value = "/employeeDetails",method = RequestMethod.GET)
	public List<EmployeeDetails> getData()
	{
		return employeeServiceInter.getEmployeeDetails();
	}
		
	@RequestMapping(value = "/employeeDetail/{id}",method = RequestMethod.GET)
	public Optional<EmployeeDetails> getDataById(@PathVariable int id)
	{
		return employeeServiceInter.getEmployeeDetailsById(id);
	}
	
	@RequestMapping(value = "/employeeDetail",method = RequestMethod.PUT)
	public EmployeeDetails updateData(@RequestBody EmployeeDetails employeeDetails)
	{
		return employeeServiceInter.updateEmployeeDetails(employeeDetails);
	}
	
	@RequestMapping(value = "/employeeDetail/{id}",method = RequestMethod.DELETE)
	public void deleteData(@PathVariable int id)
	{
		employeeServiceInter.deleteEmployeeDetails(id);
	}
}	


