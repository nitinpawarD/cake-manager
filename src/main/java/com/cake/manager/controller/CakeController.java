package com.cake.manager.controller;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cake.manager.model.Cake;
import com.cake.manager.repository.CakeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CakeController {
	@Autowired
	private CakeRepository cakeRepository;

	@GetMapping("/cakes")
	public List<Cake> getAllCakes() {
		return cakeRepository.findAll();
	}

	@PostMapping("/cakes")
	public Cake createCake(@Valid @RequestBody Cake cake) {
		return cakeRepository.save(cake);
	}

}
