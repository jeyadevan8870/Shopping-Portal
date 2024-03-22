package com.ecom.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.spring.datajpa.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findByUserNameContaining(String userName);

}