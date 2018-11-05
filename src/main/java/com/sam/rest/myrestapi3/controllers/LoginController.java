package com.sam.rest.myrestapi3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sam.rest.myrestapi3.beans.Creds;
import com.sam.rest.myrestapi3.beans.Users;
import com.sam.rest.myrestapi3.services.AuthService;

@RestController
@CrossOrigin
public class LoginController {

	@Autowired
	private AuthService auth;
	
	@PostMapping(value = "/login" ,consumes = "application/json")
	public ResponseEntity<Users> loginFormRequest(@RequestBody Creds creds){
		ResponseEntity<Users> resp = null;
		Users u = auth.authenticate(creds);
		if(u!=null) {
			resp = new ResponseEntity<>(u,HttpStatus.OK);
		} else {
			resp = new ResponseEntity<>(u,HttpStatus.BAD_REQUEST);
		}
		return resp;
	}

	@PostMapping(value="/newCreds",consumes="application/json")
	public ResponseEntity<Creds> createNewCreds(@RequestBody Creds creds){
		ResponseEntity<Creds> resp = null;
		Creds u = auth.createCreds(creds);
		resp = new ResponseEntity<>(u,HttpStatus.OK);
		return resp;
	}
	
}
