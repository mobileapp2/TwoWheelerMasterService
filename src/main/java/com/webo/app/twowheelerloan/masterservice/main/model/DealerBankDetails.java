package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DealerBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dealerBankDetailId;
	private String dealerbankAccountNo;
	private String dealerBankAccountHolderName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BranchDetails dealerBankBranchDetails;
		
	private int status;

	public Integer getDealerBankDetailId() {
		return dealerBankDetailId;
	}

	public void setDealerBankDetailId(Integer dealerBankDetailId) {
		this.dealerBankDetailId = dealerBankDetailId;
	}

	public String getDealerbankAccountNo() {
		return dealerbankAccountNo;
	}

	public void setDealerbankAccountNo(String dealerbankAccountNo) {
		this.dealerbankAccountNo = dealerbankAccountNo;
	}

	public String getDealerBankAccountHolderName() {
		return dealerBankAccountHolderName;
	}

	public void setDealerBankAccountHolderName(String dealerBankAccountHolderName) {
		this.dealerBankAccountHolderName = dealerBankAccountHolderName;
	}

	public BranchDetails getDealerBankBranchDetails() {
		return dealerBankBranchDetails;
	}

	public void setDealerBankBranchDetails(BranchDetails dealerBankBranchDetails) {
		this.dealerBankBranchDetails = dealerBankBranchDetails;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}


	
}
