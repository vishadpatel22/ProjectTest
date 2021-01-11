package com.bucket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import com.bucket.model.BucketInfo;
import com.bucket.repository.BucketInfoRepository;

@RestController
public class BucketRestController {

	@Autowired
	private BucketInfo repository;
	
	@GetMapping("/api/get/{name}")
	public BucketInfo getByName(@PathVariable("name") String name) {
		return repository.retrieve(name);
	}
	
	
	@PostMapping("/api/Create")
	public Employee create(@RequestBody BucketInfo buckinfo) {
		repository.store(buckinfo);
		return buckinfo;
	}

    @PutMapping("/api/Create")
	public Employee create(@RequestBody BucketInfo buckinfo) {
		repository.store(buckinfo);
		return buckinfo;
	}
	
	@DeleteMapping("/api/delete")
	public Employee deleteEmployeeByID(@RequestBody BucketInfo buckinfo) {
		return repository.delete(buckinfo.getName());
	}
}