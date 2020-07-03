package com.webo.app.twowheelerloan.masterservice.main.service;



import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.BranchAddressDetails;

public interface BranchAddressDetailsI {
	public void insertBranchAddressDetails(BranchAddressDetails branchaddressDetails);
	public List<BranchAddressDetails> readBranchAddressDetails();
	public Optional<BranchAddressDetails> getbranchAddressDetailsDatabyId(int id);
	public void updatebranchAddressDetails(BranchAddressDetails branchaddressDetails);
	public void deletebranchAddressDetails(int id);
}
