package com.pluriel.pms.configService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluriel.pms.configService.services.EstablishmentService;
import com.pluriel.pms.data.entities.Establishment;

@RestController
@RequestMapping("/api/v1/config")
public class AppController {

	@Autowired
	EstablishmentService establishmentService;
	
	@GetMapping
	public ResponseEntity<String> index(){
		return new ResponseEntity<String>("Hello Config Service", HttpStatus.OK);
	}
	
	
	@GetMapping("/establishments")
	public ResponseEntity<List<Establishment>> get(){
		return new ResponseEntity<List<Establishment>>(establishmentService.get(), HttpStatus.OK);
	}
}
