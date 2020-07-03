package com.webo.app.twowheelerloan.masterservice.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webo.app.twowheelerloan.masterservice.main.model.Dealer_Bank_Details;

@Repository
public interface RepoForDealerBankDetails extends JpaRepository<Dealer_Bank_Details, Integer> {
	
	
	

}
