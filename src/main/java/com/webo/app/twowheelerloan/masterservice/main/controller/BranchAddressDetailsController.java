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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.BranchAddressDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.BranchAddressDetailsServiceI;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.BranchAddressDetailsServiceImpl;

@RestController
@CrossOrigin("")
public class BranchAddressDetailsController {
	@Autowired
	BranchAddressDetailsServiceImpl bi;
	
	@PostMapping(value = "/branchaddress")
	public void addData(@RequestBody BranchAddressDetails branchaddressDetails)
	{
		bi.insertBranchAddressDetails(branchaddressDetails);
	}
	
	@GetMapping(value = "/getbranchaddressDetailsData")
	public List<BranchAddressDetails> getData()
	{
	 List<BranchAddressDetails> list=bi.readBranchAddressDetails();
	return list;
	}
	
	
	@GetMapping(value = "/getbranchaddressDetailsDataby/{id}")
	public Optional<BranchAddressDetails> getDatabyId(@PathVariable("id") int id)
	{
		Optional<BranchAddressDetails> branchaddressDetails=bi.getbranchAddressDetailsDatabyId(id);
		return  branchaddressDetails;
		
	}
	
	@PutMapping(value = "/updatebranchaddressDetailsData")
	public void updateData(@RequestBody BranchAddressDetails   branchaddressDetails )
	{
		bi.updatebranchAddressDetails( branchaddressDetails);
	}
	
    @DeleteMapping(value = "deletebranchaddressdetailsData/{id}")
    public void delete(@PathVariable("id")int id)
	{
    	bi.deletebranchAddressDetails(id);
}
	
}
