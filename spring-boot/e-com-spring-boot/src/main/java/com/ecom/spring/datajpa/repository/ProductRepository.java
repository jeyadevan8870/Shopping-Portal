package com.ecom.spring.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.spring.datajpa.model.Product;




public interface ProductRepository extends JpaRepository<Product, Long>  {
	List<Product> findByName(String name);
}
