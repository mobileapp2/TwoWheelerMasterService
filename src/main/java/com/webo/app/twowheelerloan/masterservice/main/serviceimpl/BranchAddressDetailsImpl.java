package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.webo.app.twowheelerloan.masterservice.main.model.BranchAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.BranchAddressDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchAddressDetailsI;
@Service
public class BranchAddressDetailsImpl implements BranchAddressDetailsI {
	@Autowired
	
	BranchAddressDetailsRepo re;

	@Override
	public void insertBranchAddressDetails(BranchAddressDetails branchaddressDetails) {
		re.save(branchaddressDetails);
		
	}

	public List<BranchAddressDetails> readBranchAddressDetails() {
		
		return re.findAll();
	}

	public Optional<BranchAddressDetails> getbranchAddressDetailsDatabyId(int id) {
		
		return re.findById(id);
	}


	public void updatebranchAddressDetails(BranchAddressDetails branchaddressDetails) {
		re.save(branchaddressDetails);
		
	}

	public void deletebranchAddressDetails(int id) {
		
		re.deleteById(id);
	}

	
		
	}
	

	
		
	

	
		
		
	

	

