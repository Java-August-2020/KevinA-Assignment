package com.codingdojo.springbootassignment1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayMessage() {
		return "Hello client! How are you doing?";
	}

	@RequestMapping(value = "/random", method = RequestMethod.GET)
	public String randomRoute() {
		return "<em>Spring Boot is great! So easy to just respond with strings</em>";
	}

}
