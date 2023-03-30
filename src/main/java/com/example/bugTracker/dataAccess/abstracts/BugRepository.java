package com.example.bugTracker.dataAccess.abstracts;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.bugTracker.entities.concretes.Bug;

@Repository
public interface BugRepository {
	List<Bug> getAll();
}
