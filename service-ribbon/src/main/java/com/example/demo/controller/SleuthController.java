package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SleuthController {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/sleuth")
	public String sleuth() {
		
		return "ribbon==========="+restTemplate.getForObject("http://SERVICE-FEIGN/sleuthTest", String.class);
	}
	
	@RequestMapping("/sleuthTest")
	public String sleuthTest() {
		
		return "from ribbon";
	}
}
