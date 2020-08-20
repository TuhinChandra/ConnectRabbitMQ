package com.connect.rabbitmq.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(value = "/message")
public class MessageExchangeController {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@PostMapping("/send")
	public void sendMessage(@RequestParam(value = "input", required = false) final String input) {
		rabbitTemplate.convertAndSend("TestExchange", "testRoutingKey", input);
	}

}
