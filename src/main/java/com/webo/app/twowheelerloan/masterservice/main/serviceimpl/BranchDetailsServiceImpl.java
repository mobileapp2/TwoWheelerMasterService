package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.BranchDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchDetailsServiceI;

@Service
public class BranchDetailsServiceImpl implements BranchDetailsServiceI {

	@Autowired
	BranchDetailsRepo branchDetailsRepo;

	public void insertBranchDetails(BranchDetails BranchDetails) {

		branchDetailsRepo.save(BranchDetails);
	}

	public Optional<BranchDetails> getBranchDetailsDatabyId(int id) {

		return branchDetailsRepo.findById(id);
	}

	public List<BranchDetails> readBranchDetails() {

		return branchDetailsRepo.findAll();
	}

	public void updateBranchDetails(BranchDetails BranchDetails) {

		branchDetailsRepo.save(BranchDetails);

	}

	public void deleteBranchDetails(int id) {

		branchDetailsRepo.deleteById(id);
	}

}
