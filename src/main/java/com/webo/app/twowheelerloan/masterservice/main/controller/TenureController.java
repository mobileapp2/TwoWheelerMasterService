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
	
	@Autowired TenureServiceI ts;
	
	@PostMapping(value = "/addtenuredata")
	public void adddata (@RequestBody Tenure tenure)
	{
		ts.insertTenureData(tenure);
		
	}
	
   @GetMapping(value = "/gettenuredata")
	
	public List<Tenure> getData(){
		
		 List<Tenure> list = ts.readtenuredata();
		  
		 return list;
		
	}
   
   @GetMapping(value = "/gettenuredatabyid/{id}")
	public Tenure getsinagaldata(@PathVariable int id) {
		
		return ts.getdatabyid(id);
		
	}
   
   @DeleteMapping(value = "/deletetenuredata/{id}")
	public void delete(@PathVariable int id)
	{
		ts.deletetenuredata(id);
	}

   @PutMapping(value = "/updatetenuredata")
   public void updatetenuredata(@RequestBody Tenure tenure)
   {
	ts.updatetenuredata(tenure);
	   
   }

}
