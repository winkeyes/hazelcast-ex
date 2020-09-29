package com.winkeyes.hazelcastex.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.winkeyes.hazelcastex.model.Person;

public interface PersonRespository extends MongoRepository<Person, String>{

	Optional<Person>  findByFname(String fname);
}