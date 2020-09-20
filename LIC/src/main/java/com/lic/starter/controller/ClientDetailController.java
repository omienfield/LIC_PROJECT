package com.lic.starter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.starter.service.ClientDetailsService;

@RestController
public class ClientDetailController {

	@Autowired
	ClientDetailsService clientDetailsService;

	@PostMapping(path = "/dataInsert")
	public void dataInsert() {
		clientDetailsService.insert();
	}
}
