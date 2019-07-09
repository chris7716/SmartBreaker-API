package com.bloom.smartbreaker.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bloom.smartbreaker.models.Module;
import com.bloom.smartbreaker.models.Status;
import com.bloom.smartbreaker.repositories.ModuleRepository;
import com.bloom.smartbreaker.repositories.StatusRepository;
import com.bloom.smartbreaker.utill.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/module")
public class ModuleController {
	
	@Autowired
	ModuleRepository repo;
	
	@PostMapping("/save")
	public Module createStatus(@RequestBody Module module){
		return repo.save(module);
	}
	
	

}
