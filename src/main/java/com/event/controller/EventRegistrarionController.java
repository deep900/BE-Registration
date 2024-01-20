/**
 * 
 */
package com.event.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.data.entity.RegistrationEntity;
import com.event.eventmanagement.ApplicationConstants;

/**
 * @author Pradheep
 *
 */
@RestController
public class EventRegistrarionController {
	
	private static final Logger log = LogManager.getLogger(EventRegistrarionController.class);
		
	@PostMapping
	public String registerUser(@RequestBody RegistrationEntity entity) {
		log.info("Received the registration entity" + entity.toString());
		return ApplicationConstants.SUCESS;
	} 
}
