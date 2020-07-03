package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.RepoForBranchDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.ServiceIForBranchDetails;

@Service
public class ServiceImplForBranchDetails implements ServiceIForBranchDetails {

	@Autowired
	RepoForBranchDetails repo;

	public void insertBranchDetails(BranchDetails BranchDetails) {

		repo.save(BranchDetails);
	}

	public Optional<BranchDetails> getBranchDetailsDatabyId(int id) {

		return repo.findById(id);
	}

	public List<BranchDetails> readBranchDetails() {

		return repo.findAll();
	}

	public void updateBranchDetails(BranchDetails BranchDetails) {

		repo.save(BranchDetails);

	}

	public void deleteBranchDetails(int id) {

		repo.deleteById(id);
	}

}
