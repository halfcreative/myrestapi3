package com.sam.rest.myrestapi3.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.rest.myrestapi3.beans.Creds;
import com.sam.rest.myrestapi3.beans.Users;
import com.sam.rest.myrestapi3.daos.CredsDAO;
import com.sam.rest.myrestapi3.daos.UserDAO;

@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	CredsDAO credsDao;
	@Autowired
	UserDAO userDao;
	
	@Override
	public Users authenticate(Creds creds) {
		Creds validCreds = null;
		validCreds = credsDao.getCredsByUsername(creds.getUsername());
		if(validCreds!=null) {
			if(validCreds.getPassword().equals(creds.getPassword())) {
				return validCreds.getUser();
			}
		}
		return null;
	}



}
