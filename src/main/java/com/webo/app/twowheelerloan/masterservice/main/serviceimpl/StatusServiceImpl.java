package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Status;
import com.webo.app.twowheelerloan.masterservice.main.repository.StatusRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.StatusServiceI;

@Service
public class StatusServiceImpl implements StatusServiceI {
	
	@Autowired StatusRepo sr;

	@Override
	public void insertStatusData(Status status) {
		sr.save(status);
		
	}

	@Override
	public List<Status> readstatusData() 
	{
		return sr.findAll();
	}

	@Override
	public Status getdatabyid(int id) {
		Status s=sr.findById(id).get();
		return s;
	}

	@Override
	public List<Status> deletestatusdata(int id) {
		sr.deleteById(id);
		return sr.findAll();
	}

	@Override
	public void updatestatusdata(Status status) {
		sr.save(status);
		
	}

}
