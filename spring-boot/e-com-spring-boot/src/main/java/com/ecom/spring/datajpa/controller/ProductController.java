package com.ecom.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.spring.datajpa.model.Product;
import com.ecom.spring.datajpa.repository.ProductRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
	ProductRepository productRepository ;
	
	@PostMapping("/Product")
	public ResponseEntity<Product> createTutorial(@RequestBody Product product) {
		try {
			Product logControl = productRepository
					.save(new Product(product.getName(), product.getPrice(),product.getDetails(),product.getImage()));
			return new ResponseEntity<>(logControl, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getAllTutorials(@RequestParam(required = false) String name) {
		try {
			List<Product> user = new ArrayList<Product>();

			if (name == null)
				productRepository.findAll().forEach(user::add);
			else
				productRepository.findByName(name).forEach(user::add);

			if (user.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(user, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping("/product/{name}")
	public ResponseEntity <List<Product>> getVendorsByName(@PathVariable("name") String name) {
	    List<Product> productName = productRepository.findByName(name);
	    if (!productName.isEmpty()) {
	        return new ResponseEntity<>(productName, HttpStatus.OK);
	    } else {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getById(@PathVariable("id") long id) {
		Optional<Product> productId = productRepository.findById(id);

		if (productId.isPresent()) {
			return new ResponseEntity<>(productId.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
