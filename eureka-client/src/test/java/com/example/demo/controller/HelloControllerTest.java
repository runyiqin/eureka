package com.example.demo.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers; org.springframework.test.web.servlet.result.MockMvcResultHandlers;

public class HelloControllerTest extends BaseControllerJUnit{

	@Test
	public void hello() {
		mockMvc.perform(MockMvcRequestBuilders.get("/hello").param("name", "test")).andReturn();
	}
}
