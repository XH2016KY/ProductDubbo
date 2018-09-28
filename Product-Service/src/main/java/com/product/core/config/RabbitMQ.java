package com.product.core.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <h1>RabbitMQ配置</h1>
 * @author happy everyday
 * 2018年9月28日
 */
@Configuration
public class RabbitMQ {

	@Bean
	public Queue CategoryQueue() {
		return new Queue("prodcutCategory");
	}
	@Bean
	public Queue OkQueue() {
		return new Queue("ok");
	}
}
