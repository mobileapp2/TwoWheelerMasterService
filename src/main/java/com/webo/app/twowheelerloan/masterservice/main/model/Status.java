package com.webo.app.twowheelerloan.masterservice.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Status {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer status_Id;
	private String statusName;
	private int statusCode;
	private String statusRemark;
	public Integer getStatus_Id() {
		return status_Id;
	}
	public void setStatus_Id(Integer status_Id) {
		this.status_Id = status_Id;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusRemark() {
		return statusRemark;
	}
	public void setStatusRemark(String statusRemark) {
		this.statusRemark = statusRemark;
	}
	@Override
	public String toString() {
		return "Status [status_Id=" + status_Id + ", statusName=" + statusName + ", statusCode=" + statusCode
				+ ", statusRemark=" + statusRemark + "]";
	}
	
	

}
