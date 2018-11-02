package com.sam.rest.myrestapi3.services;

import java.util.List;

import com.sam.rest.myrestapi3.beans.History;

public interface HistoryService {
	
	/**
	 * Add a History to the DB
	 * @param History
	 * @return History
	 */
	History create(History history);
	
	/**
	 * Update a History
	 * @param History
	 * @return updated History
	 */
	History updateHistory(History history);
	
	/**
	 * gets a piece of history by Id
	 * @param histId
	 * @return
	 */
	History getHistoryById(int histId);
	
	/**
	 * Get all History from a user
	 * @param userId
	 * @return List of History from a user with userId
	 */
	List<History> getAllHistoryByUserId(int userId);
	
	/**
	 * Delete a History
	 * @param name - the company's name
	 */
	void deleteHistoryByCompanyName(String name);
}
