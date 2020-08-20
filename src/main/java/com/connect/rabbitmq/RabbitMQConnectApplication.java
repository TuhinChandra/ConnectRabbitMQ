package com.connect.rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RabbitMQConnectApplication {

	public static void main(final String[] args) {
		SpringApplication.run(RabbitMQConnectApplication.class, args);
	}

}
