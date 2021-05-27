package com.kafka.consum.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.kafka.consum.model.User;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "ExampleTopic", containerGroup = "group_id")
	public void consume(String message) {
		System.out.println("Consumed message: " + message);
	}

	
	  @KafkaListener(topics = "Kafka_Example_json", containerGroup = "group_json",
	  containerFactory = "userKafkaListenerFactory") public void consumeJson(User
	  user) { System.out.println("Consumed JSON Message: " + user); }
	 
}