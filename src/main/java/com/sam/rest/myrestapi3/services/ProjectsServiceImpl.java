package com.sam.rest.myrestapi3.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.rest.myrestapi3.beans.Projects;
import com.sam.rest.myrestapi3.daos.ProjectsDAO;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectsDAO projectsDao;
	
	@Override
	public Projects create(Projects project) {
		return projectsDao.save(project);
	}

	@Override
	public Projects updateProject(Projects project) {
		return projectsDao.save(project);
	}

	@Override
	public List<Projects> getAllProjectsByUserId(int userId) {
		return projectsDao.findAllByUserId(userId);
	}

	@Override
	public void deleteProjectByName(String name) {
		projectsDao.deleteByName(name);
	}

	@Override
	public Projects getProjectById(int id) {
		try{
			return projectsDao.getOne(id);
		} catch (EntityNotFoundException e) {
			return null;
		}
	}

}
