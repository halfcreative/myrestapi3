package com.sam.rest.myrestapi3.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.rest.myrestapi3.beans.Creds;

public interface CredsDAO extends JpaRepository<Creds,Integer>{

	Creds getCredsByUsername(String username);
}
