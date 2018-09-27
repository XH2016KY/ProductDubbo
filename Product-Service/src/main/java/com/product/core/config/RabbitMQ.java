package com.product.core.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

	@Bean
	public Queue helloQueue() {
		return new Queue("hello");
	}
	@Bean
	public Queue OkQueue() {
		return new Queue("ok");
	}
}
