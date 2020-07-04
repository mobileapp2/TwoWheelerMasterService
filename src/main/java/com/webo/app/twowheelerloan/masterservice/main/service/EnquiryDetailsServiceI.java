package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.webo.app.twowheelerloan.masterservice.main.model.EnquiryDetails;

public interface EnquiryDetailsServiceI {
	
	public String saveEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails);
	public Optional<EnquiryDetails> getEnquiryDetails(@PathVariable Integer id);
	public List<EnquiryDetails> getAllEnquiryDetails();
	public void deleteEnquiryDetails(@PathVariable int id);
	public void updateEnquiryDetails(@RequestBody EnquiryDetails enquiryDetails);

}
