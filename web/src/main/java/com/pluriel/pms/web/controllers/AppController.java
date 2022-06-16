package com.pluriel.pms.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pluriel.pms.configuration.services.EstablishmentService;
import com.pluriel.pms.data.entities.Establishment;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/api/v1/config")
public class AppController {
	@Autowired
	EstablishmentService establishmentService;

	@GetMapping
	public ResponseEntity<String> index() {
		return new ResponseEntity<String>("Hello Config Service", HttpStatus.OK);
	}

	@Operation(summary = "This is to dfetch All the etablishements stored in Db")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Fetched All the etablishements form Db", content = {
					@Content(mediaType = "application/json") }),
			@ApiResponse(responseCode = "404", description = "NOt Available", content = @Content) })
	@GetMapping("/establishments")
	public ResponseEntity<List<Establishment>> get() {
		return new ResponseEntity<List<Establishment>>(establishmentService.get(), HttpStatus.OK);
	}



}
