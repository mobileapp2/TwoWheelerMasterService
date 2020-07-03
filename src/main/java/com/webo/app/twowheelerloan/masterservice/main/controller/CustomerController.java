package com.webo.app.twowheelerloan.masterservice.main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	public class CustomerController {
		
		@RequestMapping("/getdata")
		public String showData()
		{
			return "welcome to the Project";
			
		}
		
	}	


