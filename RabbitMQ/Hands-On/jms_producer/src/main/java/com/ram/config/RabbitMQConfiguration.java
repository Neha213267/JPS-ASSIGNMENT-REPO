package com.ram.config;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;

import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
@Component
public class RabbitMQConfiguration {

	public static final String topicExchangeName="message_queue_exchange";

	public static final String queueName="message_queue";

	@Bean
	Queue queue(){
		return new Queue(queueName, false);
	}
@Bean
	TopicExchange exchange(){
		return new TopicExchange(topicExchangeName);
	}
	@Bean
	Binding binding(Queue queue, TopicExchange exchange)
	{
		return BindingBuilder.bind(queue).to(exchange).with("message_routing_key");
	}
	@Bean
	public ConnectionFactory connectionFactory()
	{//creates connection factory object based on given configuration
		CachingConnectionFactory connectionFactory = new CachingConnectionFactory(
				"localhost");
		connectionFactory.setPort(5672);
		connectionFactory.setUsername("guest");
		connectionFactory.setPassword("guest");
		return connectionFactory;
	}

}
