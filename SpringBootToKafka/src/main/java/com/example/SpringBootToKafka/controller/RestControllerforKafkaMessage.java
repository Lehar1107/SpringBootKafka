package com.example.SpringBootToKafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBootToKafka.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerforKafkaMessage {

	@Autowired
	Producer producer;
	
	@GetMapping("/producerMsg")
	
//	public ResponseEntity<String> handleRequest(@RequestParam String message) {
//	//public void getMessageFromClient() {//@RequestParam("message")String message) {
//		return ResponseEntity.ok("Received message: " + message);	
//	}
	
	    public void getMessageFromClient(@RequestParam("message")String message) {
		 producer.sendMessToTopic(message);
			//return ResponseEntity.ok("Received message: " + message);	
		}
	//write like this
	//http://localhost:8080/rest/api/producerMsg?message=%22hii%22
}
