package com.zeeshan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(value="login" , method=RequestMethod.GET)
	public void login(){
		System.out.println("Inside login controller");
		
	}

}
