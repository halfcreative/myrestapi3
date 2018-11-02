package com.sam.rest.myrestapi3.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.rest.myrestapi3.beans.Projects;
import com.sam.rest.myrestapi3.daos.ProjectsDAO;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectsDAO projectsDao;
	
	@Override
	@Transactional
	public Projects create(Projects project) {
		return projectsDao.save(project);
	}

	@Override
	@Transactional
	public Projects updateProject(Projects project) {
		return projectsDao.save(project);
	}

	@Override
	public List<Projects> getAllProjectsByUserId(int userId) {
		return projectsDao.findAllByUserId(userId);
	}

	@Override
	@Transactional
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
