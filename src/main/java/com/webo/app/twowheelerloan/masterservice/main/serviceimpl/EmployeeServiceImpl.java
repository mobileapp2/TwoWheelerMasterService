package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.EmployeeRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{

	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public EmployeeDetails addEmployeeDetailsData(EmployeeDetails employeeDetails) 
	{	
		return employeeRepo.save(employeeDetails);
	}

	@Override
	public List<EmployeeDetails> getEmployeeDetails()
	{
		return employeeRepo.findAll();
	}

	@Override
	public Optional<EmployeeDetails> getEmployeeDetailsById(int id) 
	{
		return employeeRepo.findById(id);
	}

	@Override
	public EmployeeDetails updateEmployeeDetails(EmployeeDetails employeeDetails) 
	{
		return employeeRepo.save(employeeDetails);
	}

	@Override
	public void deleteEmployeeDetails(int id)
	{
		employeeRepo.deleteById(id);
	}



}
