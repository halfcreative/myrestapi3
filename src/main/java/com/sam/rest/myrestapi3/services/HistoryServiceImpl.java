package com.sam.rest.myrestapi3.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sam.rest.myrestapi3.beans.History;
import com.sam.rest.myrestapi3.daos.HistoryDAO;

@Service
public class HistoryServiceImpl implements HistoryService {

	@Autowired
	private HistoryDAO historyDao;
	
	@Override
	@Transactional
	public History create(History history) {
		return historyDao.save(history);
	}

	@Override
	@Transactional
	public History updateHistory(History history) {
		return historyDao.save(history);
	}

	@Override
	public History getHistoryById(int histId) {
		return historyDao.findById(histId).orElse(null);
	}

	@Override
	public List<History> getAllHistoryByUserId(int userId) {
		return historyDao.findAllByUserId(userId);
	}

	@Override
	public void deleteHistoryByCompanyName(String name) {
		historyDao.deleteHistoryByCompanyName(name);
	}

}
