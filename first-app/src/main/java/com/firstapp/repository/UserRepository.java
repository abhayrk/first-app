package com.firstapp.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.firstapp.model.User;

public interface UserRepository extends Repository {
	
	void delete(User user);
	
	List findAll();
	
	User findOne(int id);
	
	User save(User user);
	
}
