package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BranchDetails {
	
	@Id
	private Integer branchId;
	private String branchName;
	private String branchType;
	private String branchIFSC_Code;
	private String branchMICR_Code;
	private String branchContactNo;
	private String branchEmailId;
	private String branchAddress;
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getBranchType() {
		return branchType;
	}
	public void setBranchType(String branchType) {
		this.branchType = branchType;
	}
	public String getBranchIFSC_Code() {
		return branchIFSC_Code;
	}
	public void setBranchIFSC_Code(String branchIFSC_Code) {
		this.branchIFSC_Code = branchIFSC_Code;
	}
	public String getBranchMICR_Code() {
		return branchMICR_Code;
	}
	public void setBranchMICR_Code(String branchMICR_Code) {
		this.branchMICR_Code = branchMICR_Code;
	}
	public String getBranchContactNo() {
		return branchContactNo;
	}
	public void setBranchContactNo(String branchContactNo) {
		this.branchContactNo = branchContactNo;
	}
	public String getBranchEmailId() {
		return branchEmailId;
	}
	public void setBranchEmailId(String branchEmailId) {
		this.branchEmailId = branchEmailId;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
	
}
