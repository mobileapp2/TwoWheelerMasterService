package com.webo.app.twowheelerloan.masterservice.main.controller;

import java.util.List;
import java.util.Optional;

//import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.webo.app.twowheelerloan.masterservice.main.model.Role;
import com.webo.app.twowheelerloan.masterservice.main.service.RoleServiceI;

@RestController
public class RoleController 
{

	@Autowired
	private RoleServiceI roleServiceInter;
	
	@RequestMapping(value = "/role", method = RequestMethod.POST)
	public void addData(@RequestBody Role role)
	{
	 roleServiceInter.enterData(role);
	}
	
	@RequestMapping(value = "/roles", method = RequestMethod.GET)
	public List<Role> getData()
	{
		return roleServiceInter.getRoleData();
	}
	
	@RequestMapping(value = "/role/{id}", method = RequestMethod.GET)
	public Optional<Role> getDataById(@PathVariable int id)
	{
		return roleServiceInter.getRoleDataById(id);
		
	}
	
	@RequestMapping(value = "/role", method = RequestMethod.PUT)
	public void updateData(@RequestBody Role role )
	{
		roleServiceInter.updateRole(role);
	}
	
	@RequestMapping(value = "/role/{id}",method = RequestMethod.DELETE)
	public void deleteData(@PathVariable int id)
	{
		roleServiceInter.deleteRole(id);
		
	}
	
	
	
}
