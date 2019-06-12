package com.example.demo.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class HelloControllerTest extends BaseControllerJUnit{

	@Test
	public void hello() throws Exception{

		MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/hello").param("name", "test")).andReturn();
		System.out.println(mvcResult.getResponse().getContentAsString());
	}
}
