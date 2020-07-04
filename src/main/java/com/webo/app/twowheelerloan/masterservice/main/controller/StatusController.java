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

import com.webo.app.twowheelerloan.masterservice.main.model.Status;
import com.webo.app.twowheelerloan.masterservice.main.service.StatusServiceI;

@RestController
public class StatusController {
	@Autowired
	StatusServiceI statusServiceI;

	@PostMapping(value = "/status")
	public void adddata(@RequestBody Status status) {
		statusServiceI.insertStatusData(status);

	}

	@GetMapping(value = "/status")
	public List<Status> getData() {
		List<Status> list = statusServiceI.readstatusData();
		return list;
	}

	@GetMapping(value = "/status/{id}")
	public Status getdatabyId(@PathVariable int id) {
		return statusServiceI.getdatabyid(id);
	}

	@DeleteMapping(value = "/status/{id}")
	public void delete(@PathVariable int id) {
		statusServiceI.deletestatusdata(id);
	}

	@PutMapping(value = "/status")
	public void updatestatusdata(@RequestBody Status status) {
		statusServiceI.updatestatusdata(status);
	}
}
