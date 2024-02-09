package com.example.SpringBootToKafka.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "springtokafka_Topic",groupId= "SpringTOKafka_group")
	public void listenToTopic(String receivedMessage) {
		System.out.println("The message is received" + receivedMessage);
	}
}
