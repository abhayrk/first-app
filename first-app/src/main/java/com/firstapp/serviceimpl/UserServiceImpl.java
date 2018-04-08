package com.firstapp.serviceimpl;

import java.lang.annotation.Annotation;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstapp.model.User;
import com.firstapp.repository.UserRepository;
import com.firstapp.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User create(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public User delete(int id) {
		User u = findById(id);
		if(u!=null) {
			userRepository.delete(u);
		}
		return u;
	}
	
	@Override
	public List findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findById(int id) {
		return userRepository.findOne(id);
	}
	
	@Override
	public User update(User user) {
		return null;
	}

}
