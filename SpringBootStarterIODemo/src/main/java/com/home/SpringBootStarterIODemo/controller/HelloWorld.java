package com.home.SpringBootStarterIODemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@RequestMapping("/")
	public String message() {
		return "Hello World!!!";
	}

}
