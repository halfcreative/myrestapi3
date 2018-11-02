package com.sam.rest.myrestapi3.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sam.rest.myrestapi3.beans.Projects;
import com.sam.rest.myrestapi3.services.ProjectsService;

@RestController
@CrossOrigin
@RequestMapping("/projects")
public class ProjectsController {
	
	@Autowired
	private ProjectsService ps;
	
	@GetMapping("/{userId}")
	public ResponseEntity<List<Projects>> getUserProjects(@PathVariable int userId){
		return new ResponseEntity<>(this.ps.getAllProjectsByUserId(userId),HttpStatus.OK);
	}
	
	@PostMapping(value="/new", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Projects> create(@Valid @RequestBody Projects project){
		return new ResponseEntity<>(this.ps.create(project),HttpStatus.OK);
	}
	
	@PutMapping(value="/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Projects> update(@Valid @RequestBody Projects project){
		return new ResponseEntity<>(this.ps.updateProject(project),HttpStatus.OK);
	}
}
