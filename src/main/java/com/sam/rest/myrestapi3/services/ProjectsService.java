package com.sam.rest.myrestapi3.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sam.rest.myrestapi3.beans.Projects;

@Service
public interface ProjectsService {

	/**
	 * Add a project to the DB
	 * @param project
	 * @return Project
	 */
	Projects create(Projects project);
	
	/**
	 * Update a project
	 * @param project
	 * @return updated Project
	 */
	Projects updateProject(Projects project);
	
	/**
	 * Get all projects from a user
	 * @param userId
	 * @return List of projects from a user with userId
	 */
	List<Projects> getAllProjectsByUserId(int userId);
	
	/**
	 * Delete a project
	 * @param name
	 */
	void deleteProjectByName(String name);
	
	Projects getProjectById(int id);
	
}
