package com.example.demo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.web.HelloController;

@WebMvcTest(controllers = HelloController.class)
class Springboot2WebserviceApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void hello��_���ϵȴ�() throws Exception {
		String hello = "hello";
		
		mockMvc.perform(get("/hello"))
	    .andExpect(status().isOk())
		.andExpect(content().string(hello));


		
	}

}
