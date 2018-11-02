package com.sam.rest.myrestapi3.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SNAFUController {
	@GetMapping("/")
	public ResponseEntity<String> ifAllElseFails() {
		return new ResponseEntity<>("hi",HttpStatus.OK);
	}
}
