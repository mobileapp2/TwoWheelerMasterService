package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class CustomerAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cust_addrID;
	private String local_houseNo;
	private String local_streetName;
	private String local_area;
	private String local_landMark;
	private String local_taluka;
	private String local_city;
	private String local_district;
	private String local_state;
	private String local_country;
	private int local_pincode;
	
	private String permanent_houseNo;
	private String permanent_streetName;
	private String permanent_area;
	private String permanent_landMark;
	private String permanent_taluka;
	private String permanent_city;
	private String permanent_district;
	private String permanent_state;
	private String permanent_country;
	private int permanent_pincode;
	
	private String verification_status;

	public Integer getCust_addrID() {
		return cust_addrID;
	}

	public void setCust_addrID(Integer cust_addrID) {
		this.cust_addrID = cust_addrID;
	}

	public String getLocal_houseNo() {
		return local_houseNo;
	}

	public void setLocal_houseNo(String local_houseNo) {
		this.local_houseNo = local_houseNo;
	}

	public String getLocal_streetName() {
		return local_streetName;
	}

	public void setLocal_streetName(String local_streetName) {
		this.local_streetName = local_streetName;
	}

	public String getLocal_area() {
		return local_area;
	}

	public void setLocal_area(String local_area) {
		this.local_area = local_area;
	}

	public String getLocal_landMark() {
		return local_landMark;
	}

	public void setLocal_landMark(String local_landMark) {
		this.local_landMark = local_landMark;
	}

	public String getLocal_taluka() {
		return local_taluka;
	}

	public void setLocal_taluka(String local_taluka) {
		this.local_taluka = local_taluka;
	}

	public String getLocal_city() {
		return local_city;
	}

	public void setLocal_city(String local_city) {
		this.local_city = local_city;
	}

	public String getLocal_district() {
		return local_district;
	}

	public void setLocal_district(String local_district) {
		this.local_district = local_district;
	}

	public String getLocal_state() {
		return local_state;
	}

	public void setLocal_state(String local_state) {
		this.local_state = local_state;
	}

	public String getLocal_country() {
		return local_country;
	}

	public void setLocal_country(String local_country) {
		this.local_country = local_country;
	}

	public int getLocal_pincode() {
		return local_pincode;
	}

	public void setLocal_pincode(int local_pincode) {
		this.local_pincode = local_pincode;
	}

	public String getPermanent_houseNo() {
		return permanent_houseNo;
	}

	public void setPermanent_houseNo(String permanent_houseNo) {
		this.permanent_houseNo = permanent_houseNo;
	}

	public String getPermanent_streetName() {
		return permanent_streetName;
	}

	public void setPermanent_streetName(String permanent_streetName) {
		this.permanent_streetName = permanent_streetName;
	}

	public String getPermanent_area() {
		return permanent_area;
	}

	public void setPermanent_area(String permanent_area) {
		this.permanent_area = permanent_area;
	}

	public String getPermanent_landMark() {
		return permanent_landMark;
	}

	public void setPermanent_landMark(String permanent_landMark) {
		this.permanent_landMark = permanent_landMark;
	}

	public String getPermanent_taluka() {
		return permanent_taluka;
	}

	public void setPermanent_taluka(String permanent_taluka) {
		this.permanent_taluka = permanent_taluka;
	}

	public String getPermanent_city() {
		return permanent_city;
	}

	public void setPermanent_city(String permanent_city) {
		this.permanent_city = permanent_city;
	}

	public String getPermanent_district() {
		return permanent_district;
	}

	public void setPermanent_district(String permanent_district) {
		this.permanent_district = permanent_district;
	}

	public String getPermanent_state() {
		return permanent_state;
	}

	public void setPermanent_state(String permanent_state) {
		this.permanent_state = permanent_state;
	}

	public String getPermanent_country() {
		return permanent_country;
	}

	public void setPermanent_country(String permanent_country) {
		this.permanent_country = permanent_country;
	}

	public int getPermanent_pincode() {
		return permanent_pincode;
	}

	public void setPermanent_pincode(int permanent_pincode) {
		this.permanent_pincode = permanent_pincode;
	}

	public String getVerification_status() {
		return verification_status;
	}

	public void setVerification_status(String verification_status) {
		this.verification_status = verification_status;
	}

	
	
	
	
	

}
