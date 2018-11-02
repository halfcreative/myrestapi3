package com.sam.rest.myrestapi3.services;

import com.sam.rest.myrestapi3.beans.Creds;
import com.sam.rest.myrestapi3.beans.Users;

public interface AuthService {
	/**
	 * Authenticate a username and password
	 * @param username
	 * @param password
	 * @return
	 */
	Users authenticate(Creds creds);

}
