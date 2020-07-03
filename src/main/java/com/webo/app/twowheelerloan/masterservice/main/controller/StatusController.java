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
import com.webo.app.twowheelerloan.masterservice.main.service.StatusService;

@RestController
public class StatusController 
{
	@Autowired StatusService ss;
	
	@PostMapping(value="/addstatustdata") 
	public void adddata (@RequestBody Status status)
	{
      ss.insertStatusData(status);		
		
	}
	
	@GetMapping(value = "/getstatusdata")
	

	
	public List<Status> getData(){
		
		 List<Status> list =ss.readstatusData();
		  
		 return list;
		
	}

	@GetMapping(value = "/getstatusdatabyid/{id}")
	public Status getsinagaldata(@PathVariable int id) {
		
		return ss.getdatabyid(id);
		
	}
	
	@DeleteMapping(value = "/deletesttusdata/{id}")
	public void delete(@PathVariable int id)
	{
		ss.deletestatusdata(id);
	}
	
	@PutMapping(value = "/updatestatusdata")
	public void updatestatusdata(@RequestBody Status status)
	{
		
		ss.updatestatusdata(status);
	}
}
