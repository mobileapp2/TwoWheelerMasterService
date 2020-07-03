package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;

import com.webo.app.twowheelerloan.masterservice.main.model.Country;
import com.webo.app.twowheelerloan.masterservice.main.model.State;

public interface StateService {

	public void addState(State state);

	public List<State> getStateList();

	public State getStateById(Integer id);

	public void deleteState(Integer id);
	
	public void updateState(State state);
}
