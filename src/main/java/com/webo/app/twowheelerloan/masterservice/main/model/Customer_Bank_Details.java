package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer_Bank_Details {

	@Id
	private Integer customerBankDetailId;
	private String customerBankAccountNo;
	private String customerBankAccountHolderName;
	private String customerBankBranchDetails;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Status status;
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
	public String getCustomerBankBranchDetails() {
		return customerBankBranchDetails;
	}
	public void setCustomerBankBranchDetails(String customerBankBranchDetails) {
		this.customerBankBranchDetails = customerBankBranchDetails;
	}
//	public Status getStatus() {
//		return status;
//	}
//	public void setStatus(Status status) {
//		this.status = status;
//	}
//	
	
}
