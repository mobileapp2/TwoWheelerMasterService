package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import com.webo.app.twowheelerloan.masterservice.main.model.Status;

public interface StatusServiceI {
	
	
	public void insertStatusData(Status status);
	
	public List<Status> readstatusData();
	
	public Status getdatabyid(int id);
	
	public List<Status> deletestatusdata(int id);
	
	public void updatestatusdata(Status status);
	
	
}
