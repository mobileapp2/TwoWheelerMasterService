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
import com.webo.app.twowheelerloan.masterservice.main.model.BranchDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchDetailsServiceI;

@RestController
@CrossOrigin("*")
public class BranchDetailsController {

	@Autowired
	private BranchDetailsServiceI branchDetailsServiceI;

	@PostMapping(value = "/BranchDetails")
	public void addData(@RequestBody BranchDetails BranchDetails) {
		branchDetailsServiceI.insertBranchDetails(BranchDetails);
	}

	@GetMapping(value = "/BranchDetails")
	public List<BranchDetails> getData() {
		List<BranchDetails> list = branchDetailsServiceI.readBranchDetails();
		return list;
	}

	@GetMapping(value = "/BranchDetails/{id}")
	public Optional<BranchDetails> getDatabyId(@PathVariable("id") int id) {
		Optional<BranchDetails> BranchDetails = branchDetailsServiceI.getBranchDetailsDatabyId(id);
		return BranchDetails;
	}

	@PutMapping(value = "/BranchDetails")
	public void updateData(@RequestBody BranchDetails BranchDetails) {

		branchDetailsServiceI.updateBranchDetails(BranchDetails);
	}

	@DeleteMapping(value = "/BranchDetails/{id}")
	public void delete(@PathVariable("id") int id) {

		branchDetailsServiceI.deleteBranchDetails(id);
	}

}
