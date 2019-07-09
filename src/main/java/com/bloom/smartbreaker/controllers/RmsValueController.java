package com.bloom.smartbreaker.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bloom.smartbreaker.models.Module;
import com.bloom.smartbreaker.models.RmsValues;
import com.bloom.smartbreaker.repositories.ModuleRepository;
import com.bloom.smartbreaker.repositories.RmsValuesRepository;
import com.bloom.smartbreaker.utill.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/module")
public class RmsValueController {
	
	@Autowired
	RmsValuesRepository repo;
	ModuleRepository moduleRepo;
	
	@GetMapping("/{moduleId}/rms/{rmsValue}")
    public RmsValues createValue(@PathVariable (value = "moduleId") Long moduleId,
    		@PathVariable (value = "rmsValue") String rmsValue) {
		RmsValues values = new RmsValues();
		Module module = new Module();
		
		module.setId(moduleId);
		values.setValue(rmsValue);
		values.setModule(module);
		
            return repo.save(values);
    }
	
	

}
