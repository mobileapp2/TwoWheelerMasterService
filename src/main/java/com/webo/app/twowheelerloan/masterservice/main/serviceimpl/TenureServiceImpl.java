package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Tenure;
import com.webo.app.twowheelerloan.masterservice.main.repository.TenureRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.TenureServiceI;

@Service
public class TenureServiceImpl implements TenureServiceI{
	
	@Autowired TenureRepo tr;

	@Override
	public void insertTenureData(Tenure tenure) {
		
		tr.save(tenure);
		
	}

	@Override
	public List<Tenure> readtenuredata() {
		return tr.findAll();
	}

	@Override
	public Tenure getdatabyid(int id) {
		Tenure t=tr.findById(id).get();
		return t;
	}

	@Override
	public List<Tenure> deletetenuredata(int id) {
		tr.deleteById(id);
		return tr.findAll();
	}

	@Override
	public void updatetenuredata(Tenure tenure) {
		tr.save(tenure);
		
	}

}
