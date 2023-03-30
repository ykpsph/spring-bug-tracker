package com.example.bugTracker.business.abstracts;

import java.util.List;

import com.example.bugTracker.entities.concretes.Bug;

public interface BugService {
	List<Bug> getAll();
}
