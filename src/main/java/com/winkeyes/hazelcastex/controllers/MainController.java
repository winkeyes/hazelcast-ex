package com.winkeyes.hazelcastex.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.winkeyes.hazelcastex.services.MainService;

@RestController
public class MainController {
	@Autowired
	public MainService service;
	
	@GetMapping({"/{name}"})
	public String getName(@PathVariable String name) throws InterruptedException {
		return service.getName(name);
	}

}
