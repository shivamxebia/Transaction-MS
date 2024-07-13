package com.onlineBanking.transaction.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {
	
	@GetMapping("health-check")
	ResponseEntity<String> healthCheck(){
		return ResponseEntity.status(HttpStatus.OK).body("Transaction microservice is working");
	}
}
