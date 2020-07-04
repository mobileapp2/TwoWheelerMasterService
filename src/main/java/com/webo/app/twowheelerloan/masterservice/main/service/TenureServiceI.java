package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import com.webo.app.twowheelerloan.masterservice.main.model.Tenure;

public interface TenureServiceI {
	
	public void insertTenureData(Tenure tenure);
	
	public List<Tenure> readtenuredata();

	public Tenure getdatabyid(int id);
	
	public List<Tenure> deletetenuredata(int id);
	
	public void updatetenuredata(Tenure tenure);

}
