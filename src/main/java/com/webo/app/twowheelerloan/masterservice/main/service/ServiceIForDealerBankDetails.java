package com.webo.app.twowheelerloan.masterservice.main.service;


import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.Dealer_Bank_Details;

public interface ServiceIForDealerBankDetails {
	
	public void insertDealerBankDetails(Dealer_Bank_Details addr);
	public List<Dealer_Bank_Details> readDealerBankDetails();
	public void updateDealerBankDetails(Dealer_Bank_Details addr);
	public void deleteDealerBankDetails(int id);
	public Optional<Dealer_Bank_Details> getDealerBankDetailsDatabyId(int id);
	

}
