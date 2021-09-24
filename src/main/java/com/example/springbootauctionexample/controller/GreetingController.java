package com.example.springbootauctionexample.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello World!";
	}

}
