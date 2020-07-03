package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Branch_Address_Details")
public class BranchAddressDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer branchAddressId;
	private String branchBuildingNo;
	private String branchStreetName;
	private String branchArea;
	private String branchLandMark;
	private String branchCity;
	private String branchTaluka;
	private String branchDistrict;
	private String branchState;
	private String branchCountry;
	private int branchPinCode;
	
	
	public Integer getBranchAddressId() {
		return branchAddressId;
	}
	public void setBranchAddressId(Integer branchAddressId) {
		this.branchAddressId = branchAddressId;
	}
	public String getBranchBuildingNo() {
		return branchBuildingNo;
	}
	public void setBranchBuildingNo(String branchBuildingNo) {
		this.branchBuildingNo = branchBuildingNo;
	}
	public String getBranchStreetName() {
		return branchStreetName;
	}
	public void setBranchStreetName(String branchStreetName) {
		this.branchStreetName = branchStreetName;
	}
	public String getBranchArea() {
		return branchArea;
	}
	public void setBranchArea(String branchArea) {
		this.branchArea = branchArea;
	}
	public String getBranchLandMark() {
		return branchLandMark;
	}
	public void setBranchLandMark(String branchLandMark) {
		this.branchLandMark = branchLandMark;
	}
	public String getBranchCity() {
		return branchCity;
	}
	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}
	public String getBranchTaluka() {
		return branchTaluka;
	}
	public void setBranchTaluka(String branchTaluka) {
		this.branchTaluka = branchTaluka;
	}
	public String getBranchDistrict() {
		return branchDistrict;
	}
	public void setBranchDistrict(String branchDistrict) {
		this.branchDistrict = branchDistrict;
	}
	public String getBranchState() {
		return branchState;
	}
	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}
	public String getBranchCountry() {
		return branchCountry;
	}
	public void setBranchCountry(String branchCountry) {
		this.branchCountry = branchCountry;
	}
	public int getBranchPinCode() {
		return branchPinCode;
	}
	public void setBranchPinCode(int branchPinCode) {
		this.branchPinCode = branchPinCode;
	}
	
	
	
	
	
	
	

}
