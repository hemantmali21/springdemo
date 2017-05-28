package com.example.springdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
