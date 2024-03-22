package com.ecom.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.spring.datajpa.model.LogIn;
import com.ecom.spring.datajpa.model.User;


public interface LogInRepository  extends JpaRepository<LogIn, Long>  {
	List<LogIn> findByUserName(String userName);
}
