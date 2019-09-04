package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Produit;
import com.example.demo.entity.User;
import com.example.demo.service.ProduitMockService;
import com.example.demo.service.ProduitService;
import com.example.demo.service.UserService;

@RestController
@RequestMapping(name = "/crud_user")
public class CrudUserController {
	

	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> getUsers(){
		return userService.getAll();
	}
	
	@PostMapping
	public void addUser(@RequestBody User user) {
		userService.addOne(user);
	}
	
	@PutMapping
	public void updateUser(@RequestBody User user) {
		userService.updateOne(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteOne(id);
	}
}
