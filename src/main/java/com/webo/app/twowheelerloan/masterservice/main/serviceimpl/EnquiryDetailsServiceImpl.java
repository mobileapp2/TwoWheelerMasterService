package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.EnquiryDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.EnquiryDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.EnquiryDetailsServiceI;

@Service
public class EnquiryDetailsServiceImpl implements EnquiryDetailsServiceI {

	@Autowired
	private EnquiryDetailsRepo enquiryDetailsRepository;
	
	
	public String saveEnquiryDetails(EnquiryDetails enquiryDetails) {
		enquiryDetailsRepository.save(enquiryDetails);
		return "EnquiryDetails saved";
	}

	public Optional<EnquiryDetails> getEnquiryDetails(Integer id) {
		Optional<EnquiryDetails> enquiryDetail = enquiryDetailsRepository.findById(id);
		return enquiryDetail;
	}

	
	public List<EnquiryDetails> getAllEnquiryDetails() {
		List<EnquiryDetails> enquiryDetails = enquiryDetailsRepository.findAll();
		return enquiryDetails;
	}

	
	public void deleteEnquiryDetails(int id) {
		enquiryDetailsRepository.deleteById(id);
	}

	
	public void updateEnquiryDetails(EnquiryDetails enquiryDetails) {
		enquiryDetailsRepository.saveAndFlush(enquiryDetails);
	}
	
	
	
}
