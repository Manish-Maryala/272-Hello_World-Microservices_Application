package com.helloservice.helloservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@GetMapping ("/hello")
	public String Hellomsg() {
		return "Hello";
	}

}
