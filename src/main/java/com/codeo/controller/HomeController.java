package com.codeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codeo.model.Email;

@Controller
public class HomeController {

	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	@PostMapping("/sendEmail")
	public String sendEmail(@ModelAttribute Email email) {
		System.out.println(email);
		return null;
		
	}
	
}
