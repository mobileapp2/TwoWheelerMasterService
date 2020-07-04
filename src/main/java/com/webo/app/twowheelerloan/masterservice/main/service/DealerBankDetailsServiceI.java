package com.webo.app.twowheelerloan.masterservice.main.service;


import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.DealerBankDetails;

public interface DealerBankDetailsServiceI {
	
	public void insertDealerBankDetails(DealerBankDetails addr);
	public List<DealerBankDetails> readDealerBankDetails();
	public void updateDealerBankDetails(DealerBankDetails addr);
	public void deleteDealerBankDetails(int id);
	public Optional<DealerBankDetails> getDealerBankDetailsDatabyId(int id);
	

}
