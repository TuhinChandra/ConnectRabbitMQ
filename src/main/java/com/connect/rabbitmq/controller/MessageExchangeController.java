package com.connect.rabbitmq.controller;

import com.connect.rabbitmq.entity.OrderPickDetails;
import com.connect.rabbitmq.service.OrderPickService;
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

	@Autowired
	private OrderPickService orderPickService;

	@PostMapping("/send")
	public void sendMessage(@RequestParam(value = "input", required = false) final String input) {
		rabbitTemplate.convertAndSend("TestExchange", "testRoutingKey", input);
	}

	@PostMapping("/sendPick")
	public void sendPickMessage(@RequestParam(value = "sapOrderId", required = true) final String sapOrderId,
								@RequestParam(value = "pickId", required = true) final String pickId) {
		OrderPickDetails orderPickDetails = orderPickService.loadOrderPickDetails(sapOrderId,pickId);
		rabbitTemplate.convertAndSend("TestExchange", "testRoutingKey", orderPickDetails);
	}

}
