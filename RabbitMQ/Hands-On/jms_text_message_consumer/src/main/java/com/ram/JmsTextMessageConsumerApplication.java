package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class JmsTextMessageConsumerApplication {

	final static String queueName = "message_queue";

	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(RabbitMQConfig.class);
		MessageReceiver receiver = (MessageReceiver) ctx.getBean("receiver");
		receiver.getCountDownLatch().await(200000, TimeUnit.SECONDS);

	}

}
