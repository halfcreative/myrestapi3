package com.sam.rest.myrestapi3.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sam.rest.myrestapi3.beans.History;
import com.sam.rest.myrestapi3.services.HistoryService;

@RestController
@CrossOrigin
@RequestMapping("/history")
public class HistoryController {

	@Autowired
	private HistoryService hs;
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<History>> getUserHistory(@PathVariable int userId){
		return new ResponseEntity<>(hs.getAllHistoryByUserId(userId),HttpStatus.OK);
	}
	
	@PostMapping(value="/new",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<History> create(@Valid @RequestBody History history){
		return new ResponseEntity<>(hs.create(history),HttpStatus.OK);
	}
	
	@PutMapping(value="/update",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<History> update(@Valid @RequestBody History history){
		return new ResponseEntity<>(hs.updateHistory(history),HttpStatus.OK);
	}
	
}
