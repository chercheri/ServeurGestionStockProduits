package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.UserRepository;
import com.example.demo.entity.Produit;
import com.example.demo.entity.User;

@Service
public class UserService implements ICrudService<User, Long> {

	@Autowired
	private UserRepository userRepository;
	@Override
	public List<User> getAll() {
		return this.userRepository.findAll();
	}

	@Override
	public void addOne(User user) {
		this.userRepository.save(user);
	}

	@Override
	public void updateOne(User entity) {
		this.userRepository.save(entity);
	}

	@Override
	public void deleteOne(Long id) {
		User u = new User();
		u.setId(id);
		this.userRepository.delete(u);
	}

}
