package com.bloom.smartbreaker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {
	
	@GetMapping("/get")
	public String createNote() {
	    return "1.0";
	}

}
