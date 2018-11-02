package com.sam.rest.myrestapi3.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sam.rest.myrestapi3.beans.History;

public interface HistoryDAO extends JpaRepository<History,Integer>{
	
	void deleteHistoryByCompanyName(String name);
	
	List<History> findAllByUserId(int userId);
	
}
