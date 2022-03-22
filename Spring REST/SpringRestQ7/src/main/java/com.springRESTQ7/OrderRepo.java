package com.springRESTQ7;

import com.springRESTQ7.Order;
	import org.springframework.data.mongodb.repository.MongoRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface OrderRepo extends MongoRepository<Order,String>
	{

}
