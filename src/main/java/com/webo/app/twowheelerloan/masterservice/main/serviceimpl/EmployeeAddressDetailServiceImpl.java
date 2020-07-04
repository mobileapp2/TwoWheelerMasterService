package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.EmployeeAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.EmployeeAddressDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.EmployeeAddressDetailsServiceI;



@Service
//@Transactional
public class EmployeeAddressDetailServiceImpl implements EmployeeAddressDetailsServiceI{

	@Autowired EmployeeAddressDetailsRepo repo;

	@Override
	public void insertEmployeeAddressDetails(EmployeeAddressDetails empaddetail) {
		repo.save(empaddetail);
	}

	@Override
	public List<EmployeeAddressDetails> getEmployeeAddressDetails() {
		return repo.findAll();
	}

	@Override
	public EmployeeAddressDetails getEmployeeAddressDetailsDatabyId(int empAddId) {	
		return repo.findById(empAddId).get();
	}

	@Override
	public void updategetEmployeeAddressDetails(EmployeeAddressDetails empaddetail ) {
		repo.save(empaddetail);
	}

	@Override
	public void deleteEmployeeAddressDetails(int empAddId) {
		repo.deleteById(empAddId);
	}

	
	

	

}
