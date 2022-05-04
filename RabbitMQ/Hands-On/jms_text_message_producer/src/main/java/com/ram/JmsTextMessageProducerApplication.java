package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JmsTextMessageProducerApplication {

	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		RabbitTemplate rabbitTemplate = (RabbitTemplate) ctx.getBean("rabbitTemplate");

		rabbitTemplate.convertAndSend(queueName, "Hello World!");
		System.out.println("Message has been sent successfully to Queue");

		ctx.close();
	}

}
