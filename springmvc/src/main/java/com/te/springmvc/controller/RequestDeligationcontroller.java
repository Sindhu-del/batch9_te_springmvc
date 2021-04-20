package com.te.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationcontroller {
	
	@GetMapping("/redirect")
	public String redirectRequest() {
		return "redirect:https://google.com";
		
	}
	@GetMapping("/forword")
	public String forwordRequest() {
		return "emp";
	}

}
