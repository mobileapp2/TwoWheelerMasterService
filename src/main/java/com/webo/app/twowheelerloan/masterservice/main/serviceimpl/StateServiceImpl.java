package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Country;
import com.webo.app.twowheelerloan.masterservice.main.model.State;
import com.webo.app.twowheelerloan.masterservice.main.repository.StateRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.StateService;

@Service
public class StateServiceImpl implements StateService{
@Autowired StateRepo stateRepo;

@Override
public void addState(State state) {
	stateRepo.save(state);
}

@Override
public List<State> getStateList() {
	return stateRepo.findAll();
}

@Override
public State getStateById(Integer id) {
	return stateRepo.findById(id).get();
}

@Override
public void deleteState(Integer id) {
	stateRepo.deleteById(id);
}

@Override
public void updateState(State state) {
	stateRepo.save(state);
}
	
	
}
