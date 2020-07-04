package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchAddressDetailsServiceI;

@RestController
@CrossOrigin("*")
public class BranchAddressDetailsController {

	@Autowired
	private BranchAddressDetailsServiceI branchaddressDetailsServiceImpl;

	@PostMapping(value = "/branchaddressDetails")
	public void addData(@RequestBody BranchAddressDetails branchaddressDetails) {
		branchaddressDetailsServiceImpl.insertBranchAddressDetails(branchaddressDetails);
	}

	@GetMapping(value = "/branchaddressDetails")
	public List<BranchAddressDetails> getData() {
		List<BranchAddressDetails> list = branchaddressDetailsServiceImpl.readBranchAddressDetails();
		return list;
	}

	@GetMapping(value = "/branchaddressDetails/{id}")
	public Optional<BranchAddressDetails> getDatabyId(@PathVariable("id") int id) {
		Optional<BranchAddressDetails> branchaddressDetails = branchaddressDetailsServiceImpl
				.getbranchAddressDetailsDatabyId(id);
		return branchaddressDetails;

	}

	@PutMapping(value = "/branchaddressDetails")
	public void updateData(@RequestBody BranchAddressDetails branchaddressDetails) {
		branchaddressDetailsServiceImpl.updatebranchAddressDetails(branchaddressDetails);
	}

	@DeleteMapping(value = "/branchaddressDetails/{id}")
	public void delete(@PathVariable("id") int id) {
		branchaddressDetailsServiceImpl.deletebranchAddressDetails(id);
	}

}
