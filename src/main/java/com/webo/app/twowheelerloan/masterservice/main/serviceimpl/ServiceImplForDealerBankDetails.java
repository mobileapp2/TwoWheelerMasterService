package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.Dealer_Bank_Details;
import com.webo.app.twowheelerloan.masterservice.main.repository.RepoForDealerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.service.ServiceIForDealerBankDetails;


@Service
public class ServiceImplForDealerBankDetails implements ServiceIForDealerBankDetails {

	@Autowired
	RepoForDealerBankDetails repo;

	public void insertDealerBankDetails(Dealer_Bank_Details DealerBankDetails) {

		repo.save(DealerBankDetails);
	}

	public Optional<Dealer_Bank_Details> getDealerBankDetailsDatabyId(int id) {

		return repo.findById(id);
	}

	public List<Dealer_Bank_Details> readDealerBankDetails() {

		return repo.findAll();
	}

	public void updateDealerBankDetails(Dealer_Bank_Details DealerBankDetails) {

		repo.save(DealerBankDetails);

	}

	public void deleteDealerBankDetails(int id) {

		repo.deleteById(id);
	}

}
