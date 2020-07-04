package com.webo.app.twowheelerloan.masterservice.main.service;

import java.util.List;
import java.util.Optional;

import com.webo.app.twowheelerloan.masterservice.main.model.Role;

public interface RoleServiceI 
{

	public Role enterData(Role role);
	
	public List<Role> getRoleData();
	
	public Optional<Role> getRoleDataById(int id);
	
	public Role updateRole(Role role);
	
	public void deleteRole(int id);
}
