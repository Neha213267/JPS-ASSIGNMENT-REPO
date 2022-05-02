package com.cs.consumer;

import com.cs.config.MessagingConfig;
import com.cs.model.Customer;
import com.cs.transactions.Trans;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Custconsumer {

	@Autowired
	private Trans transactions;


	@RabbitListener(queues = MessagingConfig.QUEUE)
	public void consumeMessageFromQueue(Customer c) {
		System.out.println("Message recieved from queue : " + c);
		Customer customer = transactions.saveCustomer(c);
	}
}