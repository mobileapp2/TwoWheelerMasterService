package com.webo.app.twowheelerloan.masterservice.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webo.app.twowheelerloan.masterservice.main.model.Role;
import com.webo.app.twowheelerloan.masterservice.main.repository.RoleRepo;
import com.webo.app.twowheelerloan.masterservice.main.service.RoleServiceI;

@Service
public class RoleServiceImpl implements RoleServiceI
{

	@Autowired
	RoleRepo roleRepo;
	
	@Override
	public Role enterData(Role role)
	{
		return roleRepo.save(role);
	}

	@Override
	public List<Role> getRoleData() 
	{
		return roleRepo.findAll();
	}

	@Override
	public Optional<Role> getRoleDataById(int id) 
	{
		return roleRepo.findById(id);
	}

	@Override
	public Role updateRole(Role role) 
	{
		return roleRepo.save(role);
	}

	@Override
	public void deleteRole(int id)
	{
		roleRepo.deleteById(id);
		
	}
	
	
	

}
