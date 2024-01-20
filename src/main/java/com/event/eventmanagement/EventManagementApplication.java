package com.event.eventmanagement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventManagementApplication {
	
	private static final Logger log = LogManager.getLogger(EventManagementApplication.class);

	public static void main(String[] args) {
		log.info("Application is starting");
		SpringApplication.run(EventManagementApplication.class, args);
	}

}
