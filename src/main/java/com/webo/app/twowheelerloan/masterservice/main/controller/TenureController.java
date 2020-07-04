package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.Tenure;
import com.webo.app.twowheelerloan.masterservice.main.service.TenureServiceI;

@RestController
public class TenureController {

	@Autowired
	TenureServiceI tenureServiceI;

	@PostMapping(value = "/tenure")
	public void adddata(@RequestBody Tenure tenure) {
		tenureServiceI.insertTenureData(tenure);
	}

	@GetMapping(value = "/tenure")
	public List<Tenure> getData() {
		List<Tenure> list = tenureServiceI.readtenuredata();
		return list;
	}

	@GetMapping(value = "/tenure/{id}")
	public Tenure getsinagaldata(@PathVariable int id) {

		return tenureServiceI.getdatabyid(id);
	}

	@DeleteMapping(value = "/tenure/{id}")
	public void delete(@PathVariable int id) {
		tenureServiceI.deletetenuredata(id);
	}

	@PutMapping(value = "/tenure")
	public void updatetenuredata(@RequestBody Tenure tenure) {
		tenureServiceI.updatetenuredata(tenure);
	}

}
