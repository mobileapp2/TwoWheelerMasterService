package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CustomerBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer customerBankDetailId;
	private String customerBankAccountNo;
	private String customerBankAccountHolderName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BranchDetails customerBankBranchDetails;
	
	private int status;
	
	public Integer getCustomerBankDetailId() {
		return customerBankDetailId;
	}
	public void setCustomerBankDetailId(Integer customerBankDetailId) {
		this.customerBankDetailId = customerBankDetailId;
	}
	public String getCustomerBankAccountNo() {
		return customerBankAccountNo;
	}
	public void setCustomerBankAccountNo(String customerBankAccountNo) {
		this.customerBankAccountNo = customerBankAccountNo;
	}
	public String getCustomerBankAccountHolderName() {
		return customerBankAccountHolderName;
	}
	public void setCustomerBankAccountHolderName(String customerBankAccountHolderName) {
		this.customerBankAccountHolderName = customerBankAccountHolderName;
	}
	public BranchDetails getCustomerBankBranchDetails() {
		return customerBankBranchDetails;
	}
	public void setCustomerBankBranchDetails(BranchDetails customerBankBranchDetails) {
		this.customerBankBranchDetails = customerBankBranchDetails;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	
	
}
