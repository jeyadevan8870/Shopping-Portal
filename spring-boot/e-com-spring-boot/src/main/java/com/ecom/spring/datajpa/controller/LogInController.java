package com.ecom.spring.datajpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecom.spring.datajpa.model.LogIn;
import com.ecom.spring.datajpa.model.User;
import com.ecom.spring.datajpa.repository.LogInRepository;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class LogInController {
	@Autowired
	LogInRepository logInRep;
	
	@PostMapping("/logIn")
	public ResponseEntity<LogIn> createTutorial(@RequestBody LogIn log) {
		try {
			LogIn logControl = logInRep
					.save(new LogIn(log.getUserName(), log.getPassword()));
			return new ResponseEntity<>(logControl, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/log")
	public ResponseEntity<List<LogIn>> getAllTutorials(@RequestParam(required = false) String userName) {
		try {
			List<LogIn> log = new ArrayList<LogIn>();

			if (userName == null)
				logInRep.findAll().forEach(log::add);
			else
				logInRep.findByUserName(userName).forEach(log::add);

			if (log.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(log, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
