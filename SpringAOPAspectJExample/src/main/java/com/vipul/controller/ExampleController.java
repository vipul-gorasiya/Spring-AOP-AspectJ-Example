package com.vipul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vipul.service.ExampleService;

@RestController
public class ExampleController {

	@Autowired
	private ExampleService exampleService;

	@RequestMapping("/")
	public String exampleRoot() {
		return exampleService.getWelcomeMessage();
	}

}
