package com.mcszweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class webpageController {

    	@GetMapping("/")
	public String goToIndex() {
		return "mainpage";
	}
	
}
