package com.webo.app.twowheelerloan.masterservice.main.service;


import java.util.List;
import java.util.Optional;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchDetails;

public interface BranchDetailsServiceI {
	
	public void insertBranchDetails(BranchDetails BranchDetails);
	public List<BranchDetails> readBranchDetails();
	public void updateBranchDetails(BranchDetails BranchDetails);
	public void deleteBranchDetails(int id);
	public Optional<BranchDetails> getBranchDetailsDatabyId(int id);


}
