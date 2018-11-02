package com.sam.rest.myrestapi3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.sam.rest.myrestapi3.beans.Tech;
import com.sam.rest.myrestapi3.daos.TechDAO;

@Service
public class TechServiceImpl implements TechService {

	@Autowired
	private TechDAO techDao;
	
	@Override
	public List<Tech> getAllTechs() {
		return techDao.findAll();
	}

	@Override
	@Transactional
	public Tech createNewTech(Tech tech) {
		return techDao.save(tech);
	}

	@Override
	@Transactional
	public void deleteTechByName(String name) {
		techDao.deleteByName(name);
	}

}
