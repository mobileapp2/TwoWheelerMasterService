package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.webo.app.twowheelerloan.masterservice.main.model.EnquiryDetails;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.EnquiryDetailsServiceImpl;

@RestController
public class EnquiryDetailsController {

	@Autowired
	private EnquiryDetailsServiceImpl enquiryDetailsServiceImpl;

	@RequestMapping(value = "/enquiryDetails", method = RequestMethod.POST)
	public String saveEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails) {
		enquiryDetailsServiceImpl.saveEnquiryDetails(enquiryDetails);
		return "EnquiryDetails saved";
	}

	@RequestMapping(value = "/enquiryDetails/{id}", method = RequestMethod.GET)
	public Optional<EnquiryDetails> getEnquiryDetails(@PathVariable Integer id) {
		Optional<EnquiryDetails> enquiryDetail = enquiryDetailsServiceImpl.getEnquiryDetails(id);
		return enquiryDetail;
	}

	@RequestMapping(value = "/enquiryDetails", method = RequestMethod.GET)
	public List<EnquiryDetails> getAllEnquiryDetails() {
		List<EnquiryDetails> enquiryDetails = enquiryDetailsServiceImpl.getAllEnquiryDetails();
		return enquiryDetails;
	}

	@RequestMapping(value = "/enquiryDetails/{id}", method = RequestMethod.DELETE)
	public void deleteEnquiryDetails(@PathVariable int id) {
		enquiryDetailsServiceImpl.deleteEnquiryDetails(id);;
	}

	@RequestMapping(value = "/enquiryDetails", method = RequestMethod.PUT)
	public void updateEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails) {
		enquiryDetailsServiceImpl.updateEnquiryDetails(enquiryDetails);;
	}

}
