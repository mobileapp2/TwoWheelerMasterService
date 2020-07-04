package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmployeeAddressDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empAddId;
	private String empHouseNo;
	private String empStreetName;
	private String empArea;
	private String empLandmark;
	private String empCity;
	private String empTaluka;
	private String empDistrict;
	private String empState;
	private int empPincode;
	private String emplocalCountry;
	private String empPermanentHouseNo;
	private String empPermanentStreetName;
	private String empPermanentArea;
	private String empPermanentLandmark;
	private String empPermanentCity;
	private String empPermanentTaluka;
	private String empPermanentDistrict;
	private String empPermanentState;
	private String empPermanentCountry;

	private int empPermanentPincode;
	private String verfication_status;
	
	public Integer getEmpAddId() {
		return empAddId;
	}
	public void setEmpAddId(Integer empAddId) {
		this.empAddId = empAddId;
	}
	public String getEmpHouseNo() {
		return empHouseNo;
	}
	public void setEmpHouseNo(String empHouseNo) {
		this.empHouseNo = empHouseNo;
	}
	public String getEmpStreetName() {
		return empStreetName;
	}
	public void setEmpStreetName(String empStreetName) {
		this.empStreetName = empStreetName;
	}
	public String getEmpArea() {
		return empArea;
	}
	public void setEmpArea(String empArea) {
		this.empArea = empArea;
	}
	public String getEmpLandmark() {
		return empLandmark;
	}
	public void setEmpLandmark(String empLandmark) {
		this.empLandmark = empLandmark;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public String getEmpTaluka() {
		return empTaluka;
	}
	public void setEmpTaluka(String empTaluka) {
		this.empTaluka = empTaluka;
	}
	public String getEmpDistrict() {
		return empDistrict;
	}
	public void setEmpDistrict(String empDistrict) {
		this.empDistrict = empDistrict;
	}
	public String getEmpState() {
		return empState;
	}
	public void setEmpState(String empState) {
		this.empState = empState;
	}
	public int getEmpPincode() {
		return empPincode;
	}
	public void setEmpPincode(int empPincode) {
		this.empPincode = empPincode;
	}
	public String getEmplocalCountry() {
		return emplocalCountry;
	}
	public void setEmplocalCountry(String emplocalCountry) {
		this.emplocalCountry = emplocalCountry;
	}
	public String getEmpPermanentHouseNo() {
		return empPermanentHouseNo;
	}
	public void setEmpPermanentHouseNo(String empPermanentHouseNo) {
		this.empPermanentHouseNo = empPermanentHouseNo;
	}
	public String getEmpPermanentStreetName() {
		return empPermanentStreetName;
	}
	public void setEmpPermanentStreetName(String empPermanentStreetName) {
		this.empPermanentStreetName = empPermanentStreetName;
	}
	public String getEmpPermanentArea() {
		return empPermanentArea;
	}
	public void setEmpPermanentArea(String empPermanentArea) {
		this.empPermanentArea = empPermanentArea;
	}
	public String getEmpPermanentLandmark() {
		return empPermanentLandmark;
	}
	public void setEmpPermanentLandmark(String empPermanentLandmark) {
		this.empPermanentLandmark = empPermanentLandmark;
	}
	public String getEmpPermanentCity() {
		return empPermanentCity;
	}
	public void setEmpPermanentCity(String empPermanentCity) {
		this.empPermanentCity = empPermanentCity;
	}
	public String getEmpPermanentTaluka() {
		return empPermanentTaluka;
	}
	public void setEmpPermanentTaluka(String empPermanentTaluka) {
		this.empPermanentTaluka = empPermanentTaluka;
	}
	public String getEmpPermanentDistrict() {
		return empPermanentDistrict;
	}
	public void setEmpPermanentDistrict(String empPermanentDistrict) {
		this.empPermanentDistrict = empPermanentDistrict;
	}
	public String getEmpPermanentState() {
		return empPermanentState;
	}
	public void setEmpPermanentState(String empPermanentState) {
		this.empPermanentState = empPermanentState;
	}
	public String getEmpPermanentCountry() {
		return empPermanentCountry;
	}
	public void setEmpPermanentCountry(String empPermanentCountry) {
		this.empPermanentCountry = empPermanentCountry;
	}
	public int getEmpPermanentPincode() {
		return empPermanentPincode;
	}
	public void setEmpPermanentPincode(int empPermanentPincode) {
		this.empPermanentPincode = empPermanentPincode;
	}
	public String getVerfication_status() {
		return verfication_status;
	}
	public void setVerfication_status(String verfication_status) {
		this.verfication_status = verfication_status;
	}

	
	
	
	
	


}
