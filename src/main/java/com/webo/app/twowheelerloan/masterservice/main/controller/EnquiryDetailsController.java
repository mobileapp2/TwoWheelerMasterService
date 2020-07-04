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
	private EnquiryDetailsServiceImpl s;

	@RequestMapping(value = "/EnquiryDetails", method = RequestMethod.POST)
	public String saveEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails) {
		s.saveEnquiryDetails(enquiryDetails);
		return "EnquiryDetails saved";
	}

	@RequestMapping(value = "/EnquiryDetails/{id}", method = RequestMethod.GET)
	public Optional<EnquiryDetails> getEnquiryDetails(@PathVariable Integer id) {
		Optional<EnquiryDetails> enquiryDetail = s.getEnquiryDetails(id);
		return enquiryDetail;
	}

	@RequestMapping(value = "/EnquiryDetails", method = RequestMethod.GET)
	public List<EnquiryDetails> getAllEnquiryDetails() {
		List<EnquiryDetails> enquiryDetails = s.getAllEnquiryDetails();
		return enquiryDetails;
	}

	@RequestMapping(value = "/EnquiryDetails/{id}", method = RequestMethod.DELETE)
	public void deleteEnquiryDetails(@PathVariable int id) {
		s.deleteEnquiryDetails(id);;
	}

	@RequestMapping(value = "/EnquiryDetails", method = RequestMethod.PUT)
	public void updateEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails) {
		s.updateEnquiryDetails(enquiryDetails);;
	}

}
