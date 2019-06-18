package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "SERVICE-RIBBON")
public interface FeignSleuthService {

	@RequestMapping(value="/sleuthTest",method=RequestMethod.GET)
	String sleuthTest();
}
