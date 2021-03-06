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
import org.springframework.web.client.RestTemplate;

import com.bloom.smartbreaker.models.Status;
import com.bloom.smartbreaker.repositories.StatusRepository;
import com.bloom.smartbreaker.utill.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {
	
	@Autowired
	StatusRepository repo;
	
	@PostMapping("/save")
	public Status createStatus(@Valid @RequestBody Status status){
		return repo.save(status);
	}
	
	@GetMapping("/get/{id}")
	public Status getNoteById(@PathVariable(value = "id") Long statusId) {
	    return repo.findById(statusId)
	            .orElseThrow(() -> new ResourceNotFoundException("Status", "id", statusId));
	}
	
	@PutMapping("/update/{id}")
	public Status updateNote(@PathVariable(value = "id") Long statusId,
	                                        @Valid @RequestBody Status statusDetails) {

	    Status status = repo.findById(statusId)
	    		.orElseThrow(() -> new ResourceNotFoundException("Status", "id", statusId));;

	    status.setIsActivated(statusDetails.getIsActivated());
	    status.setLimitation(statusDetails.getLimitation());

	    Status updatedStatus = repo.save(status);
	    return updatedStatus;
	}
	
	public void  saveRmsValue(@RequestParam String id, @RequestParam String value){
		
	}
	
	@GetMapping("/notify")
	public void sendSMS() {
		
		String message = "An over current has been gone through the SmartBreaker module";
		final String uri = "http://220.247.201.241:5000/sms/send_sms.php?username=bloom.lk&password=Blo123M&src=Bloom&dst=94719397748&msg="+message;

	    RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(uri, String.class);

	    System.out.println(result);
	}

}
