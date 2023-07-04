package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entites.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	public List<User> findByNameAndCity(String name, String city);
	

}