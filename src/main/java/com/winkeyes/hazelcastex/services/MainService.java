package com.winkeyes.hazelcastex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.winkeyes.hazelcastex.repo.PersonRespository;

@Service
public class MainService {
	@Autowired
	public PersonRespository personRespository;
	
	
	@Cacheable("name")
	public String getName(String name) throws InterruptedException {
		return personRespository.findByFname(name).get().toString();
	}

}
