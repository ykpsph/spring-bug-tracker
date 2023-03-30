package com.example.bugTracker.webAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bugTracker.business.abstracts.BugService;
import com.example.bugTracker.entities.concretes.Bug;

@RestController
@RequestMapping("api/bugs")
public class BugsController {
	
	private BugService bugService;
	
	@Autowired
	public BugsController(BugService bugService) {
		this.bugService = bugService;
	}
	
	@GetMapping("/getall")
	public List<Bug> getAll(){
		return bugService.getAll();
	}
}
