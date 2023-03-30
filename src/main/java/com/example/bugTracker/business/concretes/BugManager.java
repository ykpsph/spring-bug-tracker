package com.example.bugTracker.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bugTracker.business.abstracts.BugService;
import com.example.bugTracker.dataAccess.abstracts.BugRepository;
import com.example.bugTracker.entities.concretes.Bug;

@Service
public class BugManager implements BugService {
	
	private BugRepository bugRepository;
	
	@Autowired
	public BugManager(BugRepository bugRepository) {
		this.bugRepository = bugRepository;
	}
	
	@Override
	public List<Bug> getAll(){
		return bugRepository.getAll();
	}
}
