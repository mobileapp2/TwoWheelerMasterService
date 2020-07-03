package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerBankDetail {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String customerbankAccountNo;
	private String customerbankAccountHolderName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCustomerbankAccountNo() {
		return customerbankAccountNo;
	}
	public void setCustomerbankAccountNo(String customerbankAccountNo) {
		this.customerbankAccountNo = customerbankAccountNo;
	}
	public String getCustomerbankAccountHolderName() {
		return customerbankAccountHolderName;
	}
	public void setCustomerbankAccountHolderName(String customerbankAccountHolderName) {
		this.customerbankAccountHolderName = customerbankAccountHolderName;
	}
	
	//@OneToOne
	//private BranchDetails customerbankBranchDetails;
	
	
}
