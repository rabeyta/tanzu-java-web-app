package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("hit /");
		return "Greetings from Spring Boot + Tanzu!";
	}

}