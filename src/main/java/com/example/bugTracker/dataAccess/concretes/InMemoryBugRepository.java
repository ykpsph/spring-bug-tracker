package com.example.bugTracker.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bugTracker.dataAccess.abstracts.BugRepository;
import com.example.bugTracker.entities.concretes.Bug;

@Repository
public class InMemoryBugRepository implements BugRepository {
	
	private List<Bug> bugs;
	
	public InMemoryBugRepository() {
		bugs = new ArrayList<Bug> ();
		bugs.add(new Bug(1001, "archive problem"));
		bugs.add(new Bug(1002, "modify board view for different resolutions"));
		bugs.add(new Bug(1003, "archive can't be deleted"));
		bugs.add(new Bug(1004, "make delete archive easier"));
		bugs.add(new Bug(1005, "@Repository annotation is missing. BugRepository."));
	}

	@Override
	public List<Bug> getAll() {
		// TODO return list of bugs
		
		return bugs;
	}
	
}
