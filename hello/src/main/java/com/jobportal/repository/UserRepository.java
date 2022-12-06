package com.jobportal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.jobportal.model.User;

public interface UserRepository extends MongoRepository<User, String>{
	
	

}
