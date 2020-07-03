package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EmployeeDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer employeeId;
	private String employeeFullName;
	@OneToOne(cascade = CascadeType.ALL)
	// private EmployeeAddress employeeAddress;
	private long employeeMobileNo;
	private long employeeAlternateMobileNo;
	private String employeeEmail;
	private String employeeGender;
	@OneToOne(cascade = CascadeType.ALL)
	private Role employeeRole;
	private String employeeBranch;
	private String employeeDateOfBirth;
	@OneToOne(cascade = CascadeType.ALL)
	// private EmployeeDocument employeeDocument;
	
	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeFullName() {
		return employeeFullName;
	}

	public void setEmployeeFullName(String employeeFullName) {
		this.employeeFullName = employeeFullName;
	}

	/*
	 * public EmployeeAddress getEmployeeAddress() { return employeeAddress; }
	 * public void setEmployeeAddress(EmployeeAddress employeeAddress) {
	 * this.employeeAddress = employeeAddress; }
	 */
	public long getEmployeeMobileNo() {
		return employeeMobileNo;
	}

	public void setEmployeeMobileNo(long employeeMobileNo) {
		this.employeeMobileNo = employeeMobileNo;
	}

	public long getEmployeeAlternateMobileNo() {
		return employeeAlternateMobileNo;
	}

	public void setEmployeeAlternateMobileNo(long employeeAlternateMobileNo) {
		this.employeeAlternateMobileNo = employeeAlternateMobileNo;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeGender() {
		return employeeGender;
	}

	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}

	public Role getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(Role employeeRole) {
		this.employeeRole = employeeRole;
	}

	public String getEmployeeBranch() {
		return employeeBranch;
	}

	public void setEmployeeBranch(String employeeBranch) {
		this.employeeBranch = employeeBranch;
	}

	public String getEmployeeDateOfBirth() {
		return employeeDateOfBirth;
	}

	public void setEmployeeDateOfBirth(String employeeDateOfBirth) {
		this.employeeDateOfBirth = employeeDateOfBirth;
	}
	/*
	 * public EmployeeDocument getEmployeeDocument() { return employeeDocument; }
	 * public void setEmployeeDocument(EmployeeDocument employeeDocument) {
	 * this.employeeDocument = employeeDocument; }
	 */

}
