package com.sam.rest.myrestapi3.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.rest.myrestapi3.beans.Projects;

public interface ProjectsDAO extends JpaRepository<Projects,Integer>{

	List<Projects> findAllByUserId(int userId);
	
	void deleteByName(String name);
}
