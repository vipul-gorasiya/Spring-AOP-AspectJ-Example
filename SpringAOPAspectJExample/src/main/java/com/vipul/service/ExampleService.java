package com.vipul.service;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

	public String getWelcomeMessage() {
		return "Hello!, This is an example of Spring AOP with AspectJ";
	}

}
