package com.example.demo.service;

import java.util.List;


public interface ICrudService<T,ID> {

	List<T> getAll();
	
	void addOne(T entity);
	
	void updateOne(T entity);
	
	void deleteOne(ID id);
}
