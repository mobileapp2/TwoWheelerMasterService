package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.BranchAddressDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchAddressDetailsServiceI;

@Service
public class BranchAddressDetailsServiceImpl implements BranchAddressDetailsServiceI {

	@Autowired
	BranchAddressDetailsRepo branchAddressDetailsRepo;

	@Override
	public void insertBranchAddressDetails(BranchAddressDetails branchaddressDetails) {
		branchAddressDetailsRepo.save(branchaddressDetails);

	}

	public List<BranchAddressDetails> readBranchAddressDetails() {

		return branchAddressDetailsRepo.findAll();
	}

	public Optional<BranchAddressDetails> getbranchAddressDetailsDatabyId(int id) {

		return branchAddressDetailsRepo.findById(id);
	}

	public void updatebranchAddressDetails(BranchAddressDetails branchaddressDetails) {
		branchAddressDetailsRepo.save(branchaddressDetails);

	}

	public void deletebranchAddressDetails(int id) {

		branchAddressDetailsRepo.deleteById(id);
	}

}
