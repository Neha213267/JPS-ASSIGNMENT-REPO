package com.springRESTQ8.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springRESTQ8.model.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product,String>  {
}
