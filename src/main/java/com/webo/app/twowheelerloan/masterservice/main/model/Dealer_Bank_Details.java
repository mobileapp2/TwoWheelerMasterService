package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dealer_Bank_Details {

	@Id
	private Integer dealerBankDetailId;
	private String dealerbankAccountNo;
	private String dealerBankAccountHolderName;
	private String dealerBankBranchDetails;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Status status;

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

	public String getDealerBankBranchDetails() {
		return dealerBankBranchDetails;
	}

	public void setDealerBankBranchDetails(String dealerBankBranchDetails) {
		this.dealerBankBranchDetails = dealerBankBranchDetails;
	}

//	public Status getStatus() {
//		return status;
//	}
//
//	public void setStatus(Status status) {
//		this.status = status;
//	}

}
