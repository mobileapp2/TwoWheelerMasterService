package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.webo.app.twowheelerloan.masterservice.main.model.DealerBankDetails;
import com.webo.app.twowheelerloan.masterservice.main.repository.DealerBankDetailsRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.DealerBankDetailsServiceI;


@Service
public class DealerBankDetailsServiceImpl implements DealerBankDetailsServiceI {

	@Autowired
	DealerBankDetailsRepo repo;

	public void insertDealerBankDetails(DealerBankDetails DealerBankDetails) {

		repo.save(DealerBankDetails);
	}

	public Optional<DealerBankDetails> getDealerBankDetailsDatabyId(int id) {

		return repo.findById(id);
	}

	public List<DealerBankDetails> readDealerBankDetails() {

		return repo.findAll();
	}

	public void updateDealerBankDetails(DealerBankDetails DealerBankDetails) {

		repo.save(DealerBankDetails);

	}

	public void deleteDealerBankDetails(int id) {

		repo.deleteById(id);
	}

}
