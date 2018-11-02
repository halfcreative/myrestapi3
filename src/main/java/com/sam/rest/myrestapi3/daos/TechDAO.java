package com.sam.rest.myrestapi3.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sam.rest.myrestapi3.beans.Tech;

public interface TechDAO extends JpaRepository<Tech,Integer>{
	
	void deleteByName(String name);
}
