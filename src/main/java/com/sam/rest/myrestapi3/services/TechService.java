package com.sam.rest.myrestapi3.services;

import java.util.List;

import com.sam.rest.myrestapi3.beans.Tech;

public interface TechService {

	/**
	 * Get all techs
	 * @return
	 */
	List<Tech> getAllTechs();
	
	
	/**
	 * Create a new tech
	 * @param tech
	 * @return
	 */
	Tech createNewTech(Tech tech);
	
	/**
	 * delete a tech
	 * @param name
	 */
	void deleteTechByName(String name);
	
}
