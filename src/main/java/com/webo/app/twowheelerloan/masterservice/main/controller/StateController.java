package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.State;
import com.webo.app.twowheelerloan.masterservice.main.serviceimpl.StateServiceImpl;

@RestController
public class StateController {
	@Autowired StateServiceImpl stateServiceImpl;

	@RequestMapping(value="/state",method=RequestMethod.POST)
	public void addState(@RequestBody State state){
		stateServiceImpl.addState(state);
	}

	@RequestMapping(value="/state",method=RequestMethod.GET)
	public List<State> getStateList(){
		return stateServiceImpl.getStateList();
	}

	@RequestMapping(value="/state/{id}",method=RequestMethod.GET)
	public State getStateById(@PathVariable Integer id){
		return stateServiceImpl.getStateById(id);
	}

	@RequestMapping(value="/state/{id}",method=RequestMethod.POST)
	public void deleteState(@PathVariable Integer id){
		stateServiceImpl.deleteState(id);
	}
	
	@RequestMapping(value="/state",method=RequestMethod.PUT)
	public void updateState(@RequestBody State state){
		stateServiceImpl.updateState(state);
	}
}
