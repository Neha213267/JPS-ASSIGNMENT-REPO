package com.ram;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.ram.config.RabbitMQConfiguration;
import com.ram.model.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JmsProducerApplication implements CommandLineRunner {
//defined class application which implements CLR interface
	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {

		SpringApplication.run(JmsProducerApplication.class, args);
	}//and provide implementation of run method
	@Override
	public void run(String... args){
		Product product=new Product();
		product.setProductId(100);
		product.setName("Laptop");
		product.setQuantity(10);
		System.out.println("Sending Message ....");
rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName,
		"message_routing_key", product);
		System.out.println("Message sent successfully......");
	}//So whenever spring boot appn starts this method will be called

}
