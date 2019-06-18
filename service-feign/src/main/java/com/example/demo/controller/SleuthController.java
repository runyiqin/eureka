package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FeignSleuthService;

@RestController
public class SleuthController {

	@Autowired
	FeignSleuthService feignSleuthService;
	
	@RequestMapping(value = "/sleuth",method=RequestMethod.GET)
	public String sleuth() {
		return "feign======="+feignSleuthService.sleuthTest();
	}
	
	@RequestMapping("/sleuthTest")
	public String sleuthTest() {
		
		return "from feign";
	}
}
