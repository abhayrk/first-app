package com.firstapp.service;

import java.util.List;

import com.firstapp.model.User;

public interface UserService {

	public User create(User user);
	
	public User delete(int id);
	
	public List findAll();
	
	public User findById(int id);
	
	public User update(User user);
}
